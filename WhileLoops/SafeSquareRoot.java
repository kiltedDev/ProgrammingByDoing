import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double entry;

    System.out.println("SQUARE ROOT!");
    do {
      System.out.print("\tEnter a number: ");
      entry = keyboard.nextDouble();
      if (entry <= 0) {
        System.out.println("\nThat's not a number I can reasonably work with.  Try again.");
      }
    } while (entry <= 0);

    System.out.println("The Square root of "+ entry + " is " + Math.sqrt(entry) + "." );
  }
}
