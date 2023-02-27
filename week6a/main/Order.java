/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week6A and methods with bold lettering interface addition
 * Lesson Learned: In this lab, I learned to override the Object.toString() method and how to use an EMUM in a class and compare stuff and everything else
 * Class: 115-01
 * Date: 8-FEB-2023
 * Assignment: 6A
 * 
 */

package main;

import week6.*;
import java.util.ArrayList;
import java.util.List;

public class Order implements Payable {
    private List<DessertItem> order;
    private PayType payMethod;

    public Order() {
        order = new ArrayList<DessertItem>();
        payMethod = PayType.CASH;
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
    public PayType getPayType() {
        return payMethod;
    }

    @Override
    public void setPayType(PayType payType) {
        this.payMethod = payType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        int items = 0;
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
            items++;
        }
        String line = "-----------------------------------------";

        System.out.println(line);
        sb.append(String.format("\n%-25s%d", "Items:", items));
        sb.append(String.format("\n%-25s$%-8.2f [Tax: $%.2f] ", "Subtotal:", subtotal, tax));
        sb.append(String.format("\n%-25s$%-8.2f", "Tax:", tax));
        sb.append(String.format("\n%-25s$%-8.2f", "Total:", subtotal + tax));
        sb.append(String.format("\n \n %s", line));
        sb.append(String.format("\n%-25s%s", "Payment Method:", payMethod));

        return sb.toString();
    }
}