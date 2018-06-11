import java.util.Scanner;

public class CountingWhile {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it for you." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.println( "How many times would you like to see your message?" );
		System.out.print( "Count: " );
		int count = keyboard.nextInt();

		int n = 0;
		while ( n < count )
		{
			System.out.println( ((n+1)*10) + ". " + message );
			n++;
		}
	}
}
