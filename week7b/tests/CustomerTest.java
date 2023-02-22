package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import people.*;


public class CustomerTest {

    Customer dummy_customer;
    
    @Test
    public void setUp() {
        dummy_customer = new Customer("John Smith");
    }
    
    @Test
    public void testGetName() {
        assertEquals("John Smith", dummy_customer.getName());
    }
    
    @Test
    public void testGetID() {
        assertEquals(1000, dummy_customer.getID());
    }
    
    @Test
    public void testSetName() {
        dummy_customer.setName("Jane Doe");
        assertEquals("Jane Doe", dummy_customer.getName());
    }
    

    
}