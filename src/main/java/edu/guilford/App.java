package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create a cards object that instantiates a card
        cards card1 = new cards("Hearts", "Ace", 1, "Player 1");

        //create an array that will store the cards object
        cards[] deck = new cards[52];

        //create an array that includes all the standard cards in a deck and a player name to instantiate the cards object
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] names = {"Player 1", "Player 2", "Player 3", "Player 4"};

        //create a loop that will create random cards object and store it in the array
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new cards(suits[(int)(Math.random() * 4)], ranks[(int)(Math.random() * 13)], (int)(Math.random() * 13) + 1, names[(int)(Math.random() * 4)]);
        }

        //create a loop that prints out the array
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }

        //find the cards that player 4 has
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getName().equals("Player 4")) {
                System.out.println(deck[i]);
            }
        }

        //find the cards that player 4 has that are hearts
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getName().equals("Player 4") && deck[i].getSuit().equals("Hearts")) {
                System.out.println(deck[i]);
            }
        }

        //find the cards that player 4 has that are hearts and have a value of 10

        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getName().equals("Player 4") && deck[i].getSuit().equals("Hearts") && deck[i].getValue() == 10) {
                System.out.println(deck[i]);
            }
        }

        //find the player that has the ace of spades and print out their name, if no player is found print out "No player has the ace of spades"
        boolean found = false;
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].getRank().equals("Ace") && deck[i].getSuit().equals("Spades")) {
                System.out.println(deck[i].getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No player has the ace of spades");
        }

        






    

        


    }
}
