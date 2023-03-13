/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Customer Class Test
 * Lesson Learned: In this lab, I learned to test the customer class
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7b
 * 
 */


package tests;

import org.junit.Assert;
import org.junit.Test;
import people.*;


public class CustomerTest {

    
    @Test
    public void setUp() {
        new Customer("Leandro Cooper");
    }
    
    @Test
    public void testGetName() {
        Customer dummy_customer = new Customer("Leandro Cooper");
        Assert.assertEquals("Leandro Cooper", dummy_customer.getName());
    }
    
    @Test
    public void testGetID() {
        Customer dummy_customer = new Customer("Leandro Cooper");

        Assert.assertEquals(1000, dummy_customer.getID());
    }
    
    @Test
    public void testSetName() {        
        Customer dummy_customer = new Customer("Leandro");
        dummy_customer.setName("Leandro Cooper");
        Assert.assertEquals("Leandro Cooper", dummy_customer.getName());
    }
    

    
}