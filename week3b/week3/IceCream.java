package week3b.week3;

public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    public IceCream(){
        super();
        this.scoopCount=0;
        this.pricePerScoop=0;
    }

    public IceCream(int scoopCount, double pricePerScoop, String name){
        super(name.trim());

        if(scoopCount<0){
            throw new IllegalArgumentException("Scoop count cannot be negative");
        }
        if(pricePerScoop<0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        
        this.scoopCount=scoopCount;
        this.pricePerScoop=pricePerScoop;
    }

    public double getScoopCount() {
        return scoopCount;
    }

    // setter method for scoopCount attribute
    public void setScoopCount(int scoopCount) {
        if(scoopCount<0)
        throw new IllegalArgumentException("Scoop count cannot be negative");
        this.scoopCount = scoopCount;
    }

    // getter method for pricePerScoop attribute
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    // setter method for pricePerScoop attribute
    public void setPricePerScoop(double pricePerScoop) {
        if(pricePerScoop<0)
          throw new IllegalArgumentException("Price per scoop cannot be negative");
        this.pricePerScoop = pricePerScoop;
    }

}
