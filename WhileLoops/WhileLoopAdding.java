import java.util.Scanner;

public class WhileLoopAdding {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int total = 0, incoming = 1;

    System.out.println("I will add whatever you give me together.  Hand me a zero and I'm done.");

    while (incoming != 0) {
      if (total > 0) {
        System.out.println("The total so far is " + total);
      }
      System.out.print("Number: ");
      incoming = keyboard.nextInt();
      total = total + incoming;
    }

    System.out.println("The final total is " + total);
  }
}
