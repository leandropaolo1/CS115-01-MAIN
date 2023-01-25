/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Sundae Subclass with Icream and DesertItem superclass
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 24-JAN-2023
 * Assignment: 4a
 * 
 */

package week4;


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
            this.toppingName=toppingName;

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

}
