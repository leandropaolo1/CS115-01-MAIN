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


package week6;

public class Cookie extends DessertItem {
    private int cookieQty;
    private double pricePerDozen;
    private String packaging;

    public Cookie() {
        super("Cookie");
        this.cookieQty = 0;
        this.pricePerDozen = 0;
        setPackaging("");

    }

    public Cookie(String name, int quantity, double pricePerDozen) {
        super(name.trim());

        if (quantity >= 0) {
            this.cookieQty = quantity;
        }
        if (pricePerDozen >= 0) {
            this.pricePerDozen = pricePerDozen;
        }
        setPackaging("Box");

    }

    public double getQuantity() {
        return cookieQty;
    }

    // setter method for quantity attribute
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.cookieQty = quantity;
        }
    }

    // getter method for pricePerDozen attribute
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    // setter method for pricePerDozen attribute
    public void setPricePerDozen(double pricePerDozen) {
        if (pricePerDozen >= 0) {
            this.pricePerDozen = pricePerDozen;
        }

    }

    @Override
    public String getPackaging() {
        return packaging;
    }

    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public double calculateCost() {
        return cookieQty * pricePerDozen;
    }

    @Override
    public String toString() {
        String name = super.getName();
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        int qty = (int) Math.round(this.cookieQty);
        return String.format("%s \033[1m(%s)\033[0m \n %d cookies @ $%.2f/dozen.: $%.2f [Tax: $%.2f]", name, getPackaging(), qty,
                this.pricePerDozen, cost, tax);
    }

}
