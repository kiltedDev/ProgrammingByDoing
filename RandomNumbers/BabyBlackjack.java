import java.util.Random;

public class BabyBlackjack {
  public static void main(String[] args) {
    Random r = new Random();
    int[] player = new int[2];
    int[] dealer = new int[2];
    int pScore, dScore;

    player[0] = 1 + r.nextInt(10);
    player[1] = 1 + r.nextInt(10);
    pScore = player[0] + player[1];
    dealer[0] = 1 + r.nextInt(10);
    dealer[1] = 1 + r.nextInt(10);
    dScore = dealer[0] + dealer[1];
    System.out.println("Baby Blackjack!");

    System.out.println("\nYou drew " + player[0] + " and " + player[1] + ".");
    System.out.println("Your total is " + pScore + ".");
    System.out.println("\nThe dealer drew " + dealer[0] + " and " + dealer[1] + ".");
    System.out.println("Dealer's total is " + dScore + ".\n");

    if (pScore > dScore) {
      System.out.println("YOU WIN!");
    } else {
      System.out.println("YOU LOSE!");
    }
  }
}
