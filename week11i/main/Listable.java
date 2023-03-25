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