/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7a
 * 
 */


package week7;
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
