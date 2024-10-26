package model;

import players.Player;

public class ThreeTriosModelImpl implements ThreeTriosModel {
  private final Grid grid;
  private final Player redPlayer;
  private final Player bluePlayer;
  private Player currentPlayer;

  public ThreeTriosModelImpl(Grid grid, Player red, Player blue) {
    this.grid = grid;
    this.redPlayer = red;
    this.bluePlayer = blue;
    this.currentPlayer = red;
  }

  @Override
  public boolean placeCard(Player player, Card card, int row, int col) {
    if (grid.placeCard(row, col, card, player.getColor())) {
      swapTurns();
      return true;
    }
    return false;
  }

  @Override
  public boolean isGameOver() {
    return grid.isFull();
  }

  @Override
  public Player getWinner() {
    int redCount = grid.countOwnedCards("RED");
    int blueCount = grid.countOwnedCards("BLUE");
    if (redCount > blueCount) return redPlayer;
    if (blueCount > redCount) return bluePlayer;
    return null;  // It's a tie
  }

  @Override
  public String getGridView() {
    return grid.render();
  }

  private void swapTurns() {
    currentPlayer = (currentPlayer == redPlayer) ? bluePlayer : redPlayer;
  }
}
