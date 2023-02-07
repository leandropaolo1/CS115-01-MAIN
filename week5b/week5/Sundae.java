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

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;
    private String packaging;

    public Sundae() {
        super();
        this.toppingName = "Topping";
        this.toppingPrice = 0;
        setPackaging("");

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
        setPackaging("Boat");
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
    public String getPackaging() {
        return packaging;
    }

    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        String name = this.getName();
        int scoopCount = (int) Math.round(this.getScoopCount());
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s Sundae \033[1m(%s)\033[0m \n %d scoops of %s @ $%.2f/scoop %s topping @ $%.2f : $%.2f [Tax: $%.2f]", name, getPackaging(), scoopCount, name,
                super.getPricePerScoop(), this.toppingName, this.toppingPrice,
                cost, tax);
    }

}
