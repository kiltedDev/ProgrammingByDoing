import java.util.Scanner;

public class BMICalcImperial {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    double inches, lbs, m, kg, bmi;

    System.out.print("What is your height (feet only)?\n>");
    inches  = keyboard.nextDouble() * 12;

    System.out.print("What is your remaining height in inches?\n>");
    inches = keyboard.nextDouble() + inches;

    System.out.print("What is your weight (pounds)?\n>");
    lbs = keyboard.nextInt();

    m = inches * 0.0254;
    kg = lbs * 0.453;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi );

  }
}
