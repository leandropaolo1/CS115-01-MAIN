/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Customer Class
 * Lesson Learned: In this lab, I learned to create the customer class for the sweets shop
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7b
 * 
 */

package people;

import java.util.ArrayList;
import main.Order;

public class Customer {
    private int custID;
    private String custName;
    private static int nextCustID = 1000;
    private ArrayList<Order> orderHistory;

    public Customer(String custName) {
        this.custName = custName;
        this.orderHistory = new ArrayList<Order>();
        this.custID = nextCustID;
        nextCustID = nextCustID + 1;
    }

    public String getName() {
        return custName;
    }

    public int getID() {
        return custID;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setName(String some_name) {
        custName = some_name;
    }

    public void addToHistory(Order o) {
        orderHistory.add(o);
    }
}