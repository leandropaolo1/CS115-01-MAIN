/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week5b and methods with bold lettering
 * Lesson Learned: In this lab, I learned to override the Object.toString() method of all your classes to output a receipt with bold lettering and extends class
 * Class: 115-01
 * Date: 6-FEB-2023
 * Assignment: 5b
 * 
 */


package main;

import week5.*;
import java.util.Scanner;

public class DessertShop {
    private static Scanner in = new Scanner(System.in);

    private static DessertItem userPromptCandy() {
        System.out.print("Enter candy name: ");
        String name = in.nextLine();
        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();
        in.nextLine(); // consume the line break
        System.out.print("Enter price per pound: ");
        double pricePerPound = in.nextDouble();
        in.nextLine(); // consume the line break
        return new Candy(name, weight, pricePerPound);
    }

    private static DessertItem userPromptCookie() {
        System.out.print("Enter cookie name: ");
        String name = in.nextLine();
        System.out.print("Enter number of cookies: ");
        int number = in.nextInt();
        in.nextLine(); // consume the line break
        System.out.print("Enter price per dozen: ");
        int pricePerDozen = in.nextInt();
        in.nextLine(); // consume the line break
        return new Cookie(name, number, pricePerDozen);
    }

    private static DessertItem userPromptIceCream() {
        System.out.print("Enter ice cream name: ");
        String name = in.nextLine();
        System.out.print("Enter scoop count: ");
        int scoopCount = in.nextInt();
        System.out.print("Enter scoop price: ");
        int price = in.nextInt();
        in.nextLine(); // consume the line break
        return new IceCream(name, scoopCount, price);
    }

    private static DessertItem userPromptSundae() {

        System.out.print("Enter type of icecream name: ");
        String name = in.nextLine();
        System.out.println("Enter toppings name: ");
        String toppingsName = in.nextLine();
        System.out.print("Enter scoop count: ");
        int scoopCount = in.nextInt();
        System.out.print("Enter scoop price: ");
        double scoopPrice = in.nextDouble();

        System.out.print("Enter topping price: ");
        double toppingPrice = in.nextDouble();

        in.nextLine(); // consume the line break
        return new Sundae(name, scoopCount, scoopPrice, toppingsName, toppingPrice);
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

        boolean done = false;
        while (!done) {
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sunday");

            System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        orderItem = userPromptCandy();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    case "2":
                        orderItem = userPromptCookie();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;

                    case "3":
                        orderItem = userPromptIceCream();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    case "4":
                        orderItem = userPromptSundae();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }// end of switch (choice)
            } // end of if (choice.equals(""))
        } // end of while (!done)
        /*
        System.out.println("\n");
        double subtotal = 0;
        double tax = 0;
        for (DessertItem item : order1.getOrderList()) {
            String itemName = item.getName();
            double itemCost = item.calculateCost();
            double itemTax = item.calculateTax();
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", itemName, itemCost, itemTax);
            subtotal += itemCost;
            tax += itemTax;
        }
         */
        
        String order_string = order1.toString();
        System.out.println(order_string);
    }
}