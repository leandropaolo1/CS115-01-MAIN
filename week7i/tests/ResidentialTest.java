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

package tests;

import week7.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class ResidentialTest {

    @Test
    public void testResidentialConstructor() {
        Residential residential = new Residential("123 Main St", "11111", 3, 2, 1500);
        Assert.assertEquals("123 Main St", residential.getStreetAddress());
        Assert.assertEquals("11111", residential.getZip());
        Assert.assertEquals(3, residential.getBedCount());
        Assert.assertEquals(2, residential.getBathCount());
        Assert.assertEquals(1500, residential.getSqFootage());
    }

    @Test
    public void testEmptyResidentialConstructor() {
        Residential residential = new Residential();
        Assert.assertEquals("Property", residential.getStreetAddress());
        Assert.assertEquals("00000", residential.getZip());
        Assert.assertEquals(0, residential.getBedCount());
        Assert.assertEquals(0, residential.getBathCount());
        Assert.assertEquals(0, residential.getSqFootage());
    }

    @Test
    public void testGetBedCount() {
        Residential residential = new Residential();
        Assert.assertEquals(0, residential.getBedCount());
    }

    @Test
    public void testSetBedCount() {
        Residential residential = new Residential();
        residential.setBedCount(3);
        Assert.assertEquals(3, residential.getBedCount());
    }

    @Test
    public void testGetBathCount() {
        Residential residential = new Residential();
        Assert.assertEquals(0, residential.getBathCount());
    }

    @Test
    public void testSetBathCount() {
        Residential residential = new Residential();
        residential.setBathCount(2);
        Assert.assertEquals(2, residential.getBathCount());
    }

    @Test
    public void testGetSqFootage() {
        Residential residential = new Residential();
        Assert.assertEquals(0, residential.getSqFootage());
    }

    @Test
    public void testSetSqFootage() {
        Residential residential = new Residential();
        residential.setSqFootage(1000);
        Assert.assertEquals(1000, residential.getSqFootage());
    }
}
