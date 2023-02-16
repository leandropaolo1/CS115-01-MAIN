/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
 * In this lab, I learned how to build Java superclasses and subclasses and overload methods with multiple signatures.
 * I also built a project with 3 levels in the Hierarchy and created JUnit test cases.
 * Class: 115-01
 * Date: 15-FEB-2023
 * AssignmentL 7i
 * 
 */

package tests;

import week7.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class PropertyTest {

    @Test
    public void testCalculateAppraisalPrice() {
        House house = new House();
        house.setStreetAddress("123 Main St");
        house.setZip("12345");
        house.setBedCount(1);
        house.setBathCount(1);
        house.setSqFootage(1);
        house.setYardAcres(1);
        int expectedAppraisalPrice = 20_000;
        int actualAppraisalPrice = house.calculateAppraisalPrice();
        Assert.assertEquals(expectedAppraisalPrice, actualAppraisalPrice);
    }

}
