import week3.Person;
import org.junit.Assert;

public class PersonTest {

    public void testNoArgumentConstructor() {
        Person person = new Person();
        Assert.assertEquals("", person.getName());
        Assert.assertEquals(LocalDate.of(1900, 1, 1), person.getDob());
        Assert.assertEquals("", person.getGender());
        Assert.assertEquals("", person.getPhone());
    }

    public void testParameterizedConstructor() {
        Person person = new Person("John Doe", "1990-10-22", "male", "555-555-5555");
        Assert.assertEquals("John Doe", person.getName());
        Assert.assertEquals(LocalDate.of(1990, 10, 22), person.getDob());
        Assert.assertEquals("male", person.getGender());
        Assert.assertEquals("555-555-5555", person.getPhone());
    }

    public void testSetters() {
        Person person = new Person();
        person.setName("Jane");
        person.setDob("1998-05-10");
        person.setGender("Female");
        person.setPhone("123-456-7890");
        Assert.assertEquals("Jane", person.getName());
        Assert.assertEquals(LocalDate.of(1998, 5, 10), person.getDob());
        Assert.assertEquals("Female", person.getGender());
        Assert.assertEquals("123-456-7890", person.getPhone());
    }

}