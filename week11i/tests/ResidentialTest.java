/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
I created an interface and a class that implements the interface to store the list of residential properties that our Real Estate Office has listed for sale. This will allow us to keep track of all the properties that we are currently under contract to sell. 
 * Class: 115-01
 * Date: 13-MAR-2023
 * Assignment: 9i
 * 
 */

package tests;

import org.junit.jupiter.api.Test;

import week9.*;

import org.junit.Assert;

public class ResidentialTest {

    @Test
    public void testResidentialConstructor() {

        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        Assert.assertEquals("123 Main St", residential.getStreetAddress());
        Assert.assertEquals("11111", residential.getZip());
        Assert.assertEquals(3, residential.getBedCount());
        Assert.assertEquals(2, residential.getBathCount());
        Assert.assertEquals(1500, residential.getSqFootage());
    }

    @Test
    public void testEmptyResidentialConstructor() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        Assert.assertEquals("Property", residential.getStreetAddress());
        Assert.assertEquals("00000", residential.getZip());
        Assert.assertEquals(0, residential.getBedCount());
        Assert.assertEquals(0, residential.getBathCount());
        Assert.assertEquals(0, residential.getSqFootage());
    }

    @Test
    public void testGetBedCount() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        Assert.assertEquals(1, residential.getBedCount());
    }

    @Test
    public void testSetBedCount() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        residential.setBedCount(3);
        Assert.assertEquals(3, residential.getBedCount());
    }

    @Test
    public void testGetBathCount() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        Assert.assertEquals(1, residential.getBathCount());
    }

    @Test
    public void testSetBathCount() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        residential.setBathCount(2);
        Assert.assertEquals(2, residential.getBathCount());
    }

    @Test
    public void testGetSqFootage() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        Assert.assertEquals(1, residential.getSqFootage());
    }

    @Test
    public void testSetSqFootage() {
        House residential = new House("123 Main St", "11111", 1, 1, 1, 1.0);
        residential.setSqFootage(1000);
        Assert.assertEquals(1000, residential.getSqFootage());
    }
}
