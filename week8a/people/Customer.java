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
        nextCustID = nextCustID + 1; // increment nextCustID before assigning it
        this.custID = nextCustID;
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        String line = "-----------------------------------------";
        System.out.println(line);
        System.out.printf("Customer Name: %-15s Customer ID: %-15d Total Orders: %-5d%n", this.custName, this.custID, this.getOrderHistory().size());
        sb.append(String.format("\n \n %s", line));

        return sb.toString();
    }
}