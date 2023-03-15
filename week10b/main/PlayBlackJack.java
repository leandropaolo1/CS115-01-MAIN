/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: variables for the black jack cards, we printed or showed cards that summed 21
 * Lesson Learned: In this lab, I learned to create java applications
 * Class: 115-01
 * Date: 14-MAR-2023
 * Assignment: 10a
 * 
 */

package main;

import tests.*;
import week10.*;

public class PlayBlackJack {
    public static void main(String[] args) {
        BJDeck deck = new BJDeck();
        deck.shuffle();

        BJHand KoopsCards = new BJHand();

        HandTest.run(deck, KoopsCards);
    }

}
