package labfour;
public class Game {
    // variables
    private Deck deck;
    private Player player;
    private Dealer dealer;
    private int numberOfWins;
    private int numberOfLosses;
    private int numberOfTies;

    public Game() {
        deck = new Deck(1);
        player = new Player();
        dealer = new Dealer();
        numberOfWins = 0;
        numberOfLosses = 0;
        numberOfTies = 0;

        deck.shuffle();
        startRound();
    }

    private void startRound() {
        dealer.getHand().draw(deck, 2);
        player.getHand().draw(deck, 2);

        dealer.initialize();
        player.printHand();

        // check to see if either party was dealt blackjack
        if(dealer.hasBlackjack()){
            // show that the dealer has blackJack
            dealer.printHand();

            // check if the player also has blackJack
            if(player.hasBlackjack()){
                // if both the player and the dealer have blackjack then it's a tie
                System.out.println("You both have 21, it's a tie");
                numberOfTies++;
                startRound();
            }
            else{
                System.out.println("Dealer has BlackJack, you lose.");
                dealer.printHand();
                numberOfLosses++;
                startRound();
            }
        }

        // check if the player has blackjack
        if(player.hasBlackjack()){
            System.out.println("You have Blackjack! You win!");
            numberOfWins++;
            startRound();
        }

        // the player now needs to decide whether to hit or stand
        player.makeDecision(deck);
    }
}
