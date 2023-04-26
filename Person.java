package labfour;

public class Person {

    private Hand hand;
    private String name;

    Person () {
        this.hand = new Hand();
        this.name = "";
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void hit(Deck deck) {
        this.hand.draw(deck, 1);
    }

    public void printHand () {
        System.out.println(this.name + "'s hand: [" + this.hand.handValue() + "] " + this.hand);
    }

    public boolean hasBlackjack () {
        return (this.getHand().handValue() == 21) ? true : false;
    }
}
