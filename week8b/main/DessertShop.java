/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */

package main;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import week8.*;
import people.*;

public class DessertShop {
    private static Scanner in = new Scanner(System.in);
    public static Map<String, Customer> customerDB = new HashMap<>();

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

    public static void adminShowCustomers(Map<String, Customer> customerDB) {
        for (Map.Entry<String, Customer> entry : customerDB.entrySet()) {
            Customer customerAccount = entry.getValue();
            System.out.printf("Customer Name: %-10s Customer ID: %s%n", customerAccount.getName(), customerAccount.getID());
        }
    }

    public static void adminGetCustomerReceipts(Map<String, Customer> customerDB, Scanner sIn) {
        boolean done = false;
        String customerName;
        Customer customerAccount;
        while (!done) {
            System.out.println("\n---------------------");
            System.out.println("---Customer Search---");
            System.out.println("---------------------");

            System.out.print("\nPlease input name of customer?\n(Enter for done): ");
            customerName = sIn.nextLine();

            if (customerName.equals("")) {
                done = true;
            } else {
                customerAccount = customerDB.get(customerName);
                System.out.printf("Customer Name: %-10s Customer ID: %d \ns", customerAccount.getName(), customerAccount.getID());
                for (Order order : customerAccount.getOrderHistory()) {
                    System.out.println(order.toString());
                }
            }

        }
    }

    public static void adminGetBestCustomer(Map<String, Customer> customerDB) {
        Customer bestCustomer = null;
        double ordersTotal=0;
        for (Map.Entry<String, Customer> entry : customerDB.entrySet()) {
            Customer customerAccount = entry.getValue();
            if (customerAccount.getOrdersSum() > ordersTotal){
                bestCustomer = customerAccount;
                ordersTotal = customerAccount.getOrdersSum();
            }
            if (bestCustomer == null){
                bestCustomer = customerAccount;
            }
            
            
        }
        System.out.printf("The dessert Shop's most valuable customer is: %s", bestCustomer.getName());
    }

    public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;
        boolean closed = false;
        while (!closed) {
            boolean done = false;
            Order order = new Order();
            while (!done) {
                System.out.println("---------------------");
                System.out.println("-----Dessert Shop----");
                System.out.println("---------------------");
                System.out.println("\n1: Candy");
                System.out.println("2: Cookie");
                System.out.println("3: Ice Cream");
                System.out.println("4: Sunday");
                System.out.println("5: Admin");

                System.out.print("\nWhat would you like to add to the order?\n(1-5, Enter for done): ");
                choice = sIn.nextLine();

                if (choice.equals("")) {
                    done = true;
                } else {
                    switch (choice) {
                        case "1":
                            orderItem = userPromptCandy();
                            order.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "2":
                            orderItem = userPromptCookie();
                            order.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;

                        case "3":
                            orderItem = userPromptIceCream();
                            order.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "4":
                            orderItem = userPromptSundae();
                            order.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "5":

                            boolean done1_2 = false;
                            while (!done1_2) {

                                System.out.println("\n---------------------");
                                System.out.println("-----Admin Module----");
                                System.out.println("---------------------");
                                System.out.println("\n1: Shop Customer List");
                                System.out.println("2: Customer Order History");
                                System.out.println("3: Best Customer");
                                System.out.println("4: Exit");

                                System.out.print("\nWhat would you like to add to do? (1-4, Enter for done): ");
                                String choice1_1_1 = sIn.nextLine();

                                if (choice1_1_1.equals("")) {
                                    done1_2 = true;
                                } else {
                                    switch (choice1_1_1) {
                                        case "1":
                                            adminShowCustomers(customerDB);
                                            break;
                                        case "2":
                                            adminGetCustomerReceipts(customerDB, sIn);
                                            break;

                                        case "3":
                                            adminGetBestCustomer(customerDB);
                                            break;
                                        case "4":
                                            done1_2 = true;
                                            break;
                                        default:
                                            System.out.println(
                                                    "Invalid response:  Please enter a choice from the menu (1-4)");
                                            break;
                                    }
                                }
                            }
                            break;
                        default:
                            System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                            break;
                    }
                }
            }

            System.out.print("\nName to which order is under: ");
            String input = sIn.nextLine();

            if (input.equals("")) {
                closed = true;
            } else {
                String customerName = input;
                Customer customer = customerDB.get(customerName);

                if (customer == null) {
                    customer = new Customer(customerName);
                    customer.addToHistory(order);
                    askPaymentMethod(sIn, order);
                    String order_string = order.toString();
                    System.out.println(order_string);
                    customer.toString();
                    customerDB.put(input, customer);

                } else {
                    customer.addToHistory(order);
                    askPaymentMethod(sIn, order);
                    String order_string = order.toString();
                    System.out.println(order_string);
                    customer.toString();

                }

            }
        }
    }

}