import java.util.Scanner;

public class RightTriangleChecker {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int a, b, c;

    System.out.println("Enter three positive integers in ascending order:");
    do {
      System.out.print("Side 1: ");
      a = keyboard.nextInt();
      if (a < 1)
        System.out.println("Positive intergers only please.");
    } while (a < 1);

    do {
      System.out.print("Side 2: ");
      b = keyboard.nextInt();
      if (b < 1)
        System.out.println("Positive intergers only please. Try again.");
      else if (b < a)
        System.out.println(b + " is smaller than " + a + ".  Try again.");
    } while (b < 1 || b < a);

    do {
      System.out.print("Side 3: ");
      c = keyboard.nextInt();
      if (c < 1)
        System.out.println("Positive intergers only please. Try again.");
      else if (c < b)
        System.out.println(c + " is smaller than " + b + ".  Try again.");
    } while (c < 1 || c < b);

    System.out.println("Your three sides are " + a + " " + b + " " + c + ".");
    boolean righty = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
    if (righty) {
      System.out.println("This is a right triangle.");
    } else {
      System.out.println("Sorry, this is not a right triangle.");
    }
  }
}
