package org.example;

import model.Grid;
import model.Card;
import model.CardLoader;
import model.ThreeTriosModel;
import model.ThreeTriosModelImpl;
import players.Player;
import players.PlayerImpl;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create a 3x3 grid
    Grid grid = new Grid(3, 3);

    // Create players
    Player redPlayer = new PlayerImpl("RED");
    Player bluePlayer = new PlayerImpl("BLUE");

    // Load cards from the configuration file
    List<Card> cards = CardLoader.loadCards("src/main/resources/cards/cards_example.txt");

    // Display the loaded cards
    System.out.println("Loaded Cards:");
    for (Card card : cards) {
      System.out.println(card);
    }

    // Create sample cards for demonstration (optional, if not using loaded cards)
    Card fireDragon = new Card("FireDragon", 8, 3, 6, 2);
    Card iceGiant = new Card("IceGiant", 2, 7, 5, 9);

    // Initialize the game model
    ThreeTriosModel model = new ThreeTriosModelImpl(grid, redPlayer, bluePlayer);

    // Simulate placing some cards (you could loop through loaded cards if desired)
    model.placeCard(redPlayer, fireDragon, 1, 1);
    System.out.println("After Red's turn:");
    System.out.println(model.getGridView());

    model.placeCard(bluePlayer, iceGiant, 0, 0);
    System.out.println("After Blue's turn:");
    System.out.println(model.getGridView());

    // Check if the game is over and print the result
    if (model.isGameOver()) {
      Player winner = model.getWinner();
      if (winner != null) {
        System.out.println("Winner: " + winner.getColor());
      } else {
        System.out.println("It's a tie!");
      }
    } else {
      System.out.println("Game is still ongoing.");
    }
  }
}
