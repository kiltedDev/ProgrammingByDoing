import java.util.Scanner;
import java.util.Random;

public class HighLoLimited {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int guess, solution, tries = 1, limit;

    limit = 7;
    solution = 1+ r.nextInt(100);
    solution = 50;

    System.out.print("I hold in my mind a number between 1 and 100.  Please try to guess that number.\n> ");
    guess = keyboard.nextInt();

    while (guess != solution && tries < limit) {
      if (guess > solution ) {
        System.out.println("\nMy apologies, You've guessed too high.  Best of luck in your next attempt.");
      } else {
        System.out.println("\nMy apologies, You've guessed too low.  Best of luck in your next attempt.");
      }
      tries++;

      System.out.print("Guess #" + tries + ": ");
      guess = keyboard.nextInt();
    }

    if (guess == solution) {
      System.out.println("\nWell done.  That is correct.");
    } else {
      System.out.println("\nSo sorry.  It appears you have run out of guesses.");
    }
  }
}
