import java.util.Scanner;

public class AgeInFive {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    int age, ageWillBe, ageWas;
    String name;

    System.out.print( "Salutations!  What is your name, friend?\n> " );
    name = keyboard.next();

    System.out.print( "A pleasure to meet you " + name + ". How old are you?\n> " );
    age = keyboard.nextInt();

    ageWillBe = age + 5;
    ageWas = age - 5;

    System.out.println( "Did you know that in 5 years you will be " + ageWillBe );
    if (ageWas > 0) {
      System.out.println( "And five years ago you were " + ageWas + "!  Imagine that!" );
    } else {
      System.out.println( "And five years ago you weren't even born yet!  Imagine that!" );
    }
  }
}
