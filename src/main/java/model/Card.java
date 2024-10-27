package model;

public class Card {
  private String name;
  private int north;
  private int south;
  private int east;
  private int west;

  // Constructor
  public Card(String name, int north, int south, int east, int west) {
    this.name = name;
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
  }

  // Getter methods (optional, but useful)
  public String getName() {
    return name;
  }

  public int getNorth() {
    return north;
  }

  public int getSouth() {
    return south;
  }

  public int getEast() {
    return east;
  }

  public int getWest() {
    return west;
  }

  // Override toString to print cards nicely
  @Override
  public String toString() {
    return String.format("%s (N: %d, S: %d, E: %d, W: %d)",
      this.name, this.north, this.south, this.east, this.west);
  }
}
