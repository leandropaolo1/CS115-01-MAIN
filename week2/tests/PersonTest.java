/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description:
 * Person class is a java class that can hold information about a indivudal: name dob, gender and phone
 * Lesson Learned: 
 * Build a Java Class that includes
    private attributes,
    constructors,
    getter methods, and
    setter methods.
 * Class: 115-01
 * Date: 11-JAN-2023
 * Assignment: 2a
 * 
 */

package tests;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import week2.Person;


public class PersonTest {


    @Test
    public void testNoArgumentConstructor() {
        Person person = new Person();
        Assert.assertEquals("", person.getName());
        Assert.assertEquals(LocalDate.of(1900, 1, 1), person.getDob());
        Assert.assertEquals("", person.getGender());
        Assert.assertEquals("", person.getPhone());
    }

    @Test
    public void testParameterizedConstructor() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("Leandro Cooper", person.getName());
        Assert.assertEquals(LocalDate.of(1990, 10, 22), person.getDob());
        Assert.assertEquals("male", person.getGender());
        Assert.assertEquals("555-555-5555", person.getPhone());
    }

    @Test
    public void testGetName() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("Leandro Cooper", person.getName());
    }

    @Test
    public void testGetDob() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals(LocalDate.of(1990, 10, 22), person.getDob());
    }

    @Test
    public void testGetGender() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("male", person.getGender());
    }

    @Test
    public void testGetPhone() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("555-555-5555", person.getPhone());
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        person.setName("Jane");
        Assert.assertEquals("Jane", person.getName());
    }

    @Test
    public void testSetDob() {
        Person person = new Person();
        person.setDob("1998-05-10");
        Assert.assertEquals(LocalDate.of(1998, 5, 10), person.getDob());
    }

    @Test
    public void testSetGender() {
        Person person = new Person();
        person.setGender("Female");
        Assert.assertEquals("Female", person.getGender());
    }

    @Test
    public void testSetPhone() {
        Person person = new Person();
        person.setPhone("123-456-7890");
        Assert.assertEquals("123-456-7890", person.getPhone());
    }

}