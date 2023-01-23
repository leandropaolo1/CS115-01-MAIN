/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: SuperClass that extendends from DessertItem
 * Lesson Learned: Learned to create a subclass
 * Class: 115-01
 * Date: 22-JAN-2023
 * AssignmentL 3a
 * 
 */
package week3;

public class DessertItem {
    private String name;

    // default constructor
    public DessertItem() {
        this.name = "Dessert";
    }

    // constructor with one argument
    public DessertItem(String name) {
        this.name = name;
    }

    // getter method for name attribute
    public String getName() {
        return name;
    }

    // setter method for name attribute
    public void setName(String name) {
        this.name = name;
    }
}
