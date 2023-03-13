/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Class that implements the java generics
 * Lesson Learned: In this lab, I learned to use Generic within a class
 * Date: 15-FEB-2023
 * Assignment: 7b
 * 
 */


package week7;
import main.SameItem;

public class Candy extends DessertItem implements SameItem<Candy> {
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
    public boolean isSameAs(Candy some_other_candy_object_to_compare) {
        String name = getName();
        Boolean same_information;
        same_information = name.equals(some_other_candy_object_to_compare.getName()
        ) && this.pricePerPound == some_other_candy_object_to_compare.getPricePerPound();
        return same_information;
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
