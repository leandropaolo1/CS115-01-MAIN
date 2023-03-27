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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import week11.*;

public class Reo {
    private static Listings listings = new Listings();

    public static void listingAutoPopulate() {
        House house1 = new House("34 Elm", "95129", 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        listings.addListing("34 Elm", house1);
        House house2 = new House("42 Hitchhikers", "95136", 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        listings.addListing("42 Hitchhikers", house2);
        Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        listings.addListing("4876 Industrial", condo1);
        House house3 = new House("2654 Oak", "84062", 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        listings.addListing("2654 Oak", house3);
        Condo condo2 = new Condo("9875 Lexington", "84063", 2, 1, 1500, 1);
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

    private static void createRandomBid(Listings listings) {
        List<Residential> properties = new ArrayList<>(listings.getResidences());
        if (properties.size() == 0) {
            System.out.println("There are no properties to bid on.");
            return;
        }
        Random r = new Random();
        int sampleSize = Math.min(5, properties.size());
        List<Residential> sampleProperties = new ArrayList<>();
        for (int i = 0; i < sampleSize && !properties.isEmpty(); i++) {
            int index = r.nextInt(properties.size());
            Residential res = properties.get(index);
            sampleProperties.add(res);
            properties.remove(index);
        }
        String[] autoBidders = {"Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy", "DeForest Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank", "Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton", "Colm Meaney", "Michelle Forbes"};
        for (Residential res : sampleProperties) {
            double maxBid = res.calculateAppraisalPrice() * 1.1;
            double minBid = res.calculateAppraisalPrice() * 0.9;
            double bidAmount = minBid + (maxBid - minBid) * r.nextDouble();
            int bidderIndex = r.nextInt(autoBidders.length);
            String bidderName = autoBidders[bidderIndex];
            res.newBid(bidderName, bidAmount);
        }
    }

    private static void userPromptMakeBid(Scanner scanner, Listings listings) {
        System.out.println("Adding bids to a property...");
        HashMap<String, Residential> propertyMap = listings.getListings();
        if (propertyMap == null) {
            System.out.println("There are no properties to add bids to.");
            return;
        }

        List<Residential> properties = new ArrayList<Residential>(propertyMap.values());
        int propertyCount = properties.size();
        if (propertyCount == 0) {
            System.out.println("There are no properties to add bids to.");
            return;
        }

        System.out.println("Choose a property to add a bid to:");
        for (int i = 0; i < propertyCount; i++) {
            Residential property = properties.get(i);
            int bidCount = property.getBids().size();
            System.out.println(i + 1 + ". " + property.getStreetAddress() + " - " + bidCount + " bids");
        }

        int selection = 0;
        while (selection < 1 || selection > propertyCount) {
            System.out.print("Enter a selection (1-" + propertyCount + "): ");
            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        }

        Residential selectedProperty = properties.get(selection - 1);
        System.out.println("\nSelected property:");
        System.out.println(selectedProperty.toString());

        scanner.nextLine();
        System.out.print("Enter bidder name: ");
        String bidderName = scanner.nextLine();

        double bidAmount = 0;
        boolean validBid = false;
        while (!validBid) {
            System.out.print("Enter bid amount: ");
            if (scanner.hasNextDouble()) {
                bidAmount = scanner.nextDouble();
                validBid = true;
            } else {
                scanner.nextLine();
            }
        }

        selectedProperty.newBid(bidderName, bidAmount);
        System.out.println("Bid added to " + selectedProperty.getStreetAddress() + ".");
    }

    private static void userPromptShowBids(Scanner scanner, Listings listings) {
        HashMap<String, Residential> propertyMap = listings.getListings();
        if (propertyMap == null) {
            return;
        }
        List<Residential> properties = new ArrayList<>(propertyMap.values());

        if (properties.size() == 0) {
            System.out.println("\nThere are no properties listed yet.\n");
            return;
        }

        System.out.println("\nSelect a property to show bids:");
        for (int i = 0; i < properties.size(); i++) {
            Residential property = properties.get(i);
            System.out.printf("%d. %s (Total Bids: %d)\n", i + 1, property.getStreetAddress(), property.getBidCount());
        }

        // Get user input for property selection
        System.out.print("\nEnter the number of the property: ");
        int propertyIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline character

        if (propertyIndex < 0 || propertyIndex >= properties.size()) {
            System.out.println("\nInvalid property number. Please try again.\n");
            return;
        }

        Residential selectedProperty = properties.get(propertyIndex);
        System.out.printf("\n%s:\n", selectedProperty.getStreetAddress());
        System.out.printf("Bedrooms: %d\n", selectedProperty.getBedCount());
        System.out.printf("Bathrooms: %d\n", selectedProperty.getBathCount());
        System.out.printf("Square Footage: %d\n", selectedProperty.getSqFootage());

        System.out.println("\nBids:");
        HashMap<String, Double> bids = selectedProperty.getBids();
        if (bids.size() == 0) {
            System.out.println("No bids have been placed for this property yet.");
        } else {
            for (String bidder : bids.keySet()) {
                System.out.printf("%s: $%.2f\n", bidder, bids.get(bidder));
            }
        }
        System.out.println();
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
                            System.out.print("\nWhat would you like to add to do? (1-4, Enter to go back): ");
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
                                                    "\nWhat would you like to add to do? (1-2, Enter to go back): ");
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
                                        userPromptMakeBid(sIn, listings);
                                        System.out.println("\nBid was recorded. \n");
                                        break;
                                    case "2":
                                        userPromptShowBids(sIn, listings);
                                        
                                        break;
                                    case "3":
                                        createRandomBid(listings);
                                        System.out.println("\nAuto Populate Bids was a success. \n");
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
