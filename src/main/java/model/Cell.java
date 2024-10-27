package model;

public class Cell {
  private Card card;
  private String owner;  // "RED" or "BLUE"

  public boolean isEmpty() {
    return card == null;
  }

  public void setCard(Card card, String owner) {
    this.card = card;
    this.owner = owner;
  }

  public Card getCard() {
    return card;
  }

  public String getOwner() {
    return owner;
  }

  public String render() {
    return isEmpty() ? "_" : owner.charAt(0) + "";  // 'R' or 'B'
  }
}
