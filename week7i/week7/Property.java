/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 1-FEB-2023
 * AssignmentL 4i
 * 
 */
package week7;

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

    public Double getListPrice() {
        return listPrice;
    }

    public Double getAppraisalPrice() {
        return appraisalPrice;
    }

    protected void setListPrice(double listPrice){
        this.listPrice = listPrice;
    }

    public abstract double calculateAppraisalPrice();

}