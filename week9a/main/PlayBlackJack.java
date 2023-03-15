/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: MAin function for shwoing the balckjack card
 * Lesson Learned: In this lab, I learned to create java applications
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
        BJCard card1 = new BJCard(1, 1);
        BJCard card2 = new BJCard(6, 2);

        CardTest.run(card1);
        CardTest.run(card2);


        BJCard card3 = new BJCard(10, 1);
        BJCard card4 = new BJCard(14, 2);

        CardTest.run(card3);
        CardTest.run(card4);


        BJCard card5 = new BJCard(13, 3);
        BJCard card6 = new BJCard(12, 4);

        CardTest.run(card5);
        CardTest.run(card6);
    }
}