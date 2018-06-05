import java.util.Scanner;

public class TwoMoreQuestions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String type = "", breadbox = "";

    System.out.println("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.");

    do {
      System.out.println("\nQuestion 1) Is it an Animal, Vegetable or Mineral?");
      type = keyboard.next().toLowerCase();
    } while (!type.equals("animal") && !type.equals("vegetable") && !type.equals("mineral"));

    do {
      System.out.println("\nQuestion 2) Is it larger than a breadbox?");
      breadbox = keyboard.next().toLowerCase();
    } while (!breadbox.equals("yes") && !breadbox.equals("no"));

    System.out.println("");

    if (breadbox.equals("yes") && type.equals("animal")) {
      System.out.println("Is it a pony?  I hope it's a pony.");
    }
    if (breadbox.equals("yes") && type.equals("vegetable")) {
      System.out.println("Is it a pumpkin?\n\nWhat pumpkin?");
    }
    if (breadbox.equals("yes") && type.equals("mineral")) {
      System.out.println("Is it asteroid 99942 aka Apophis?");
    }

    if ( breadbox.equals("no") && type.equals("animal")) {
      System.out.println("Is it a squirrel?");
    }
    if (breadbox.equals("no") && type.equals("vegetable")) {
      System.out.println("Is it a small pumpkin?\n\nWhat pumpkin?");
    }
    if (breadbox.equals("no") && type.equals("mineral")) {
      System.out.println("Is it a thimble?");
    }

    System.out.println("Don't bother answering.  I'll just consider my guess correct.");
  }
}
