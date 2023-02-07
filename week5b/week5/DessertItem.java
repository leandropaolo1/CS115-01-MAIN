/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week5b and methods with bold lettering
 * Lesson Learned: In this lab, I learned to override the Object.toString() method of all your classes to output a receipt with bold lettering and extends class
 * Class: 115-01
 * Date: 6-FEB-2023
 * Assignment: 5b
 * 
 */


package week5;
import main.Packaging;

public abstract class DessertItem implements Packaging {
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
}
