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

public class Reo {
    private static Scanner in = new Scanner(System.in);
    public static Map<String, Residential> customerDB = new HashMap<>();

    private static void userPromptListings() {
        System.out.print("Enter candy name: ");
        String name = in.nextLine();
        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();
        in.nextLine(); // consume the line break
        System.out.print("Enter price per pound: ");
        double pricePerPound = in.nextDouble();
        in.nextLine(); // consume the line break
    }

    private static void userPromptBids() {
        System.out.print("Enter cookie name: ");
        String name = in.nextLine();
        System.out.print("Enter number of cookies: ");
        int number = in.nextInt();
        in.nextLine(); // consume the line break
        System.out.print("Enter price per dozen: ");
        double pricePerDozen = in.nextDouble();
        in.nextLine(); // consume the line break
    }

    public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in);
        String choice;
        Residential residentialItem;

        boolean done = false;
        while (!done) {
            System.out.println("\n1: Listings");
            System.out.println("2: Bids");
            System.out.print("\nWhat would you like to do? (1-2, Enter for done): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        boolean done2 = false;
                        while (!done2) {
                            System.out.println("\n1: Add Listing");
                            System.out.println("2: Show Listings");
                            System.out.println("3: Auto Populate Listings (DEV Tool)");
                            System.out.print("\nWhat would you like to add to do? (1-4, Enter for done): ");
                            choice = sIn.nextLine();

                            if (choice.equals("")) {
                                done2 = true;
                            } else {
                                switch (choice) {
                                    case "1":
                                        // residentialItem = userPromptListings();

                                        System.out.printf("1");
                                        break;
                                    case "2":
                                        // residentialItem = userPromptBids();
                                        System.out.printf("2");
                                        break;
                                    case "3":
                                        // residentialItem = userPromptBids();
                                        System.out.printf("3");
                                        break;
                                    default:
                                        System.out.println(
                                                "Invalid response:  Please enter a choice from the menu (1-4)");
                                        break;
                                }
                            }
                        }
                        // residentialItem = userPromptListings();
                        System.out.printf("1-1:3");
                        break;
                    case "2":
                        boolean done3 = false;
                        while (!done3) {
                            System.out.println("\n1: Add Listing");
                            System.out.println("2: Show Listings");
                            System.out.println("3: Auto Populate Listings (DEV Tool)");
                            System.out.print("\nWhat would you like to add to do? (1-4, Enter for done): ");
                            choice = sIn.nextLine();

                            if (choice.equals("")) {
                                done3 = true;
                            } else {
                                switch (choice) {
                                    case "1":
                                        // residentialItem = userPromptListings();

                                        System.out.printf("1");
                                        break;
                                    case "2":
                                        // residentialItem = userPromptBids();
                                        System.out.printf("2");
                                        break;
                                    case "3":
                                        // residentialItem = userPromptBids();
                                        System.out.printf("3");
                                        break;
                                    default:
                                        System.out.println(
                                                "Invalid response:  Please enter a choice from the menu (1-4)");
                                        break;
                                }
                            }
                        }
                        // residentialItem = userPromptListings();
                        System.out.printf("1-1:3");
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }
            }
        }
    }
}
