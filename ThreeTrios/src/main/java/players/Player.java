package players;

import model.Card;
import java.util.List;

public interface Player {
  String getColor();
  List<Card> getHand();
  void addCard(Card card);
  void removeCard(Card card);
}
