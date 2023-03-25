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

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import week9.*;

public class Listings implements Listable {
    private HashMap<String, Residential> listings;
    
    public Listings() {
        listings = new HashMap<>();
    }
    
    @Override
    public HashMap<String, Residential> getListings() {
        if (listings.size() > 0) {
            System.out.println("\nCurrent Listings for REO:\n");
            int listingNumber = 1;
            for (Residential residential : listings.values()) {
                System.out.println("Listing No: " + listingNumber);
                System.out.println(residential.toString());
                listingNumber++;
            }
            return listings;
        } else {
            System.out.println("\nThere are no listings. Please add a listing.\n");
            return null;
        }
    }
    
    @Override
    public Residential getListing(String address) {
        return listings.get(address);
    }
    
    @Override
    public Set<String> getStreetAddresses() {
        return listings.keySet();
    }
    
    @Override
    public Collection<Residential> getResidences() {
        return listings.values();
    }
    
    @Override
    public int getListingCount() {
        return listings.size();
    }
    
    @Override
    public void addListing(String address, Residential residence) {
        listings.put(address, residence);
    }




}