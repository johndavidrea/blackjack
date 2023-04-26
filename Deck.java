package labfour;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Deck {

    // variables
    private Stack<Card> deck;

    // constructor
    public Deck(int numberOfDecks) {
        deck = new Stack<Card>();
        // 0 for an empty deck, 1 for a single 52 card deck, 8 for simulating casino blackjack
        for (int i = 0; i < numberOfDecks; i++) {
            // for each suit type we have
            for (Suit suit : Suit.values()) {
                // for each face type we have
                for (Face face : Face.values()) {
                    // add a card of that suit/face combination
                    deck.add(new Card(suit, face));
                }
            }
        }
    }

    // add a new card to the deck
    public void addCard(Card card) {
        deck.push(card);
    }

    // take a card from the deck
    public Card takeCard() {
        return deck.pop();
    }

    // output our deck as a string
    public String toString() {
        // make a buffer to hold the card data
        String buffer = "";
        // add each card in our deck to the buffer, then add a new line in the console
        for(Card card : deck) {
            buffer += card;
            buffer += "\n";
        }
        // output our now-complete list of cards
        return buffer;
    }

    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }


}
