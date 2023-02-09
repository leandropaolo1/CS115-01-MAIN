/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Candy Test using Junit
 * Lesson Learned: Learned to test an abstract superclass and overridding method with Junit
 * Class: 115-01
 * Date: 24-JAN-2023
 * Assignment: 4a
 * 
 */

package tests;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import week6.*;

public class CandyTest {

    private void assertCandy(
            String expectedName,
            int expectedQuantity,
            double expectedPricePerDozen,
            Candy Candy) {
        Assert.assertEquals(expectedName, Candy.getName());
        Assert.assertEquals(expectedPricePerDozen, Candy.getPricePerPound(), 0.01);
        Assert.assertEquals(expectedQuantity, Candy.getWeight(), 0.01);

    }

    @Test
    public void testDefaultConstructor() {
        Candy Candy = new Candy();
        assertCandy(
                "Candy",
                0,
                0,
                Candy);
    }

    @Test
    public void testConstructorWithArguments() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);
        assertCandy(
                "Chocolate",
                1,
                1.0,
                Candy);
    }

    @Test
    public void testGetWeight() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);

        Assert.assertEquals(1, Candy.getWeight(), 0.1);
    }

    @Test
    public void testSetWeight() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);

        Candy.setWeight(1);
        Assert.assertEquals(1, Candy.getWeight(), 0.1);
    }

    @Test
    public void testGetPricePerPound() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);
        Assert.assertEquals(1, Candy.getPricePerPound(), 0.1);
    }



    @Test
    public void testSetPricePerPound() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);

        Candy.setPricePerPound(0.50);
        Assert.assertEquals(0.50, Candy.getPricePerPound(), 0.1);
    }

    @Test
    public void testPricePerPoundNegative() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);
        Candy.setPricePerPound(-1);
        Assert.assertNotEquals(-1, Candy.getWeight(), 0.1);
    }
    @Test
    public void testSetWeightNegative() {
        Candy Candy = new Candy("Chocolate", 1.0, 1.0);

        Candy.setWeight(-1);
        Assert.assertNotEquals(-1, Candy.getWeight(), 0.1);
    }

    @Test
    public void testCalculateCost() {
        Candy candy = new Candy("Chocolate", 2.0, 3.5);
        double expectedCost = 2 * 3.5;
        Assert.assertEquals(expectedCost, candy.calculateCost(), 0.001);
    }


}
