/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Icecream Test using Junit
 * Lesson Learned: Learned to test an abstract superclass and overridding method with Junit and comparable generics
 * Class: 115-01
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */
package tests;

import org.junit.jupiter.api.Test;

import week8.*;

import org.junit.Assert;

public class IceCreamTest {

    private void assertIceCream(
            String expectedName,
            int expectedScoopCount,
            double expectedPricePerScoop,
            IceCream iceCream) {
        Assert.assertEquals(expectedName, iceCream.getName());
        Assert.assertEquals(expectedPricePerScoop, iceCream.getPricePerScoop(), 0.01);
        Assert.assertEquals(expectedScoopCount, iceCream.getScoopCount(), 0.01);

    }

    @Test
    public void testDefaultConstructor() {
        IceCream iceCream = new IceCream();
        assertIceCream(
                "IceCream",
                0,
                0,
                iceCream);
    }

    @Test
    public void testConstructorWithArguments() {
        IceCream iceCream = new IceCream("Chocolate", 1, 1.0);
        assertIceCream(
                "Chocolate",
                1,
                1.0,
                iceCream);
    }

    @Test
    public void testGetScoopCount() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                3.50);
        Assert.assertEquals(1, IceCream.getScoopCount(), 0.1);
    }

    @Test
    public void testsetScoopCount() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                0,
                3.50);
        IceCream.setScoopCount(1);
        Assert.assertEquals(1, IceCream.getScoopCount(), 0.1);
    }

    @Test
    public void testGetPricePerScoop() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                3.50);
        Assert.assertEquals(3.50, IceCream.getPricePerScoop(), 0.1);
    }

    @Test
    public void testSetPricePerScoop() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                0);
        IceCream.setPricePerScoop(0.50);
        Assert.assertEquals(0.50, IceCream.getPricePerScoop(), 0.1);
    }

    @Test
    public void testSetPricePerScoopNegative() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                0);
        IceCream.setPricePerScoop(-1);
        Assert.assertNotEquals(-1, IceCream.getPricePerScoop(), 0.1);
    }

    @Test
    public void testSetScoopCountNegative() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                0);
        IceCream.setScoopCount(-1);
        Assert.assertNotEquals(-1, IceCream.getPricePerScoop(), 0.1);
    }

    public void testCalculateCost() {
        IceCream IceCream = new IceCream("Chocolate", 2, 3.5);
        double expectedCost = 2 * 3.5;
        Assert.assertEquals(expectedCost, IceCream.calculateCost(), 0.001);
    }
}