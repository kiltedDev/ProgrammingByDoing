import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Give me a word.\n> " );
    keyboard.next();

    System.out.print( "Give me a second word.\n> " );
    keyboard.next();

    System.out.print( "\nGreat, now give me a number.\n> " );
    keyboard.nextInt();

    System.out.print( "Hmmmm... how about a better number?\n> " );
    keyboard.nextInt();

    System.out.print( "\nThanks!  That helped a lot!" );
  }
}
