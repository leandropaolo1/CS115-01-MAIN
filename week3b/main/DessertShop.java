/*
 * Student: Leandro Cooper
 * Class: 115-01
 * Date: 22-JAN-2023
 */
package week3b;

import week3.DessertItem;
import week3.*;

public class DessertShop {

    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Candy("Candy Corn", 1.5, .25));
        order.add(new Candy("Gummy Bears", .25, .35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, .79));
        order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        for (DessertItem item : order.getOrderList()) {
            System.out.println(item.getName());
        }

        System.out.println("Total number of items in the order: " + order.itemCount());
    }
}