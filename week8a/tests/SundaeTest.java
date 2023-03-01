/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Sundae Test using Junit
 * Lesson Learned: Learned to test an abstract superclass and overridding method with Junit and comparable generics
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7a
 * 
 */
package tests;

import org.junit.jupiter.api.Test;

import week8.*;

import org.junit.Assert;

public class SundaeTest {

    private void assertSundae(
            String expectedName,
            String expectedToppingName,
            double expectedScoopCost,
            double expectedToppingPrice,
            int expectedScoopCount,
            Sundae sundae) {

        Assert.assertEquals(expectedName, sundae.getName());
        Assert.assertEquals(expectedToppingName, sundae.getToppingName());
        Assert.assertEquals(expectedScoopCost, sundae.getPricePerScoop(), 0.01);
        Assert.assertEquals(expectedToppingPrice, sundae.getToppingPrice(), 0.01);
    }

    @Test
    public void testDefaultConstructor() {
        Sundae sundae = new Sundae();
        assertSundae(
                "IceCream",
                "Topping",
                0,
                0,
                0,
                sundae);
    }

    @Test
    public void testConstructorWithArguments() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "Chocolate Syrup",
                0.50);

        assertSundae(
                "Chocolate Sundae",
                "Chocolate Syrup",
                3.50,
                0.50,
                1,
                sundae);
    }

    @Test
    public void testGetToppingName() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "Chocolate Syrup",
                0.50);
        Assert.assertEquals("Chocolate Syrup", sundae.getToppingName());
    }

    @Test
    public void testSetToppingName() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "",
                0.50);
        sundae.setToppingName("Chocolate Syrup");
        Assert.assertEquals("Chocolate Syrup", sundae.getToppingName());
    }
    
    @Test
    public void testGetToppingPrice() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "Chocolate Syrup",
                0.50);
        Assert.assertEquals(0.50, sundae.getToppingPrice(),0.1);
    }

    @Test
    public void testSetToppingPrice() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "Chocolate Syrup",
                0);
        sundae.setToppingPrice(0.50);
        Assert.assertEquals(0.50, sundae.getToppingPrice(),0.1);
    }

    @Test
    public void testSetToppingPriceNegative() {
        Sundae sundae = new Sundae(
                "Chocolate Sundae",
                1,
                3.50,
                "Chocolate Syrup",
                0);
        sundae.setToppingPrice(-1);
        Assert.assertNotEquals(-1, sundae.getToppingPrice(),0.1);
    }

    public void testCalculateCost() {
        Sundae sundae = new Sundae("Chocolate", 2, 3.5, "Sparkles", 1);
        double expectedCost = 2 * 3.5+1;
        Assert.assertEquals(expectedCost, sundae.calculateCost(), 0.001);
    }
}