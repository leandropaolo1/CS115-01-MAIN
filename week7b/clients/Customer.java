package clients;

import java.util.ArrayList;
import main.Order;
class Customer{

    private String custName;
    private ArrayList<Order> orderHistory;
    private int custID;
    private static int nextCustID = 1000;

    public Customer(String custName) {
        this.custName = custName;
        this.orderHistory = new ArrayList<Order>();
        this.custID = nextCustID;
        nextCustID=nextCustID + 1;
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

    public void setName(String n) {
        custName = n;
    }

    public void addToHistory(Order o) {
        orderHistory.add(o);
    }
}