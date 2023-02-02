/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week5a and methods
 * Lesson Learned: In this lab, I learned to override the Object.toString() method of all your classes to output a receipt
 * Class: 115-01
 * Date: 1-FEB-2023
 * Assignment: 5a
 * 
 */

package week5;

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
