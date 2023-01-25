/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: abstract DesertItem superclass
 * Lesson Learned: Learned to use an abstract superclass and  using it in subclasses
 * Class: 115-01
 * Date: 24-JAN-2023
 * Assignment: 4a
 * 
 */

package week4;

public abstract class DessertItem {
    private String name;
    private double taxPercent = 7.25;

    // default constructor
    public DessertItem() {
        this.name = "Dessert";
    }

    // constructor with one argument
    public DessertItem(String name) {
        this.name = name;
    }

    // getter method for name attribute
    public String getName() {
        return name;
    }

    // setter method for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // getter method for taxPercent attribute
    public double getTaxPercent() {
        return taxPercent;
    }

    // setter method for taxPercent attribute
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    // abstract method to be implemented by subclasses
    public abstract double calculateCost();

    // method to calculate and return tax for the item
    public double calculateTax() {
        return calculateCost() * (taxPercent / 100);
    }
}
