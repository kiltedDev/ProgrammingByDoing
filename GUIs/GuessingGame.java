import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int guess, answer = 4;

    System.out.println("HA!  I AM THINKING OF NUMBER.  YOU CANNOT GUESS NUMBER,,,");
    System.out.print("GO AHEAD AND TRY. 1-10.  DO IT NERD. > ");
    guess = keyboard.nextInt();

    if (guess == answer) {
      System.out.println("OH NOES!!!1! YOU DID IT! IT WAS TOTALLY " + answer);
    } else {
      System.out.println("MWA HA HA!  FOOL YOU WERE WRONG!  I WAS RIGHT!  IT WAS " + answer);
    }
  }
}
