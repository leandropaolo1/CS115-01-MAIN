/*
 * Student: Leandro Cooper
 * Class: 115-01
 * Date: 22-JAN-2023
 */
package week3b.tests;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import week3b.week3.IceCream;

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
                "",
                0,
                0,
                iceCream);
    }

    @Test
    public void testConstructorWithArguments() {
        IceCream iceCream = new IceCream("Chocolate", 1,1.0);
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
        Assert.assertEquals(1, IceCream.getScoopCount(),0.1);
    }

    @Test
    public void testsetScoopCount() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                0,
                3.50);
        IceCream.setScoopCount(1);
        Assert.assertEquals(1, IceCream.getScoopCount(),0.1);
    }
    
    @Test
    public void testGetPricePerScoop() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                3.50);
        Assert.assertEquals(3.50, IceCream.getPricePerScoop(),0.1);
    }

    @Test
    public void testSetPricePerScoop() {
        IceCream IceCream = new IceCream(
                "Chocolate IceCream",
                1,
                0);
        IceCream.setPricePerScoop(0.50);
        Assert.assertEquals(0.50, IceCream.getPricePerScoop(),0.1);
    }
}