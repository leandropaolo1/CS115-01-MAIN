/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: variables for the black jack cards, we printed or showed all 14x4 cards
 * Lesson Learned: In this lab, I learned to create java applications
 * Class: 115-01
 * Date: 13-MAR-2023
 * Assignment: 9b
 * 
 */


package main;
import tests.*;
import week9.*;

public class PlayBlackJack {
    public static void main(String[] args) {
        // Create a new deck of cards
        BJDeck deck = new BJDeck();
        DeckTest.run(deck);
        
    }
}