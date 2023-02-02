/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Order class that is used in dessert shop main function
 * Lesson Learned: Learned to use an abstract superclass and overridding method within the subclass
 * Class: 115-01
 * Date: 30-JAN-2023
 * Assignment: 4b
 * 
 */

package main;

import week5.*;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        double subtotal = 0;
        double tax = 0;
        String line1 = "----------------Receipt---------------";
        System.out.println(line1);
        for (DessertItem item : order) {
            double itemCost = item.calculateCost();
            double itemTax = item.calculateTax();
            System.out.println(item.toString());
            subtotal += itemCost;
            tax += itemTax;
        }
        String line ="-----------------------------------------";

        System.out.println(line);

        sb.append(String.format("\n%-25s$%-8.2f", "Subtotal:", subtotal));
        sb.append(String.format("\n%-25s$%-8.2f", "Tax:", tax));
        sb.append(String.format("\n%-25s$%-8.2f", "Total:", subtotal + tax));
        sb.append(String.format("\n \n %s", line));


        return sb.toString();
    }
}