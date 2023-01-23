/*
 * Student: Leandro Cooper
 * Class: 115-01
 * Date: 22-JAN-2023
 */

package week3;


public class Candy extends DessertItem{
    private double candyWeight;
    private double pricePerPound;

    public Candy(){
        super();
        this.candyWeight=0;
        this.pricePerPound=0;
    }

    public Candy(String name, Double weight, double pricePerPound){
        super(name.trim());

        if(weight<0){
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        if(pricePerPound<0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        
        this.candyWeight=weight;
        this.pricePerPound=pricePerPound;
    }

    public double getWeight() {
        return candyWeight;
    }

    // setter method for weight attribute
    public void setWeight(double weight) {
        if(weight<0)
          throw new IllegalArgumentException("Weight cannot be negative");
        this.candyWeight = weight;
    }

    // getter method for pricePerPound attribute
    public double getPricePerPound() {
        return pricePerPound;
    }

    // setter method for pricePerPound attribute
    public void setPricePerPound(double pricePerPound) {
        if(pricePerPound<0)
          throw new IllegalArgumentException("Price per pound cannot be negative");
        this.pricePerPound = pricePerPound;
    }

}
