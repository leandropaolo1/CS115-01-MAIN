/*
 * Student: Leandro Cooper
 * Class: 115-01
 * Date: 22-JAN-2023
 */
package tests;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import week3.DessertItem;

public class DessertItemTest {

    @Test
    public void testDefaultConstructor() {
        DessertItem DessertItem = new DessertItem();
        Assert.assertEquals("", DessertItem.getName());

    }

    @Test
    public void testConstructorWithArguments() {
        DessertItem DessertItem = new DessertItem("Pudding");
        Assert.assertEquals("Pudding", DessertItem.getName());

    } 
    
    @Test
    public void testSetName() {
        DessertItem DessertItem = new DessertItem();
        DessertItem.setName("Pudding");
        Assert.assertEquals("Pudding", DessertItem.getName());
    }

    @Test
    public void testGetName() {
        DessertItem DessertItem = new DessertItem("Pudding");
        Assert.assertEquals("Pudding", DessertItem.getName());
    }
}