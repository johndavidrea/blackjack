package labfour;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){

        hand = new ArrayList<Card>();
    }

    public String toString() {
        // make a buffer to hold the card data
        String buffer = "";
        // add each card in our hand to the buffer
        for(Card card : hand) {
            buffer += card + ", ";
        }
        // output our now-complete list of cards
        return buffer;
    }

    public Card getCard(int i){
        return hand.get(i);
    }

    public void draw(Deck deck, int numberOfDraws) {
        for (int i = 0; i < numberOfDraws; i++)
            hand.add(deck.takeCard());
    }

    public int handValue() {
        // keep track of the value of our hand and how many aces we have
        int valueOfHand = 0;
        int numberOfAces = 0;

        // loop through our hand and check each card
        for (Card card : hand) {
            // add the card's value to the value of our hand
            valueOfHand += card.getValue();
            // keep track of how many aces we have
            if(card.getFace() == Face.ACE) {
                numberOfAces++;
            }
        }

        // if we exceed 21 and have an ace, the ace's value becomes 1 instead of 11
        while(numberOfAces > 0 && valueOfHand > 21) {
            valueOfHand -= 10;
            numberOfAces--;
        }

        return valueOfHand;
    }

}