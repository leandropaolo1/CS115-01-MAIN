/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: SuperClass that extendends from DessertItem
 * Lesson Learned: Learned to create a subclass
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 4a
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
