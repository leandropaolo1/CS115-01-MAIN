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
package tests;

import week4.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CondoTest {
    @Test
    public void testCondoGettersAndSetters() {
        Condo condo = new Condo();
        condo.setStreetAddress("123 Main St");
        condo.setZip("12345");
        condo.setBedCount(3);
        condo.setBathCount(2);
        condo.setSqFootage(1200);
        condo.setFloorLvl(5);

        Assert.assertEquals("123 Main St", condo.getStreetAddress());
        Assert.assertEquals("12345", condo.getZip());
        Assert.assertEquals(3, condo.getBedCount());
        Assert.assertEquals(2, condo.getBathCount());
        Assert.assertEquals(1200, condo.getSqFootage());
        Assert.assertEquals(5, condo.getFloorLvl());
    }

    @Test
    public void testNonEmptyCondoConstructor() {
        Condo condo = new Condo("456 Elm St", "67890", 4, 3, 1400, 7);

        Assert.assertEquals("456 Elm St", condo.getStreetAddress());
        Assert.assertEquals("67890", condo.getZip());
        Assert.assertEquals(4, condo.getBedCount());
        Assert.assertEquals(3, condo.getBathCount());
        Assert.assertEquals(1400, condo.getSqFootage());
        Assert.assertEquals(7, condo.getFloorLvl());
    }

    @Test
    public void testEmptyCondoConstructor() {
        Condo condo = new Condo();

        Assert.assertEquals("Property", condo.getStreetAddress());
        Assert.assertEquals("00000", condo.getZip());
        Assert.assertEquals(0, condo.getBedCount());
        Assert.assertEquals(0, condo.getBathCount());
        Assert.assertEquals(0, condo.getSqFootage());
        Assert.assertEquals(0, condo.getFloorLvl());
    }
}
