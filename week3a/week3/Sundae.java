/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Candy Subclass that extendends from IceCream
 * Lesson Learned: Learned to create a subclass
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 3a
 * 
 */
package week3;


public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;

    public Sundae() {
        super();
        this.toppingName = "";
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
        if (toppingName.length() < 0)
            throw new IllegalArgumentException("Topping Name cannot be blank");

        if (toppingPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public String getToppingName() {
        return toppingName;
    }

    // setter method for toppingName attribute
    public void setToppingName(String toppingName) {
        if (toppingName.length() < 0)
            throw new IllegalArgumentException("Topping Name cannot be blank");

        this.toppingName = toppingName;
    }

    // getter method for toppingPrice attribute
    public double getToppingPrice() {
        return toppingPrice;
    }

    // setter method for toppingPrice attribute
    public void setToppingPrice(double toppingPrice) {
        if (toppingPrice < 0)
            throw new IllegalArgumentException("Price per scoop cannot be negative");
        this.toppingPrice = toppingPrice;
    }

}
