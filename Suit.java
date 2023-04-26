package labfour;

public enum Suit {
    // these are the suits of our deck
    CLUB("clubs"),
    DIAMOND("diamonds"),
    HEART("hearts"),
    SPADE("spades");

    // variables
    String suitName;

    // constructor
    Suit(String suitName) {
        this.suitName = suitName;
    }

    // allows us to output the string instead of the all-caps enum type
    public String toString() {
        return suitName;
    }

}

