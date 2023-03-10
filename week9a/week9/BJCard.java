package week9;

import java.awt.Color;

public class BJCard extends PCard {
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;

    public static final int SPADE = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;
    public static final int CLUB = 4;

    private int rank;
    private int suit;
    private boolean hidden;

    public BJCard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        this.hidden = false;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public void hideCard() {
        this.hidden = true;
    }

    @Override
    public void showCard() {
        this.hidden = false;
    }

    @Override
    public boolean isHidden() {
        return this.hidden;
    }

    @Override
    public String getText() {
        String cardRank = "";
        switch (this.rank) {
            case ACE:
                cardRank = "A";
                break;
            case TWO:
                cardRank = "2";
                break;
            case THREE:
                cardRank = "3";
                break;
            case FOUR:
                cardRank = "4";
                break;
            case FIVE:
                cardRank = "5";
                break;
            case SIX:
                cardRank = "6";
                break;
            case SEVEN:
                cardRank = "7";
                break;
            case EIGHT:
                cardRank = "8";
                break;
            case NINE:
                cardRank = "9";
                break;
            case TEN:
                cardRank = "10";
                break;
            case JACK:
                cardRank = "J";
                break;
            case KNIGHT:
                cardRank = "N";
                break;
            case QUEEN:
                cardRank = "Q";
                break;
            case KING:
                cardRank = "K";
                break;
        }

        String cardSuit = "";
        switch (this.suit) {
            case SPADE:
                cardSuit = "\u2660";
                break;
            case HEART:
                cardSuit = "\u2665";
                break;
            case DIAMOND:
                cardSuit = "\u2666";
                break;
            case CLUB:
                cardSuit = "\u2663";
                break;
        }

        return cardRank + cardSuit;
    }

    @Override
    public Color getFaceColor() {
        if (this.suit == SPADE || this.suit == CLUB) {
            return Color.BLACK;
        } else {
            return Color.WHITE;
        }
    }
    
    /**
     * Returns the color of the cards background.
     * Overrides the getBackColor method in PCard.
     * @return the color of the cards background.
     */
    @Override
    public Color getBackColor() {
        return Color.WHITE;
    }
    
    /**
     * Returns the color of an 8 pixel border around the edge of the card.
     * Overrides the getBorderColor method in PCard.
     * @return the color of an 8 pixel border around the edge of the card.
     */
    @Override
    public Color getBorderColor() {
        return Color.BLACK;
    }
    
    /**
     * Returns the alternative color used on the cards background.
     * Overrides the getStripeColor method in PCard.
     * @return the alternative color used on the cards background.
     */
    @Override
    public Color getStripeColor() {
        return Color.LIGHT_GRAY;
    }
}