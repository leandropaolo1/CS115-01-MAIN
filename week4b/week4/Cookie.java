/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Cookie Subclass with DesertItem superclass
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 30-JAN-2023
 * Assignment: 4b
 * 
 */

package week4;


public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerDozen;

    public Cookie(){
        super("Cookie");
        this.cookieQty=0;
        this.pricePerDozen=0;
    }

    public Cookie(String name, int quantity, double pricePerDozen){
        super(name.trim());

        if(quantity>=0){
            this.cookieQty=quantity;
        }
        if(pricePerDozen>=0){
            this.pricePerDozen=pricePerDozen;
        }
        
    }

    public double getQuantity() {
        return cookieQty;
    }

    // setter method for quantity attribute
    public void setQuantity(int quantity) {
        if(quantity>=0){
            this.cookieQty = quantity;
        }
    }

    // getter method for pricePerDozen attribute
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    // setter method for pricePerDozen attribute
    public void setPricePerDozen(double pricePerDozen) {
        if(pricePerDozen>=0){
            this.pricePerDozen = pricePerDozen;
        };
        
    }

    @Override
    public double calculateCost() {
        return cookieQty * pricePerDozen;
    }

}
