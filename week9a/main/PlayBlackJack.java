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