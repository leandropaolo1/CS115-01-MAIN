/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 12-MAR-2023
 * Assignment: 9i
 * 
 */
package week9;

public abstract class Property {
    private String streetAddress;
    private String zip;
    private int listPrice=0;
    private int appraisalPrice=0;

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

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice){
        this.listPrice = listPrice;
    }

    public int getAppraisalPrice() {
        return appraisalPrice;
    }

    protected void setAppraisalPrice(int appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }

    public abstract int calculateAppraisalPrice();

}