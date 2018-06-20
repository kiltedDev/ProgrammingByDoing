import java.util.Scanner;

public class AddingValuesForLoop {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int total = 0;

    System.out.print("Number: ");
    int endPoint = keyboard.nextInt();

    for (int i = 1; i <= endPoint; i++) {
      total += i;
      System.out.print(i + " ");
    }

    System.out.println("\nThe sum is " + total + ".");
  }
}
