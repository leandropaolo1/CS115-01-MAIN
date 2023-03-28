/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned:
I  created an interface and a class that implements the interface to store the list of residential properties that our Real Estate Office has listed for sale.
    This will allow us to keep track of all the properties that we are currently under contract to sell. Also you can now make bids on properties and its really
    cool
    
    This class is the interface that allows for bids and stuff
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 11i
 * 
 */

package week11;

import java.util.HashMap;
import java.util.Set;


public interface Biddable {

    public HashMap<String, Double> getBids();
    
    public Double getBid(String bidderName);
    
    public Set<String> getBidders();
    
    public int getBidCount();
    
    public void newBid(String bidderName, Double bidAmount);
}
