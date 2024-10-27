package players;

import model.Card;
import java.util.ArrayList;
import java.util.List;

 public class PlayerImpl implements Player {
   private final String color;
   private final List<Card> hand;

   public PlayerImpl(String color) {
     this.color = color;
     this.hand = new ArrayList<>();
   }
   @Override
   public String getColor() {
     return color;
   }

   @Override
   public List<Card> getHand() {
     return hand;
   }

   @Override
   public void addCard(Card card) {
     hand.add(card);
   }

   @Override
   public void removeCard(Card card) {
     hand.remove(card);
   }
 }