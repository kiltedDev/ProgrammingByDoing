import java.util.Scanner;

public class LetterAtATime {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int aCount = 0;

    System.out.print("Enter your message: ");
    String message = keyboard.nextLine();

    int l = message.length();
    System.out.println("\nYour message is " + l + " characters long.");
    System.out.println("The first character is at position 0 and is " + message.charAt(0));
    l--;
    System.out.println("The first character is at position " + l + " and is " +  message.charAt(l));


    System.out.println("\nHere are al the character, one at a time:\n");

    for (int n = 0; n <= l; n++) {
      char ourChar = message.charAt(n);
      System.out.println (n + " - '" + ourChar +"'" );
      if (ourChar == 'a' || ourChar == 'A' ) {
        aCount++;
      }
    }
    System.out.println("Your message contains the letter 'a' " + aCount + " times. Isn't that interesting?");
  }
}
