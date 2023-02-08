/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Order class that holds items from other classes
 * Lesson Learned: How to craete a class with a list with items from another class
 * Class: 115-01
 * Date: 23-JAN-2023
 * AssignmentL 3b
 * 
 */
package main;

import week3.DessertItem;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<DessertItem> order;

    public Order() {
        order = new ArrayList<DessertItem>();
    }

    public List<DessertItem> getOrderList() {
        return order;
    }

    public void add(DessertItem item) {
        order.add(item);
    }

    public int itemCount() {
        return order.size();
    }
}