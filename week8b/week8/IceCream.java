/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week5b and methods with bold lettering
 * Lesson Learned: In this lab, I learned to override the Object.toString() method of all your classes to output a receipt with bold lettering and extends class
 * Class: 115-01
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */

package week8;

public class IceCream extends DessertItem {
    private int scoopCount;
    private double pricePerScoop;
    private String packaging;

    public IceCream() {
        super("IceCream");
        this.scoopCount = 0;
        this.pricePerScoop = 0;
        setPackaging("");

    }

    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name.trim());

        if (scoopCount >= 0) {
            this.scoopCount = scoopCount;
        }
        if (pricePerScoop >= 0) {
            this.pricePerScoop = pricePerScoop;
        }
        setPackaging("Bowl");

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
    public String getPackaging() {
        return packaging;
    }

    @Override
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        String name = super.getName();
        int scoopCount = (int) Math.round(this.scoopCount);
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s \033[1m(%s)\033[0m \n %d Scoops @ $%.2f/scoop: $%.2f [Tax: $%.2f]", name,getPackaging(), scoopCount,
                this.pricePerScoop,
                cost, tax);
    }

}
