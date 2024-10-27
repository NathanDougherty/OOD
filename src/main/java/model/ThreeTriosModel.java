package model;

import players.Player;

public interface ThreeTriosModel {

  /**
   * Places a card on the grid at the specified location.
   *
   * @param player the player placing the card
   * @param card the card to be placed
   * @param row the row index of the grid
   * @param col the column index of the grid
   * @return true if the card was successfully placed, false otherwise
   */
  boolean placeCard(Player player, Card card, int row, int col);

  /**
   * Checks if the game is over (i.e., no more valid moves are available).
   *
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver();

  /**
   * Determines the winner of the game by counting owned cards.
   *
   * @return the player with the most owned cards, or null if it's a tie
   */
  Player getWinner();

  /**
   * Renders the current state of the grid as a string.
   *
   * @return a string representation of the grid for display purposes
   */
  String getGridView();
}
