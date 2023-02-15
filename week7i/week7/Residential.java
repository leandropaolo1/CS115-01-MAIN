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

public abstract class Residential extends Property {
    private int bedCount;
    private int bathCount;
    private int sqFootage;
    private int levelCount;

    public Residential() {
        super();
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
        this.levelCount = 1;
    }

    public Residential(String streetAddress, String zip, int bedCount, int bathCount, int sqFootage, int levelCount) {
        super(streetAddress, zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
        this.levelCount = levelCount;
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

    public int getLevelCount(){
        return levelCount;
    }
    
    public void setLevelCount(int levelCount){
        this.levelCount = levelCount;

    }

    public abstract double calculateAppraisalPrice();

}
