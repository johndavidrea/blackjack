package labfour;

import java.util.Scanner;

public class Player extends Person {

    Scanner input = new Scanner(System.in);

    public Player() {
        setName("Player");
    }

    public void makeDecision(Deck deck) {
        String decision = "";
        System.out.println("Would you like to hit or stand?");
        decision = input.nextLine();

        if(decision == "hit") {
            this.hit(deck);
        }
    }

}
