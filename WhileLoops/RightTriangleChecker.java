import java.util.Scanner;

public class RightTriangleChecker {
  public static void main(String[] args) {
    int a, b, c;

    System.out.println("Enter three positive integers in ascending order:");

    a = takeSides(0,1);
    b = takeSides(a,2);
    c = takeSides(b,3);

    System.out.println("Your three sides are " + a + " " + b + " " + c + ".");
    boolean righty = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
    if (righty) {
      System.out.println("This is a right triangle.");
    } else {
      System.out.println("Sorry, this is not a right triangle.");
    }
  }

  public static int takeSides(int oldSide,  int workingSide) {
    int newSide;
    Scanner keyboard = new Scanner(System.in);

    do {
      System.out.print("Side "+ workingSide +": ");
      newSide = keyboard.nextInt();
      if (newSide < 1)
        System.out.println("Positive intergers only please. Try again.");
      else if (newSide < oldSide)
        System.out.println(newSide + " is smaller than " + oldSide + ".  Try again.");
    } while (newSide < 1 || newSide < oldSide);

    return newSide;
  }
}
