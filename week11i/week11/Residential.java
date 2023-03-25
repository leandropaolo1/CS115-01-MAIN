/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 06-MAR-2023
 * AssignmentL 8i
 * 
 */
package week11;

public abstract class Residential extends Property {
    private int bedCount;
    private int bathCount;
    private int sqFootage;

    public Residential() {
        super();
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }

    public Residential(String streetAddress, String zip, int bedCount, int bathCount, int sqFootage) {
        super(streetAddress, zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getBathCount() {
        return bathCount;
    }

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount;
    }

    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }

    public abstract int calculateAppraisalPrice();

}
