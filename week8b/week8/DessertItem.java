/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
Lesson Learned: We added the admin module to help the desert shop owner * Lesson Learned: How to implement a Admin module and prompts.
 * Class: 115-01
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */


package week8;
import main.Packaging;

public abstract class DessertItem implements Packaging, Comparable<DessertItem> {
    private String name;
    private double taxPercent = 7.25;
    private String packaging;

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

    // getter method for packaging attribute
    @Override
    public String getPackaging() {
        return packaging;
    }

    // setter method for packaging attribute
    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    // abstract method to be implemented by subclasses
    public abstract double calculateCost();

    // method to calculate and return tax for the item
    public double calculateTax() {
        return calculateCost() * (taxPercent / 100);
    }

    @Override
    public int compareTo(DessertItem some_other_Item) {
        if (calculateCost() < some_other_Item.calculateCost()) {
            return -1;
        } else if (calculateCost() > some_other_Item.calculateCost()) {
            return 1;
        } else {
            return 0;
        }
    }
}
