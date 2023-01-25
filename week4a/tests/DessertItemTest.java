/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: DessertItem Test using Junit
 * Lesson Learned: Learned to test a subclass with Junit
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 3a
 * 
 */
package tests;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import week4.Candy;

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
       Assert.assertEquals(7.5, candy.getTaxPercent(), 0.001);
    }
}

