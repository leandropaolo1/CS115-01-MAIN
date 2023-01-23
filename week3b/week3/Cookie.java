package week3b.week3;

public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerDozen;

    public Cookie(){
        super();
        this.cookieQty=0;
        this.pricePerDozen=0;
    }

    public Cookie(int quantity, double pricePerDozen, String name){
        super(name.trim());

        if(quantity<0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if(pricePerDozen<0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        
        this.cookieQty=quantity;
        this.pricePerDozen=pricePerDozen;
    }

    public double getQuantity() {
        return cookieQty;
    }

    // setter method for quantity attribute
    public void setQuantity(int quantity) {
        if(quantity<0)
          throw new IllegalArgumentException("Quantity cannot be negative");
        this.cookieQty = quantity;
    }

    // getter method for pricePerDozen attribute
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    // setter method for pricePerDozen attribute
    public void setPricePerDozen(double pricePerDozen) {
        if(pricePerDozen<0)
          throw new IllegalArgumentException("Price per dozen cannot be negative");
        this.pricePerDozen = pricePerDozen;
    }

}
