import java.time.LocalDate;
import org.junit.Assert;

import week2.Person;


public class PersonTest {


    @org.junit.Test
    public void testNoArgumentConstructor() {
        Person person = new Person();
        Assert.assertEquals("", person.getName());
        Assert.assertEquals(LocalDate.of(1900, 1, 1), person.getDob());
        Assert.assertEquals("", person.getGender());
        Assert.assertEquals("", person.getPhone());
    }

    @org.junit.Test
    public void testParameterizedConstructor() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("Leandro Cooper", person.getName());
        Assert.assertEquals(LocalDate.of(1990, 10, 22), person.getDob());
        Assert.assertEquals("male", person.getGender());
        Assert.assertEquals("555-555-5555", person.getPhone());
    }

    @org.junit.Test
    public void testGetName() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("Leandro Cooper", person.getName());
    }

    @org.junit.Test
    public void testGetDob() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals(LocalDate.of(1990, 10, 22), person.getDob());
    }

    @org.junit.Test
    public void testGetGender() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("male", person.getGender());
    }

    @org.junit.Test
    public void testGetPhone() {
        Person person = new Person("Leandro Cooper", LocalDate.of(1990,10,22), "male", "555-555-5555");
        Assert.assertEquals("555-555-5555", person.getPhone());
    }

    @org.junit.Test
    public void testSetName() {
        Person person = new Person();
        person.setName("Jane");
        Assert.assertEquals("Jane", person.getName());
    }

    @org.junit.Test
    public void testSetDob() {
        Person person = new Person();
        person.setDob("1998-05-10");
        Assert.assertEquals(LocalDate.of(1998, 5, 10), person.getDob());
    }

    @org.junit.Test
    public void testSetGender() {
        Person person = new Person();
        person.setGender("Female");
        Assert.assertEquals("Female", person.getGender());
    }

    @org.junit.Test
    public void testSetPhone() {
        Person person = new Person();
        person.setPhone("123-456-7890");
        Assert.assertEquals("123-456-7890", person.getPhone());
    }

}