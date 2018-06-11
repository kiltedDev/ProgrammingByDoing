import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int guess, answer = 1 + r.nextInt(10), tries = 1;

    System.out.println("HA!  I AM THINKING OF NUMBER.  YOU CANNOT GUESS NUMBER,,,");
    System.out.print("GO AHEAD AND TRY. 1-10.  DO IT NERD.\n> ");
    guess = keyboard.nextInt();

    while (guess != answer) {
    System.out.print("MWA HA HA!  FOOL YOU WERE WRONG!  I WAS RIGHT!  I BET YOU STILL CAN'T GUESS IT!\n>");
    guess = keyboard.nextInt();
    tries++;
    }

    System.out.println("OH NOES!!!1! YOU DID IT! IT WAS TOTALLY " + answer);
    System.out.println("BUT!,! IT TOOK YOU, LIKE, " + tries + " TIMES TO GET IT!  I STILL WIN!");

  }
}
