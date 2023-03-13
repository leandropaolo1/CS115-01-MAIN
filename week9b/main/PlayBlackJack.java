/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: We have added The comparable  interface to Dessert Item and also added a method that compares DessertItem object
 * Lesson Learned: In this lab, I learned to add the Comparable iterface and compare and how to arrange them
 * Class: 115-01
 * Date: 12-MAR-2023
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

        // Create a new DeckTest instance and run tests on the deck
        DeckTest deckTest = new DeckTest(deck);
        
    }
}