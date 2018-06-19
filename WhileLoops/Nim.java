import java.util.Scanner;

class Pile {
  String name;
  int stack = 3;
  public Pile(String naming) {
    name = naming;
  }
}

class Player {
  String name;
  public Player(String naming) {
    name = naming;
  }
}

public class Nim {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Pile[] gamePiles = new Pile[3];
    Player[] players = new Player[2];
    String chosen;
    int removed, turn = 0, remaining = 9;

    gamePiles[0] = new Pile("A");
    gamePiles[1] = new Pile("B");
    gamePiles[2] = new Pile("C");


    System.out.println("Salutations players.  A pleasure to meet you.");
    System.out.print("Player One, what should I call you:  ");
    players[0] = new Player(keyboard.next());
    System.out.println("Got it, " + players[0].name + "\n");

    System.out.print("And Player Two, what should I call you: ");
    players[1] = new Player(keyboard.next());
    System.out.println("Thanks, " + players[0].name + "\n");

    do {
      int p = turn%2;
      String activePlayer = players[p].name;

      System.out.println( showPiles(gamePiles) + "\n");
      System.out.print(activePlayer + ", please choose your pile: ");
      chosen = keyboard.next().toLowerCase();
      System.out.print("How many tokens will you remove from the pile: ");
      removed = keyboard.nextInt();

      gamePiles[toInt(chosen)].stack -= removed;

      turn++;
    } while ( gamePiles[0].stack > 0 || gamePiles[1].stack > 0 || gamePiles[2].stack > 0);
  }

  public static String showPiles(Pile[] piles) {
    int i;
    String gonnaSay = "";

    for (Pile p : piles) {
      gonnaSay += p.name + ": " + p.stack + "\t";
    }

    return gonnaSay;
  }

  public static int toInt(String chosen) {
    int chosenInt = 3;
    if (chosen.equals("a"))
      chosenInt = 0;
    if (chosen.equals("b"))
      chosenInt = 1;
    if (chosen.equals("c"))
      chosenInt = 2;

    return chosenInt;
  }
}
