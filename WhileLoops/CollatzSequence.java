import java.util.Scanner;

public class CollatzSequence {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    int n, count = 0, largest = 0;

    System.out.print("Starting number: ");
    n = keyboard.nextInt();

    while (n!=1) {
      if (n%2 == 0) {
        n = n/2;
      } else {
        n = (n*3 + 1);
      }
      System.out.print("\t" + n);

      count++;
      if (count%7 == 0) {
        System.out.println();
      }

      if (n > largest) {
        largest = n;
      }

      Thread.sleep(100);
    }
      System.out.println("\nSequence took "+ count + " steps to complete.");
      System.out.println(largest + " was the highest number encountered.");
  }
}
