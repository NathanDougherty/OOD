package model;

public class Card {
  private final String name;
  private final int north;
  private final int south;
  private final int east;
  private final int west;

  public Card(String name, int north, int south, int east, int west) {
    this.name = name;
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
  }

  public int getAttackValue(Direction dir) {
    switch (dir) {
      case NORTH: return north;
      case SOUTH: return south;
      case EAST: return east;
      case WEST: return west;
      default: throw new IllegalArgumentException("Invalid direction");
    }
  }

  public String getName() {
    return name;
  }
}
