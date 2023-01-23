package week3b.week3;

public class DessertItem {
    private String name;

    // default constructor
    public DessertItem() {
        this.name = "";
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
