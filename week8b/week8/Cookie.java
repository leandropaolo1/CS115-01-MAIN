/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Class that implements the java generics
 * Lesson Learned: In this lab, I learned to use Generic within a class
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */


package week8;
import java.lang.Math;
import main.SameItem;

public class Cookie extends DessertItem implements SameItem<Cookie> {
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

    public int getQuantity() {
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
        double result = cookieQty * (Math.round(pricePerDozen/12 * 100.0) / 100.0);
        return result;
    }

    @Override
    public boolean isSameAs(Cookie some_other_cookie_object_to_compare) {
        String name = getName();
        Boolean same_information;
        same_information = name.equals(some_other_cookie_object_to_compare.getName()
        ) && this.pricePerDozen == some_other_cookie_object_to_compare.getPricePerDozen();
        return same_information;
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
