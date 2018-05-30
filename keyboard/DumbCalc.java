import java.util.Scanner;

public class DumbCalc {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    double first, second, third, answer;

    System.out.print("What is your first number?\n>");
    first = keyboard.nextDouble();

    System.out.print("What is your second number?\n>");
    second = keyboard.nextDouble();

    System.out.print("What is your third number?\n>");
    third = keyboard.nextDouble();

    answer = (first + second + third) / 2;

    System.out.println("(" + first + " + " + second + " + " + third + " ) / 2 is..." + answer );

  }
}
