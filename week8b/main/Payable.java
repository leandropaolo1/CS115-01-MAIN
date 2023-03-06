/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: main funtion that uses the classes in week8A and methods with bold lettering interface addition
 * Lesson Learned: In this lab, I learned to override the Object.toString() method and how to use an EMUM in a class and compare stuff and everything else
 * Class: 115-01
 * Date: 15-FEB-2023
 * Assignment: 7A
 * 
 */

package main;

public interface Payable {
    enum PayType {
        CASH, CARD, PHONE
    }
    
    PayType getPayType();
    void setPayType(PayType payType);
}