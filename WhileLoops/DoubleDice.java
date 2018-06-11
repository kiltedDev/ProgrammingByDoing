import java.util.Random;

public class DoubleDice {
  public static void main( String[] args) {
    Random r = new Random();
    int roll1, roll2, sum;

    System.out.println("Here come the dice!");

    do {
      roll1 = 1 + r.nextInt(6);
      roll2 = 1 + r.nextInt(6);
      sum = roll1 + roll2;

      System.out.println("\nRoll 1: " + roll1);
      System.out.println("Roll 2: " + roll2);
      System.out.println("\nTotal: " + sum);
    } while (roll1 != roll2);
  }
}
