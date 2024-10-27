package model;

public class Grid {
  private final Cell[][] cells;

  public Grid(int rows, int cols) {
    cells = new Cell[rows][cols];
    initializeGrid();
  }

  private void initializeGrid() {
    for (int r = 0; r < cells.length; r++) {
      for (int c = 0; c < cells[r].length; c++) {
        cells[r][c] = new Cell();  // Default to empty cells
      }
    }
  }

  public boolean placeCard(int row, int col, Card card, String owner) {
    if (cells[row][col].isEmpty()) {
      cells[row][col].setCard(card, owner);
      return true;
    }
    return false;
  }

  public boolean isFull() {
    for (Cell[] row : cells) {
      for (Cell cell : row) {
        if (cell.isEmpty()) return false;
      }
    }
    return true;
  }

  public int countOwnedCards(String owner) {
    int count = 0;
    for (Cell[] row : cells) {
      for (Cell cell : row) {
        if (owner.equals(cell.getOwner())) count++;
      }
    }
    return count;
  }

  public String render() {
    StringBuilder sb = new StringBuilder();
    for (Cell[] row : cells) {
      for (Cell cell : row) {
        sb.append(cell.render()).append(" ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
