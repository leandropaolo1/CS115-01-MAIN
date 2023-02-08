/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Runs the whole program Persons 
 * Lesson Learned: Learned use dates and how to add them to superclasses
 * Class: 115-01
 * Date: 18-JAN-2023
 * 
 */

package main;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import week2.Person;

class MageLightUniversity{

    public static void main(String[] args){
        Person person1 = new Person("Rachel", LocalDate.of(1993, 5, 12), "F", "801-555-1212");
        Person person2 = new Person("Jose", LocalDate.of(2004, 12, 1), "M", "480-555-1212");
        Person person3 = new Person("Prya", LocalDate.of(2001, 2, 27), "F", "385-555-1212");
        Person person4 = new Person("Bob", LocalDate.of(1984, 6, 6), "M", "916-555-1212");
        ArrayList<Person> quest_list = new ArrayList<Person>();
        quest_list.add(person1);
        quest_list.add(person2);
        quest_list.add(person3);
        quest_list.add(person4);

        LocalDate today = LocalDate.now();

        System.out.printf("%-15s %-15s %-7s %-15s %-7s\n", "Name", "Birthday", "Age", "Gender", "Phone #");
        System.out.println("-------------------------------------------------");
        
        for (Person p : quest_list) {
            Period age = Period.between(p.getDob(), today);
            System.out.printf("%-15s %-15s %-7s %-15s %-7s\n",
            p.getName(), p.getDob(), age.getYears(), p.getGender(), p.getPhone());
        }

    }
}