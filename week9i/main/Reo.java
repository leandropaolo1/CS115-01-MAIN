/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
I  created an interface and a class that implements the interface to store the list of residential properties that our Real Estate Office has listed for sale. This will allow us to keep track of all the properties that we are currently under contract to sell. 
 * Class: 115-01
 * Date: 13-MAR-2023
 * Assignment: 9i
 * 
 */

package main;

import java.util.Scanner;
import week9.*;

public class Reo {
    private static Listings listings = new Listings();

    public static void listingAutoPopulate(){
        House house1 = new House("34 Elm","95129", 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        listings.addListing("34 Elm", house1);
        House house2 = new House("42 Hitchhikers","95136", 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        listings.addListing("42 Hitchhikers", house2);
        Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        listings.addListing("4876 Industrial", condo1);
        House house3 = new House("2654 Oak","84062", 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        listings.addListing("2654 Oak", house3);
        Condo condo2 = new Condo("9875 Lexington","84063", 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        listings.addListing("9875 Lexington", condo2);
        Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        listings.addListing("3782 Market", condo3);
        House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        listings.addListing("7608 Glenwood", house4);
        House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        listings.addListing("1220 Apple", house5);

        System.out.print("\nListing has been auto-populated \n ");

    }

    private static void userPromptAddCondo(Scanner scanner) {
        System.out.print("Please enter the street address for the residence: ");
        String streetAddress = scanner.nextLine();
        System.out.print("Please enter the zip code for the residence: ");
        String zipCode = scanner.nextLine();
        System.out.print("Please enter the number of bedrooms: ");
        int numBedrooms = scanner.nextInt();
        System.out.print("Please enter the number of bathrooms: ");
        int numBathrooms = scanner.nextInt();
        System.out.print("Please enter the square footage of the residence: ");
        int squareFootage = scanner.nextInt();
        System.out.print("Please enter the floor level: ");
        int floorLevel = scanner.nextInt();

        Condo condo = new Condo(streetAddress, zipCode, numBedrooms, numBathrooms, squareFootage, floorLevel);
        double appraisalPrice = condo.getAppraisalPrice();
        System.out.printf("The appraisal price for this condo is $%.2f\n", appraisalPrice);

        System.out.print("Please enter the list price: ");
        double listPrice = scanner.nextDouble();
        condo.setListPrice(listPrice);
        listings.addListing(streetAddress, condo);
        System.out.println("Condo added to listings.");
    }

    private static void userPromptAddHouse(Scanner scanner) {
        System.out.print("Please enter the street address for the residence: ");
        String streetAddress = scanner.nextLine();
        System.out.print("Please enter the zip code for the residence: ");
        String zipCode = scanner.nextLine();
        System.out.print("Please enter the number of bedrooms: ");
        int numBedrooms = scanner.nextInt();
        System.out.print("Please enter the number of bathrooms: ");
        int numBathrooms = scanner.nextInt();
        System.out.print("Please enter the square footage of the residence: ");
        int squareFootage = scanner.nextInt();
        System.out.print("Please enter the size of the yard in acres: ");
        double yardSize = scanner.nextDouble();

        House house = new House(streetAddress, zipCode, numBedrooms, numBathrooms, squareFootage, yardSize);
        double appraisalPrice = house.getAppraisalPrice();
        System.out.printf("The appraisal price for this condo is $%.2f\n", appraisalPrice);

        System.out.print("Please enter the list price: ");
        double listPrice = scanner.nextDouble();
        house.setListPrice(listPrice);
        listings.addListing(streetAddress, house);
        System.out.println("House added to listings.");
    }




    public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in);
        String choice1;


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
                                                        userPromptAddHouse(sIn);
                                                        break;
                                                    case "2":
                                                        userPromptAddCondo(sIn);
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
                                        listings.getListings();

                                        break;
                                    case "3":
                                            listingAutoPopulate();
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
