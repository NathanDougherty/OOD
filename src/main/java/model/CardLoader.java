package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardLoader {

  public static List<Card> loadCards(String filename) {
    List<Card> cards = new ArrayList<>();

    try (Scanner scanner = new Scanner(new File(filename))) {
      // Read each line and create a Card object
      while (scanner.hasNextLine()) {
        String[] data = scanner.nextLine().split(" ");
        String name = data[0];
        int north = parseValue(data[1]);
        int south = parseValue(data[2]);
        int east = parseValue(data[3]);
        int west = parseValue(data[4]);

        cards.add(new Card(name, north, south, east, west));
      }
    } catch (FileNotFoundException e) {
      System.err.println("Card file not found: " + filename);
    }

    return cards;
  }

  // Helper method to parse card values (handling 'A' for 10)
  private static int parseValue(String value) {
    return value.equals("A") ? 10 : Integer.parseInt(value);
  }
}
