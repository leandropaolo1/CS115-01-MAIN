/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
I  created an interface and a class that implements the interface to store the list of residential properties that our Real Estate Office has listed for sale. This will allow us to keep track of all the properties that we are currently under contract to sell. 
 * Class: 115-01
 * Date: 13-MAR-2023
 * Assignment: 9i
 * 
 */
package week9;
import java.lang.Math;


public class House extends Residential {
    private double yardAcres;

    public House() {
        super();
        this.yardAcres = 0.0;
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
        calculateAppraisalPrice();
        
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }

    @Override
    public void setListPrice(double listingPrice){
        super.setListPrice(listingPrice);
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
        sb.append("Residence Type: House | Address: ").append(super.getStreetAddress()).append("| Zip Code: ").append(super.getZip()).append("\n");
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


