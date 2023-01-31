/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Icecream Subclass with DesertItem superclass
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 30-JAN-2023
 * Assignment: 4b
 * 
 */

package week4;


public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    public IceCream(){
        super("IceCream");
        this.scoopCount=0;
        this.pricePerScoop=0;
    }

    public IceCream(String name, int scoopCount, double pricePerScoop){
        super(name.trim());

        if(scoopCount>=0){
            this.scoopCount=scoopCount;
        }
        if(pricePerScoop>=0){
            this.pricePerScoop=pricePerScoop;
        }
        
    }

    public double getScoopCount() {
        return scoopCount;
    }

    // setter method for scoopCount attribute
    public void setScoopCount(int scoopCount) {
        if(scoopCount>=0){
            this.scoopCount = scoopCount;

        }
    }

    // getter method for pricePerScoop attribute
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    // setter method for pricePerScoop attribute
    public void setPricePerScoop(double pricePerScoop) {
        if(pricePerScoop>=0){
            this.pricePerScoop = pricePerScoop;
        }
    }

    @Override
    public double calculateCost() {
        return scoopCount * pricePerScoop;
    }

}
