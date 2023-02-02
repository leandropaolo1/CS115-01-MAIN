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

public class IceCream extends DessertItem {
    private int scoopCount;
    private double pricePerScoop;

    public IceCream() {
        super("IceCream");
        this.scoopCount = 0;
        this.pricePerScoop = 0;
    }

    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name.trim());

        if (scoopCount >= 0) {
            this.scoopCount = scoopCount;
        }
        if (pricePerScoop >= 0) {
            this.pricePerScoop = pricePerScoop;
        }

    }

    public double getScoopCount() {
        return scoopCount;
    }

    // setter method for scoopCount attribute
    public void setScoopCount(int scoopCount) {
        if (scoopCount >= 0) {
            this.scoopCount = scoopCount;

        }
    }

    // getter method for pricePerScoop attribute
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    // setter method for pricePerScoop attribute
    public void setPricePerScoop(double pricePerScoop) {
        if (pricePerScoop >= 0) {
            this.pricePerScoop = pricePerScoop;
        }
    }

    @Override
    public double calculateCost() {
        return scoopCount * pricePerScoop;
    }

    @Override
    public String toString() {
        String name = super.getName();
        int scoopCount = (int) Math.round(this.scoopCount);
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s \n %d Scoops @ $%.2f/scoop: $%.2f [Tax: $%.2f]", name, scoopCount,
                this.pricePerScoop,
                cost, tax);
    }

}
