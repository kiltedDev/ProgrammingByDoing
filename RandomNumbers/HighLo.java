import java.util.Scanner;
import java.util.Random;

public class HighLo {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int guess, solution;

    solution = 1+ r.nextInt(100);
    // solution = 50;

    System.out.print("I hold in my mind a number between 1 and 100.  Please try to guess that number.\n> ");
    guess = keyboard.nextInt();

    if (guess == solution) {
      System.out.println("Well done.  That is correct.");
    } else if (guess > solution ) {
      System.out.println("My apologies, You've guessed too high.  Best of luck in your next attempt.");
    } else {
      System.out.println("My apologies, You've guessed too low.  Best of luck in your next attempt.");
    }
  }
}
