/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 1-FEB-2023
 * AssignmentL 4i
 * 
 */

package tests;
import week7.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class PropertyTest {
    @Test
    public void testGetStreetAddress() {
        Property property = new Property();
        Assert.assertEquals("Property", property.getStreetAddress());
    }

    @Test
    public void testSetStreetAddress() {
        Property property = new Property();
        property.setStreetAddress("123 Main St");
        Assert.assertEquals("123 Main St", property.getStreetAddress());
    }


    @Test
    public void testGetZip() {
        Property property = new Property();
        Assert.assertEquals("00000", property.getZip());
    }

    @Test
    public void testSetZip() {
        Property property = new Property();
        property.setZip("12345");
        Assert.assertEquals("12345", property.getZip());
    }
}