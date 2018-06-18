// instructions said to avoid testing the variables to make sure they were viable.
// instructions also said to not worry about having negatives in my stacks.

import java.util.Scanner;

class Pile {
  String name;
  int stack = 3;
}

public class BabyNim {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Pile[] ourPiles = new Pile[3];
    String chosen;
    int removed;

    ourPiles[0] = new Pile();
    ourPiles[0].name = "A";
    ourPiles[1] = new Pile();
    ourPiles[1].name = "B";
    ourPiles[2] = new Pile();
    ourPiles[2].name = "C";

    while (ourPiles[0].stack > 0 || ourPiles[1].stack > 0 || ourPiles[2].stack > 0) {
      System.out.println( showPiles(ourPiles) + "\n");
      System.out.print("Choose a pile: ");
      chosen = keyboard.next().toLowerCase();
      System.out.print("How many tokens to remove from the pile: ");
      removed = keyboard.nextInt();

      ourPiles[toInt(chosen)].stack -= removed;
    }

    System.out.println( showPiles(ourPiles) + "\n");
    System.out.println("All piles are empty.  Well done!");
  }

  public static String showPiles(Pile[] piles) {
    int i;
    String currentState = "";

    for (Pile p : piles) {
      currentState += p.name + ": " + p.stack + "\t";
    }

    return currentState;
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
