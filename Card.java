package labfour;

public class Card {
    // variables
    private Suit suit;
    private Face face;

    // constructor for making a new card
    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    // return the name of our card
    public String toString() {
        return (face + " of " + suit);
    }

    // return the suit of our card
    public Suit getSuit() {
        return suit;
    }

    // return the face of our card
    public Face getFace() {
        return face;
    }

    // return the value of our card
    public int getValue() {
        return face.faceValue;
    }

    public String getArticle() {
        if (face == Face.ACE || face == Face.EIGHT) {
            return "an";
        } else {
            return "a";
        }
    }
}
