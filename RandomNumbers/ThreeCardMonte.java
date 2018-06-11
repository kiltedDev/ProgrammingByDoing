import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int i, guess = 0, ace;
    String[] cards = new String[3];

    ace = r.nextInt(3);

    for (i=0; i<3; i++) {
      if (i == ace) {
        cards[i] = "AA";
      } else {
        cards[i] = "##";
      }
    }

    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.\n");

    do {
      System.out.println("Which one is the Ace?\n");
      System.out.println("\t##\t##\t##");
      System.out.println("\t##\t##\t##");
      System.out.println("\t1\t2\t3");
      System.out.print("> ");
      guess = keyboard.nextInt();
    } while (guess < 1 || guess > 3);


    System.out.println("");
    if ( guess-1 == ace ) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");
    } else {
      System.out.println("Ha! Fast Eddie wins again! The ace was card number " + (ace + 1) + ".\n");
    }

    System.out.println("\t" + cards[0] + "\t" + cards[1] + "\t" + cards[2]);
    System.out.println("\t" + cards[0] + "\t" + cards[1] + "\t" + cards[2]);
    System.out.println("\t1\t2\t3");
  }
}
