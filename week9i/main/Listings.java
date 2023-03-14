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
        return listings;
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