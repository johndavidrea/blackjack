package labfour;

public enum Face {
    // these are the faces of the cards in our deck and their respective values in blackjack
    ACE("ace", 11),
    TWO("two", 2),
    THREE("three", 3),
    FOUR("four", 4),
    FIVE("five", 5),
    SIX("six", 6),
    SEVEN("seven", 7),
    EIGHT("eight", 8),
    NINE("nine", 9),
    TEN("ten", 10),
    JACK("jack", 10),
    QUEEN("queen", 10),
    KING("king", 10),;

    // variables
    String faceName;
    int faceValue;

    // constructor
    Face(String faceName, int faceValue) {
        this.faceName = faceName;
        this.faceValue = faceValue;
    }

    // allows us to output the string instead of the all-caps enum type
    public String toString() {
        return faceName;
    }
}