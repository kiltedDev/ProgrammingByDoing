import java.util.Scanner;

public class UserData {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String firstName, lastName, login;
    int grade, studentID;
    double gpa;

    System.out.println( "Please enter the following information so I can sell it for a profit!\n> " );

    System.out.print( "First Name:\t" );
    firstName = keyboard.next();

    System.out.print( "Last Name:\t" );
    lastName = keyboard.next();

    System.out.print( "Grade:\t\t" );
    grade = keyboard.nextInt();

    System.out.print( "Student ID:\t" );
    studentID = keyboard.nextInt();

    System.out.print( "Login:\t\t" );
    login = keyboard.next();

    System.out.print( "GPA:\t\t" );
    gpa = keyboard.nextDouble();

    System.out.println( "\nYour information:" );
    System.out.println( "\tLogin:\t" + login );
    System.out.println( "\tID:\t" + studentID );
    System.out.println( "\tName:\t" + lastName + ", " + firstName );
    System.out.println( "\tGPA:\t" + gpa );
    System.out.println( "\tGrade:\t" + grade );

  }
}
