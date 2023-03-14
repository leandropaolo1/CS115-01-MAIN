/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
I created an interface and a class that implements the interface to store the list of residential properties that our Real Estate Office has listed for sale. This will allow us to keep track of all the properties that we are currently under contract to sell. 
 * Class: 115-01
 * Date: 13-MAR-2023
 * Assignment: 9i
 * 
 */
package week9;

public abstract class Property {
    private String streetAddress;
    private String zip;
    private double listPrice=0.0;
    private double appraisalPrice=0.0;

    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public Property() {
        this.streetAddress = "Property";
        this.zip = "00000";

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getAppraisalPrice(){
        return this.appraisalPrice;
    }


    protected void setAppraisalPrice(int appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }
    
    public double getListPrice(){
        return this.listPrice;
    }


    public abstract int calculateAppraisalPrice();

    public void setListPrice(double listingPrice) {
        this.listPrice = listingPrice;
    }
}