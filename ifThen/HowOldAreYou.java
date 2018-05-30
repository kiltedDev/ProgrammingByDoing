import java.util.Scanner;

public class HowOldAreYou {
	public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String name;
		int age;

    System.out.print("What's your name?\n> ");
    name = keyboard.nextLine();

    System.out.print("Alright, " + name + " how old are you?\n> ");
    age = keyboard.nextInt();

		if ( age < 16 ) {
			System.out.println( "You can't drive, " + name + "." );
		}

		if ( age < 18 ) {
      System.out.println( "You can't vote, " + name + "." );
		}

		if ( age < 21 ) {
      System.out.println( "You can't drink, " + name + "." );
		}

		if ( age < 25 ) {
      System.out.println( "You can't rent a car, " + name + "." );
		}

		if ( age >= 25 ) {
      System.out.println( "You can do anything that's legal, " + name + "." );
		}
	}
}
