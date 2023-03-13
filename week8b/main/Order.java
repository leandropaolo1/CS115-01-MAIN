/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: Class that implements the java generics and compares order and adds the ones that are the same
 * Lesson Learned: In this lab, I learned to use Generic within a class
 * Date: 28-FEB-2023
 * Assignment: 8b
 * 
 */

 package main;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 
 import week8.*;
 
 public class Order implements Payable {
     private List<DessertItem> order;
     private PayType payMethod;
 
     public Order() {
         order = new ArrayList<DessertItem>();
         payMethod = PayType.CASH;
     }
 
     public List<DessertItem> getOrderList() {
         return order;
     }
 
     public void add(DessertItem item) {
         if (item instanceof Candy) {
             Candy new_candy = (Candy) item;
             boolean add_item = true;
             for (DessertItem dessert_item : order) {
                 if (dessert_item instanceof Candy) {
                     Candy old_candy = (Candy) dessert_item;
                     if (new_candy.getPricePerPound() == old_candy.getPricePerPound() && old_candy.getName().equals(new_candy.getName())){
                         double combined_weight = old_candy.getWeight() + new_candy.getWeight();
                         old_candy.setWeight(combined_weight);
                         add_item = false;
                         return;
                     }
 
                 
                 }
             }
             if(add_item = true){
                 order.add(new_candy);
                 Collections.sort(order);
                 return;
             }
 
   
         } else if (item instanceof Cookie) {
             Cookie new_cookie = (Cookie) item;
             boolean add_item = true;
             for (DessertItem dessert_item : order) {
                 if (dessert_item instanceof Cookie) {
                     if (dessert_item instanceof Cookie ) {
                         Cookie old_cookie = (Cookie) dessert_item;
                         if(new_cookie.getPricePerDozen() == old_cookie.getPricePerDozen() && old_cookie.getName().equals(new_cookie.getName())){
                             int combined_quantity = old_cookie.getQuantity() + new_cookie.getQuantity();
                             old_cookie.setQuantity(combined_quantity);
                             return;
                         }
 
                     }
 
                 }
  
             }
             if(add_item = true){
                 order.add(new_cookie);
                 Collections.sort(order);
                 return;
             }
 
         }
         else{
             order.add(item);
             Collections.sort(order);
             return;
         }   
     }
 
     public int itemCount() {
         return order.size();
     }
 
     public double orderCost() {
         double totalCost = 0;
         for (DessertItem item : order) {
             totalCost += item.calculateCost();
         }
         return totalCost;
     }
 
     public double orderTax() {
         double totalTax = 0;
         for (DessertItem item : order) {
             totalTax += item.calculateTax();
         }
         return totalTax;
     }

     public double getTotal(){
        double orderTotal = this.orderCost() + this.orderTax();
        return orderTotal;
     }
 
     @Override
     public PayType getPayType() {
         return payMethod;
     }
 
     @Override
     public void setPayType(PayType payType) {
         this.payMethod = payType;
     }
 
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("\n");
         int items = 0;
         double subtotal = 0;
         double tax = 0;
         String line1 = "----------------Receipt---------------";
         System.out.println(line1);
         for (DessertItem item : order) {
             double itemCost = item.calculateCost();
             double itemTax = item.calculateTax();
             System.out.println(item.toString());
             subtotal += itemCost;
             tax += itemTax;
             items++;
         }
         String line = "-----------------------------------------";
 
         System.out.println(line);
         sb.append(String.format("\n%-25s%d", "Items:", items));
         sb.append(String.format("\n%-25s$%-8.2f", "Subtotal:", subtotal));
         sb.append(String.format("\n%-25s$%-8.2f", "Tax:", tax));
         sb.append(String.format("\n%-25s$%-8.2f", "Total:", subtotal + tax));
         sb.append(String.format("\n \n %s", line));
         sb.append(String.format("\n%-25s%s", "Payment Method:", payMethod));
 
         return sb.toString();
     }
 }