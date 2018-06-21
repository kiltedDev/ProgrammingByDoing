import java.util.Random;
import java.util.Scanner;

public class Blackjack {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);
    int[] player = new int[] {0,0,0,0,0,0,0,0,0,0,0};
    int[] dealer = new int[] {0,0,0,0,0,0,0,0,0,0,0};
    int pScore, dScore, nextCard = 2, draw;
    char action = 'h';

    player[0] = 2 + r.nextInt(10);
    player[1] = 2 + r.nextInt(10);
    pScore = findScore(player);
    dealer[0] = 2 + r.nextInt(10);
    dealer[1] = 2 + r.nextInt(10);
    System.out.println("Welcome to the table.  I am called Third.");

    System.out.println("\nYou drew " + player[0] + " and " + player[1] + ".\n");
    do {
      System.out.println(showHand(player, "Your"));
      System.out.println("Your total is " + pScore + ".");
      System.out.println("\nThe dealer is showing a " + dealer[0] + ".");

      System.out.print("Would you like to hit or stay? ");
      action = keyboard.next().toLowerCase().charAt(0);
      if (action == 'h') {
        draw = 2 + r.nextInt(10);
        System.out.println("You draw a " + draw + ".\n");
        player[nextCard] = draw;
        pScore = findScore(player);
        nextCard++;
      }
    } while (action == 'h' && pScore < 21);

    //Bust
    if (pScore > 21) {
      System.out.println("Your total is " + pScore + ".");
      System.out.println("You have busted. House wins.");
      //Blackjack
    } else if ( pScore == 0) {
      System.out.println("Your total is " + pScore + ".");
      System.out.println("Blackjack! You win");
      //Dealer's turn
    } else {
      System.out.println("\nAlright, Dealer's turn.");
      System.out.println("He reveals a " + dealer[1] + ".");
      nextCard = 2;
      dScore = findScore(dealer);
      System.out.println(showHand(dealer, "Dealer's"));
      System.out.println("His score is a " + dScore + ".");

      while (dScore < 17) {
        draw = 2 + r.nextInt(10);
        dealer[nextCard] = draw;
        System.out.println("\nDealer draws a " + draw + ".");
        System.out.println(showHand(dealer, "Dealer's"));
        nextCard++;
        dScore = findScore(dealer);
        System.out.println("His score is a " + dScore + ".");
      }

      if (dScore > 21 ) {
        System.out.println("\nYOU WIN! DEALER BUSTS!");
      } else if (pScore > dScore) {
        System.out.println("\nYOU WIN!");
      } else {
        System.out.println("\nYOU LOSE!");
      }
    }
  }

  public static int findScore(int[] cards) {
    int score = 0;

    for (int c : cards) {
      score += c;
    }

    return score;
  }

  public static String showHand (int[] cards, String name) {
    String hand = name + " hand: ";

    for (int c : cards) {
      if (c > 0){
        hand += c + " ";
      }
    }

    return hand;
  }
}
