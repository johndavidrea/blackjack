package labfour;

public class Dealer extends Person {
    public Dealer() {
        setName("Dealer");
    }

    public void initialize() {
        System.out.println("The dealer has " + getHand().getCard(0).getArticle() + " " + getHand().getCard(0));
        System.out.println("The other card is face down");
    }
}
