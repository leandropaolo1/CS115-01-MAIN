/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: variables for the black jack cards, we printed or showed cards and ran PGame
 * Lesson Learned: In this lab, I learned to create java applications
 * Class: 115-01
 * Date: 14-MAR-2023
 * Assignment: 10b
 * 
 */

package main;

import week10.*;
import java.awt.Color;

public class PlayBlackJack {
    public static void main(String[] args) {
        BJDeck deck = new BJDeck();

        BJHand KoopsCards = new BJHand();
        BJHand KoopsDealer = new BJHand();

        PGame game = PGame.run(deck,KoopsDealer,KoopsCards);

        game.setBackground(Color.BLACK);
		game.setBannerColor(Color.GRAY);
		game.setBannerTextColor(Color.WHITE);
		game.setStatusTextColor(Color.WHITE);
		game.setButtonColor(Color.ORANGE);
		game.setButtonHighlightColor(Color.ORANGE);
		game.setButtonTextColor(Color.BLACK);

		game.setFont("Times New Roman");


    }

}
