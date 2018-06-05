import java.util.Scanner;

public class AgeMessages3 {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;

    System.out.print("Salutations!  What is your name?\n> ");
    name = keyboard.next();

    System.out.print("A pleasure to meet you, " + name + ". How old are you?\n> ");
    age = keyboard.nextInt();

    if ( age < 16) {
      System.out.println("You cannot drive, " + name + ".");
    }

    if ( 16 <= age && age < 18) {
      System.out.println("You can drive, " + name + ", but you cannot vote.");
    }

    if ( 18 <= age && age < 25) {
      System.out.println("You can drive and vote, " + name + ", but you cannot rent a car.");
    }

    if ( 25 <= age) {
      System.out.println("You can do pretty much anything that is legal, " + name + ".");
    }
  }
}
