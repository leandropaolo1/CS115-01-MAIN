/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: IceCream Subclass that extendends from DessertItem
 * Lesson Learned: Learned to create a subclass
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 3a
 * 
 */
package week3;


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

}
