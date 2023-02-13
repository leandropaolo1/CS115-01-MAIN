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

public class Candy extends DessertItem{
    private double candyWeight;
    private double pricePerPound;
    private String packaging;

    public Candy() {
        super("Candy");
        this.candyWeight = 0;
        this.pricePerPound = 0;
        setPackaging("");
    }

    public Candy(String name, Double weight, double pricePerPound) {
        super(name.trim());

        if (weight >= 0) {
            this.candyWeight = weight;
        }
        if (pricePerPound >= 0) {
            this.pricePerPound = pricePerPound;
        }
        setPackaging("Bag");
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
        int weight = (int) Math.round(this.getWeight());
        double cost = this.calculateCost();
        double tax = this.calculateTax();
        return String.format("%s \033[1m(%s)\033[0m  \n%d @ $%.2f/lb: $%.2f [Tax: $%.2f]", name, getPackaging(), weight,
                this.pricePerPound,
                cost, tax);
    }

}
