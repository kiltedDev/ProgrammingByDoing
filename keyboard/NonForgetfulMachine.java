import java.util.Scanner;

public class NonForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;
    double salary;

    System.out.print( "Hello.  What's your name?\n> " );
    name = keyboard.next();


    System.out.print( "\nNice to meet you, " + name + ".  How old are you?\n> " );
    age = keyboard.nextInt();

    System.out.print( "\n" + age + "?  That's not old at all!\nHow much do you make, "+name+"?\n> " );
    salary = keyboard.nextDouble();

    System.out.println( "\n" + salary + "!  I hope that's per hour and not per year!  LOL!" );
  }
}
