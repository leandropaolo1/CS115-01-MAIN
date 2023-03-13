package week9;

import java.util.ArrayList;

public class BJDeck implements PDeck {

    private ArrayList<BJCard> cards;

    public BJDeck() {
        this.cards = new ArrayList<BJCard>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                BJCard card = new BJCard(i, j);
                this.cards.add(card);
            }
        }
    }

    public void shuffle() {
    }

    public BJCard draw() {
        BJCard card = this.cards.remove(0);
        return card;
    }

    public int size() {
        int size = this.cards.size();
        return size;
    }

    public boolean isEmpty() {
        boolean empty = this.cards.isEmpty();
        return empty;
    }

    @Override
    public void addCard(PCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCard'");
    }

    @Override
    public PCard dealCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dealCard'");
    }

    @Override
    public PCard dealHiddenCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dealHiddenCard'");
    }

    @Override
    public int cardCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cardCount'");
    }
}