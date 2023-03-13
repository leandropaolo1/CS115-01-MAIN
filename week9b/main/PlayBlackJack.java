/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 12-MAR-2023
 * Assignment: 9a
 * 
 */


package main;
import tests.*;
import week9.*;

public class PlayBlackJack {
    public static void main(String[] args) {
        BJCard ace = new BJCard(1, 2);
        CardTest cardTest = new CardTest(ace);
        cardTest.run(ace);
    }
}