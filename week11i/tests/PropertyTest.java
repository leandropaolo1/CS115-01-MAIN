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

public class PropertyTest {

    @Test
    public void testCalculateAppraisalPrice() {
        House house = new House();
        house.setStreetAddress("123 Main St");
        house.setZip("12345");
        house.setBedCount(1);
        house.setBathCount(1);
        house.setSqFootage(1);
        house.setYardAcres(1);
        int expectedAppraisalPrice = 20_000;
        int actualAppraisalPrice = house.calculateAppraisalPrice();
        Assert.assertEquals(expectedAppraisalPrice, actualAppraisalPrice);
    }

}
