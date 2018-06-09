import java.util.Random;

public class dice {
  public static void main( String[] args) {
    Random r = new Random();
    int roll1, roll2, sum;
    roll1 = 1 + r.nextInt(6);
    roll2 = 1 + r.nextInt(6);
    sum = roll1 + roll2;

    System.out.println("Here come the dice!");
    System.out.println("Roll 1: " + roll1);
    System.out.println("Roll 2: " + roll2);
    System.out.println("\nTotal: " + sum);
  }
}
