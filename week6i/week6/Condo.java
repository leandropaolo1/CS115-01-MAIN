/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 15-FEB-2023
 * AssignmentL 7i
 * 
 */
package week6;

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
    public int calculateAppraisalPrice(){
        int square_foot = super.getSqFootage();
        int bedrooms = super.getBedCount();
        int bathrooms = super.getBathCount();
        int fullFloor = (int)Math.round(this.floorLevel);
        int total = (square_foot * 88) + (8_000 * bedrooms) + (10_000 * bathrooms) + (5_000 * fullFloor);
        
        super.setAppraisalPrice(total);

        return total;
    }       
}