/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 12-MAR-2023
 * Assignment: 8i
 * 
 */

package _docs;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import week9.*;

public class Reo {
    private static Scanner in = new Scanner(System.in);
    public static Map<String, Residential> listingDB = new HashMap<>();

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
        String choice1;

        Residential residentialItem;

        boolean done = false;
        while (!done) {
            System.out.println("---------------------");
            System.out.println("------Main Menu------");
            System.out.println("---------------------");

            System.out.println("\n1: Listings");
            System.out.println("2: Bids");
            System.out.print("\nWhat would you like to do? (1-2, Enter for done): ");
            choice1 = sIn.nextLine();

            if (choice1.equals("")) {
                done = true;
            } else {
                switch (choice1) {
                    case "1":
                        boolean done1_1 = false;
                        while (!done1_1) {
                            System.out.println("---------------------");
                            System.out.println("-----Listing Menu----");
                            System.out.println("---------------------");
                            System.out.println("\n1: Add Listing");
                            System.out.println("2: Show Listings");
                            System.out.println("3: Auto Populate Listings (DEV Tool)");
                            System.out.print("\nWhat would you like to add to do? (1-4, Enter for done): ");
                            String choice1_1 = sIn.nextLine();

                            if (choice1_1.equals("")) {
                                done1_1 = true;
                            } else {
                                switch (choice1_1) {
                                    case "1":
                                        boolean done1_2 = false;
                                        while (!done1_2) {
                                            System.out.println("---------------------");
                                            System.out.println("---Add Listing Menu--");
                                            System.out.println("---------------------");
                                            System.out.println("\n1: Add House");
                                            System.out.println("2: Add Condo");

                                            System.out.print(
                                                    "\nWhat would you like to add to do? (1-2, Enter for done): ");
                                            String choice1_1_1 = sIn.nextLine();

                                            if (choice1_1_1.equals("")) {
                                                done1_2 = true;
                                            } else {
                                                switch (choice1_1_1) {
                                                    case "1":
                                                        // residentialItem = userPromptListings();

                                                        System.out.println("1-1-1");
                                                        break;
                                                    case "2":
                                                        // residentialItem = userPromptBids();
                                                        System.out.println("1-1-2");
                                                        break;

                                                    default:
                                                        System.out.println(
                                                                "Invalid response:  Please enter a choice from the menu (1-4)");
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case "2":
                                        System.out.println("1-2");
                                        break;
                                    case "3":
                                        System.out.println("1-3");
                                        break;
                                    default:
                                        System.out.println(
                                                "Invalid response:  Please enter a choice from the menu (1-3)");
                                        break;
                                }
                            }
                        }
                        break;
                    case "2":
                        boolean done2 = false;
                        while (!done2) {
                            System.out.println("---------------------");
                            System.out.println("-----Bidding Menu----");
                            System.out.println("---------------------");
                            System.out.println("\n1: Add New Bid");
                            System.out.println("2: Show Existing Bids");
                            System.out.println("3: Auto Populate Bids (DEV Tool)");
                            System.out.print("\nWhat would you like to do? (1-3, Enter for done): ");
                            String choice2 = sIn.nextLine();

                            if (choice2.equals("")) {
                                done2 = true;
                            } else {
                                switch (choice2) {
                                    case "1":
                                        System.out.println("2_1");


                                        break;
                                    case "2":
                                        System.out.println("2_2");
                                        break;
                                    case "3":
                                        System.out.println("2_3");
                                        break;
                                    default:
                                        System.out.println(
                                                "Invalid response:  Please enter a choice from the menu (1-3)");
                                        break;
                                }
                            }
                        }

                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-3)");
                        break;
                }
            }
        }
    }
}
