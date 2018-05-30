import java.util.Scanner;

public class BMICalc {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    double m, kg, bmi;

    System.out.print("What is your height (m)?\n>");
    m = keyboard.nextDouble();

    System.out.print("What is your mass?\n>");
    kg = keyboard.nextDouble();

    bmi = kg / (m*m); 

    System.out.println("Your BMI is " + bmi );

  }
}
