/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 13-FEB-2023
 * Assignment: 6b
 * 
 */

package tests;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import week6.*;

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
                return 5.0;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        Assert.assertEquals(-1, item_1.compareTo(item_2));
    }

    @Test
    public void testCompareToGreaterThan() {
        DessertItem item_1 = new DessertItem("Item 1") {
            @Override
            public double calculateCost() {
                return 15.0;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        Assert.assertEquals(1, item_1.compareTo(item_2));
    }

    @Test
    public void testCompareToEqual() {
        DessertItem item_1 = new DessertItem("Item 1") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        DessertItem item_2 = new DessertItem("Item 2") {
            @Override
            public double calculateCost() {
                return 10.0;
            }
        };

        Assert.assertEquals(0, item_1.compareTo(item_2));
    }
}

