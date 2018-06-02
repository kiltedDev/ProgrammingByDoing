import java.util.Scanner;

public class TwoQuestions {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String type = "", size = "";

    System.out.println("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.");

    do {
      System.out.println("Question 1) Is it an Animal, Vegetable or Mineral?");
      type = keyboard.next().toLowerCase();
    } while (!type.equals("animal") && !type.equals("vegetable") && !type.equals("mineral"));

    do {
      System.out.println("Question 2) Is it larger than a breadbox?");
      size = keyboard.next().toLowerCase();
    } while (!size.equals("yes") && !size.equals("no"));

    if ( size.equals("yes")) {
      if (type.equals("animal")) {
        System.out.println("Is it a pony?  I hope it's a pony.");
      } else if (type.equals("vegetable")) {
        System.out.println("Is it a pumpkin?\n\nWhat pumpkin?");
      } else {
        System.out.println("Is it asteroid 99942 aka Apophis?");
      }
    } else if ( size.equals("no")) {
      if (type.equals("animal")) {
        System.out.println("Is it a squirrel?");
      } else if (type.equals("vegetable")) {
        System.out.println("Is it a small pumpkin?\n\nWhat pumpkin?");
      } else {
        System.out.println("Is it a thimble?");
      }
    }
    System.out.println("Don't bother answering.  I'll just consider my guess correct.");
  }
}
