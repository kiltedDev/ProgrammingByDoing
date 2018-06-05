import java.util.Scanner;

public class AlphabeticalOrder {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    String[] sorting = {
      "Carswell",
      "Jones",
      "Smith",
      "Young"
    };

    System.out.println("Good morning.  What is your last name?");
    name = keyboard.next();

    if (name.compareTo(sorting[0]) <= 0) {
      System.out.println("You won't have to wait long.");
    } else if (name.compareTo(sorting[1]) <= 0) {
      System.out.println("That's not a bad wait.");
    } else if (name.compareTo(sorting[2]) <= 0) {
      System.out.println("It's gonna be a bit.");
    } else if (name.compareTo(sorting[3]) <= 0) {
      System.out.println("You should take a seat.");
    } else {
      System.out.println("Not going anywhere for a while.");
    }
  }
}
