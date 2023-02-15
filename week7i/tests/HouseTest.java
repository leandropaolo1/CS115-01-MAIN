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

import week7.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class HouseTest {
    @Test
    public void testHouseConstructor() {
        House house = new House("123 Main St", "11111", 3, 2, 1500, 0.75);
        Assert.assertEquals("123 Main St", house.getStreetAddress());
        Assert.assertEquals("11111", house.getZip());
        Assert.assertEquals(3, house.getBedCount());
        Assert.assertEquals(2, house.getBathCount());
        Assert.assertEquals(1500, house.getSqFootage());
        Assert.assertEquals(0.75, house.getYardAcres(), 0.0);
    }

    @Test
    public void testEmptyHouseConstructor() {
        House house = new House();
        Assert.assertEquals("Property", house.getStreetAddress());
        Assert.assertEquals("00000", house.getZip());
        Assert.assertEquals(0, house.getBedCount());
        Assert.assertEquals(0, house.getBathCount());
        Assert.assertEquals(0, house.getSqFootage());
        Assert.assertEquals(0.0, house.getYardAcres(), 0.0);
    }

    @Test
    public void testGetYardAcres() {
        House house = new House();
        Assert.assertEquals(0.0, house.getYardAcres(), 0.0);
    }

    @Test
    public void testSetYardAcres() {
        House house = new House();
        house.setYardAcres(0.5);
        Assert.assertEquals(0.5, house.getYardAcres(), 0.0);
    }
}