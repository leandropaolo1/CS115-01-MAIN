/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: DessertItem Test using Junit
 * Lesson Learned: Learned to test an abstract superclass and overridding method with Junit and comparable generics
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7b
 * 
 */

package tests;

import org.junit.jupiter.api.Test;

import week7.*;

import org.junit.Assert;

public class DessertItemTest {

    @Test
    public void testDefaultConstructor() {
        Candy candy = new Candy();
        Assert.assertEquals("Candy", candy.getName());
        Assert.assertEquals(7.25, candy.getTaxPercent(), 0.001);

    }

    @Test
    public void testConstructorWithArguments() {
        Candy candy = new Candy("Pudding", 0.1,0.1);
        
        Assert.assertEquals("Pudding", candy.getName());
        Assert.assertEquals(7.25, candy.getTaxPercent(), 0.001);

    } 
    
    @Test
    public void testSetName() {
        Candy candy = new Candy();
        candy.setName("Pudding");
        Assert.assertEquals("Pudding", candy.getName());
    }

    @Test
    public void testGetName() {
        Candy candy = new Candy("Pudding", 0.1,0.1);
        Assert.assertEquals("Pudding", candy.getName());
    }

    @Test
    public void testSetTaxPercent() {
        Candy candy = new Candy();
        candy.setTaxPercent(8.5);
        Assert.assertEquals(8.5, candy.getTaxPercent(), 0.001);
    }

    @Test
    public void testGetTaxPercent() {
        Candy candy = new Candy();
       Assert.assertEquals(7.25, candy.getTaxPercent(), 0.001);
    }

    @Test
    public void testCompareToLessThan() {
        DessertItem item_1 = new DessertItem("Item 1") {
            @Override
            public double calculateCost() {
                return 1;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 2;
            }
        };


        Assert.assertEquals(-1, item_1.compareTo(item_2));
    }

    @Test
    public void testCompareToGreaterThan() {
        DessertItem item_1 = new DessertItem("Item 1") {
            @Override
            public double calculateCost() {
                return 2;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 1;
            }
        };

        Assert.assertEquals(1, item_1.compareTo(item_2));
    }

    @Test
    public void testCompareToEqual() {
        DessertItem item_1 = new DessertItem("Item 1") {
            @Override
            public double calculateCost() {
                return 1;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 1;
            }
        };

        Assert.assertEquals(0, item_1.compareTo(item_2));
    }
}

