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

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;

    public Sundae() {
        super();
        this.toppingName = "Topping";
        this.toppingPrice = 0;
    }

    public Sundae(
            String name,
            int scoopCount,
            double pricePerScoop,
            String toppingName,
            double toppingPrice) {

        super(name.trim(), scoopCount, pricePerScoop);
        if (super.getName().trim().equals("")) {
            super.setName("Sundae");
        }

        if (toppingPrice >= 0) {
            this.toppingPrice = toppingPrice;
        }

        this.toppingName = toppingName;
    }

    public String getToppingName() {
        return toppingName;
    }

    // setter method for toppingName attribute
    public void setToppingName(String toppingName) {
        if (toppingName.length() >= 0)
            this.toppingName = toppingName;

    }

    // getter method for toppingPrice attribute
    public double getToppingPrice() {
        return toppingPrice;
    }

    // setter method for toppingPrice attribute
    public void setToppingPrice(double toppingPrice) {
        if (toppingPrice >= 0)
            this.toppingPrice = toppingPrice;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + this.toppingPrice;
    }

    @Override
    public String toString() {
        String name = this.getName();
        int scoopCount = (int) Math.round(this.getScoopCount());
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s Sundae \n %d scoops of %s @ $%.2f/scoop %s topping @ $%.2f : $%.2f [Tax: $%.2f]", name, scoopCount, name,
                super.getPricePerScoop(), this.toppingName, this.toppingPrice,
                cost, tax);
    }

}
