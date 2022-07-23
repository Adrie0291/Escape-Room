package WarGame;


public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Jacek");
        Player playerSecond = new Player("Stefan");

        War wojna = new War(playerOne, playerSecond);

        wojna.playerFirst.setCards(wojna.deckFirst());
        wojna.platerSecond.setCards(wojna.deckSecond());

        System.out.println(wojna.deckFirst());
        System.out.println(wojna.deckSecond());

        wojna.strongerCard();

    }
}
