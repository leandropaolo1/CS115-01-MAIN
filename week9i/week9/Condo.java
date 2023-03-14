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

public class Condo extends Residential {
    private int floorLevel;

    public Condo() {
        super();
        this.floorLevel = 0;

    }

    public Condo(String streetAddress, String zip, int bedCount, int bathCount, int sqFootage, int floorLevel) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.floorLevel = floorLevel;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel= floorLevel;
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
        int fullFloor = (int)Math.round(this.floorLevel);
        int total = (square_foot * 88) + (8_000 * bedrooms) + (10_000 * bathrooms) + (5_000 * fullFloor);
        
        super.setAppraisalPrice(total);

        return total;
    }       

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------------------------------------------------\n");
        sb.append("Residence Type: Condo | Address: ").append(super.getStreetAddress()).append(" | Zip Code: ").append(super.getZip()).append("\n");
        sb.append("-------------------------------------------------------------------------------------------------------\n");
        sb.append("Sq Footage: ").append(super.getSqFootage()).append("\n");
        sb.append("Bedrooms: ").append(super.getBedCount()).append("\n");
        sb.append("Bathrooms: ").append(super.getBathCount()).append("\n");
        sb.append("------------------------------------------\n");
        sb.append("Appraisal Price: $").append(String.format("%,.2f", (double) super.getAppraisalPrice())).append("\n");
        sb.append("List Price: $").append(String.format("%,.2f", (double) super.getListPrice())).append("\n");
        sb.append("------------------------------------------\n");
        return sb.toString();
    }
}