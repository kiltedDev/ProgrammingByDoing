import java.util.Scanner;

public class AskingQuestions {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    int age;
    String feet, inches, height;
    double weight;

    System.out.print( "How old are you?\n> " );
    age = keyboard.nextInt();

    System.out.print( "How many feet tall are you?\n> " );
    feet = keyboard.next();

    System.out.print( "And how many inches past " + feet + " feet tall are you?\n> " );
    inches = keyboard.next();
    
    height = feet + "\"" + inches + "\'";

    System.out.print( "How much do you weigh?\n> " );
    weight = keyboard.nextDouble();

    System.out.println( "So you're " + age + " years old, " + height + " tall and " + weight + " heavy." );
  }
}
