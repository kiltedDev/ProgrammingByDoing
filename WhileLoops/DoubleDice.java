import java.util.Random;

public class DoubleDice {
  public static void main( String[] args) {
    Random r = new Random();
    int roll1=0, roll2=1, sum;

    System.out.println("Here come the dice!");
    
    while (roll1 != roll2) {
      roll1 = 1 + r.nextInt(6);
      roll2 = 1 + r.nextInt(6);
      sum = roll1 + roll2;

      System.out.println("\nRoll 1: " + roll1);
      System.out.println("Roll 2: " + roll2);
      System.out.println("\nTotal: " + sum);
    }
  }
}
