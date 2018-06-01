import java.util.Scanner;

public class HowOldAreYouSpecifically {
	public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String name;
		int age;

    System.out.print("What's your name? (I have the memory of a goldfish.)\n> ");
    name = keyboard.nextLine();

    System.out.print("Alright, " + name + " how old are you?\n> ");
    age = keyboard.nextInt();

		if ( age < 16 ) {
			System.out.println( "You can't drive, " + name + "." );
		} else if ( age < 18 ) {
      System.out.println( "You can drive but you can't vote, " + name + "." );
		} else if ( age < 21 ) {
      System.out.println( "You can vote but you can't can't drink, " + name + "." );
		} else if ( age < 25 ) {
      System.out.println( "You can vote but you can't rent a car, " + name + "." );
		} else {
      System.out.println( "You can do anything that's legal, " + name + "." );
		}
	}
}
