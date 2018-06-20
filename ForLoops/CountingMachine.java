import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Count to: ");
    int destination = keyboard.nextInt();

    for (int n = 0; n <= destination; n++) {
      System.out.print(n + "  ");
    }
    System.out.println();
  }
}
