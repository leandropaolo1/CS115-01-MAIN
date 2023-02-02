/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Candy Subclass with DesertItem superclass
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 30-JAN-2023
 * Assignment: 4b
 * 
 */

package week5;

public class Candy extends DessertItem {
    private double candyWeight;
    private double pricePerPound;

    public Candy() {
        super("Candy");
        this.candyWeight = 0;
        this.pricePerPound = 0;
    }

    public Candy(String name, Double weight, double pricePerPound) {
        super(name.trim());

        if (weight >= 0) {
            this.candyWeight = weight;
        }
        if (pricePerPound >= 0) {
            this.pricePerPound = pricePerPound;
        }

    }

    public double getWeight() {
        return candyWeight;
    }

    // setter method for weight attribute
    public void setWeight(double weight) {
        if (weight >= 0)
            this.candyWeight = weight;
    }

    // getter method for pricePerPound attribute
    public double getPricePerPound() {
        return pricePerPound;
    }

    // setter method for pricePerPound attribute
    public void setPricePerPound(double pricePerPound) {
        if (pricePerPound >= 0)
            this.pricePerPound = pricePerPound;
    }

    @Override
    public double calculateCost() {
        return candyWeight * pricePerPound;
    }

    @Override
    public String toString() {
        String name = this.getName();
        int weight = (int) Math.round(this.getWeight());
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s \n%d @ $%.2f/lb: $%.2f [Tax: $%.2f]", name, weight,
                this.pricePerPound,
                cost, tax);
    }

}
