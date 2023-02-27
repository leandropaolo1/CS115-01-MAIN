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
        double pricePerDozen = in.nextDouble();
        in.nextLine(); // consume the line break
        return new Cookie(name, number, pricePerDozen);
    }

    private static DessertItem userPromptIceCream() {
        System.out.print("Enter ice cream name: ");
        String name = in.nextLine();
        System.out.print("Enter scoop count: ");
        int scoopCount = in.nextInt();
        System.out.print("Enter scoop price: ");
        double price = in.nextDouble();
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

    public static void askPaymentMethod(Scanner sIn, Order order) {
        Payable.PayType payType = null;
        while (payType == null) {
            System.out.print("What form of payment will be used? (CASH, CARD, PHONE): ");
            String payTypeString = sIn.nextLine();
            try {
                payType = Payable.PayType.valueOf(payTypeString.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("That's not a valid form of payment.");
            }
        }
        order.setPayType(payType);
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
        askPaymentMethod(sIn, order1);
        String order_string = order1.toString();
        System.out.println(order_string);
    }
}