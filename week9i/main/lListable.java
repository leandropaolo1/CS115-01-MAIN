package main;
import week9.*;

import java.util.*;

public interface Listable {
    
    public HashMap<String, Residential> getListings();
    
    public Residential getListing(String address);
    
    public Set<String> getStreetAddresses();
    
    public Collection<Residential> getResidences();
    
    public int getListingCount();
    
    public void addListing(String address, Residential residence);
    
}