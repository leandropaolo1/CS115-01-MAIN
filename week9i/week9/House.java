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

    public House() {
        super();
        this.yardAcres = 0.0;
    }

    public House(String streetAddress, String zip, int bedCount, int bathCount, int sqFootage, double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
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

}

