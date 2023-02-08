/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Candy Subclass that extendends from DessertItem
 * Lesson Learned: Learned to create a subclass
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 3a
 * 
 */

package week3;


public class Candy extends DessertItem{
    private double candyWeight;
    private double pricePerPound;

    public Candy(){
        super("Candy");
        this.candyWeight=0;
        this.pricePerPound=0;
    }

    public Candy(String name, Double weight, double pricePerPound){
        super(name.trim());

        if(weight>=0){
            this.candyWeight=weight;
        }
        if(pricePerPound>=0){
            this.pricePerPound=pricePerPound;
        }
        
    }

    public double getWeight() {
        return candyWeight;
    }

    // setter method for weight attribute
    public void setWeight(double weight) {
        if(weight>=0)
            this.candyWeight = weight;
    }

    // getter method for pricePerPound attribute
    public double getPricePerPound() {
        return pricePerPound;
    }

    // setter method for pricePerPound attribute
    public void setPricePerPound(double pricePerPound) {
        if(pricePerPound>=0)
            this.pricePerPound = pricePerPound;
    }

}
