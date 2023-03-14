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
import java.lang.Math;


public class House extends Residential {
    private double yardAcres;
    private double listingPrice;

    public House() {
        super();
        this.yardAcres = 0.0;
        this.listingPrice = 0.0;
    }

    public House(
        String streetAddress,
        String zip,
        int bedCount,
        int bathCount,
        int sqFootage,
        double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
        
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }

    public void setListPrice(double listingPrice){
        this.listingPrice = listingPrice;
    }

    @Override
    public int calculateAppraisalPrice(){
        int square_foot = super.getSqFootage();
        int bedrooms = super.getBedCount();
        int bathrooms = super.getBathCount();
        int fullAcre = (int)Math.round(this.yardAcres);
        int total = (square_foot * 97) + (10_000 * bedrooms) + (12_000 * bathrooms) + (46_000 * fullAcre);
        super.setAppraisalPrice(total);

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------------------------------------------------\n");
        sb.append("Residence Type: House           Address: ").append(super.getStreetAddress()).append("           Zip Code: ").append(super.getZip()).append("\n");
        sb.append("-------------------------------------------------------------------------------------------------------\n");
        sb.append("Sq Footage: ").append(super.getSqFootage()).append("\n");
        sb.append("Bedrooms: ").append(super.getBedCount()).append("\n");
        sb.append("Bathrooms: ").append(super.getBathCount()).append("\n");
        sb.append("Yard Size (Acres): ").append(this.yardAcres).append("\n");
        sb.append("------------------------------------------\n");
        sb.append("Appraisal Price: $").append(String.format("%,.2f", (double) super.getAppraisalPrice())).append("\n");
        sb.append("List Price: $").append(String.format("%,.2f", (double) super.getListPrice())).append("\n");
        sb.append("------------------------------------------\n");
        return sb.toString();
    }
}


