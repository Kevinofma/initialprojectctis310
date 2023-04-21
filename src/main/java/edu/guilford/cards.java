package edu.guilford;

public class cards {
    
    //attributes with suit, rank, value, and the name of the player who has the card
    private String suit;
    private String rank;
    private int value;
    private String name;
    
    //constructors
    public cards(String suit, String rank, int value, String name) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.name = name;
    }

    //create an array that includes all the standard cards in a deck 
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] names = {"Player 1", "Player 2", "Player 3", "Player 4"};

    //constuctor that will create random cards object and store it in the array
    public cards() {
        this.suit = suits[(int)(Math.random() * 4)];
        this.rank = ranks[(int)(Math.random() * 13)];
        this.value = (int)(Math.random() * 13) + 1;
        this.name = names[(int)(Math.random() * 4)];
    }
     

    //getters and setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString method

    @Override

    public String toString() {

        return "cards{" + "suit=" + suit + ", rank=" + rank + ", value=" + value + ", name=" + name + '}';

    }

    //helper method

    public boolean isHearts() {

        return suit.equals("Hearts");

    }

    public boolean isDiamonds() {

        return suit.equals("Diamonds");

    }

    public boolean isSpades() {

        return suit.equals("Spades");

    }

    public boolean isClubs() {

        return suit.equals("Clubs");

    }

    public boolean isAce() {

        return rank.equals("Ace");

    }

    public boolean is2() {

        return rank.equals("2");

    }

    public boolean is3() {

        return rank.equals("3");

    }

    public boolean is4() {

        return rank.equals("4");

    }

    public boolean is5() {

        return rank.equals("5");

    }

    public boolean is6() {

        return rank.equals("6");

    }

    public boolean is7() {

        return rank.equals("7");

    }

    public boolean is8() {

        return rank.equals("8");

    }

    public boolean is9() {

        return rank.equals("9");

    }

    public boolean is10() {

        return rank.equals("10");

    }

    public boolean isJack() {

        return rank.equals("Jack");

    }

    public boolean isQueen() {

        return rank.equals("Queen");

    }

    public boolean isKing() {

        return rank.equals("King");

    }

    public boolean isPlayer1() {

        return name.equals("Player 1");

    }

    public boolean isPlayer2() {

        return name.equals("Player 2");

    }

    public boolean isPlayer3() {

        return name.equals("Player 3");

    }

    public boolean isPlayer4() {

        return name.equals("Player 4");

    }


}
