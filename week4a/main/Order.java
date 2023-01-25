/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Order class that is used in dessert shop main function
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 24-JAN-2023
 * Assignment: 4a
 * 
 */

package main;

import week4.DessertItem;
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

    public double orderCost() {
        double totalCost = 0;
        for (DessertItem item : order) {
            totalCost += item.calculateCost();
        }
        return totalCost;
    }

    public double orderTax() {
        double totalTax = 0;
        for (DessertItem item : order) {
            totalTax += item.calculateTax();
        }
        return totalTax;
    }
}