package tests;

import org.junit.Assert;
import org.junit.Test;
import people.*;


public class CustomerTest {

    Customer dummy_customer;
    
    @Test
    public void setUp() {
        dummy_customer = new Customer("Leandro Cooper");
    }
    
    @Test
    public void testGetName() {
        Assert.assertEquals("Leandro Cooper", dummy_customer.getName());
    }
    
    @Test
    public void testGetID() {
        Assert.assertEquals(1000, dummy_customer.getID());
    }
    
    @Test
    public void testSetName() {
        dummy_customer.setName("Leandro Cooper");
        Assert.assertEquals("Leandro Cooper", dummy_customer.getName());
    }
    

    
}