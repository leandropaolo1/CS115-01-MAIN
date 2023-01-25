/*
 * Student: Leandro Cooper
 * Class: 115-01
 * Date: 22-JAN-2023
 */
package main;

import week4.*;

public class DessertShop {

    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Candy("Candy Corn", 1.5, .25));
        order.add(new Candy("Gummy Bears", .25, .35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, .79));
        order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        double subtotal = 0;
        double tax = 0;

        for (DessertItem item : order.getOrderList()) {
            String itemName = item.getName();
            double itemCost = item.calculateCost();
            double itemTax = item.calculateTax();
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", itemName, itemCost, itemTax);
            subtotal += itemCost;
            tax += itemTax;
        }

        System.out.printf("\n%-25s$%-8.2f\n", "Subtotal:", subtotal);
        System.out.printf("%-25s$%-8.2f\n", "Total Tax:", tax);
        System.out.printf("%-25s$%-8.2f\n", "Total Cost:", (subtotal + tax));
        System.out.printf("%-25s%-8d\n", "Total number of items in the order:", order.itemCount());
    }
}