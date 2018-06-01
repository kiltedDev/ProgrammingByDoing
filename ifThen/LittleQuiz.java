import java.util.Scanner;

public class LittleQuiz {
  public static void main( String[] args ) {
    Scanner keyboard =  new Scanner(System.in);

    int answer, score = 0;

    System.out.println("Alright class, I hope you've prepared for this pop quiz.");

    System.out.println("Which house is the greatest house at Hogwarts?");
    System.out.println("\t1) Gryffindor\n\t2) Hufflepuff\n\t3) Ravenclaw\n\t4) Slytherin");
    answer = keyboard.nextInt();
    if (answer == 4 ) {
      System.out.println("\nThat is correct!");
      score++;
    } else {
      System.out.println("\nThat is absurd");
    }

    System.out.println("\nWhat was Gandalf's greatest spell?");
    System.out.println("\t1) Pine Cones\n\t2) Summon Eagles\n\t3) Wait, was that it?");
    answer = keyboard.nextInt();
    if (answer == 1 ) {
      System.out.println("\nI agree!");
      score++;
    } else {
      System.out.println("\nInteresting...");
    }

    System.out.println("\nWhich Harry is the best Harry Dresden?");
    System.out.println("\t1) Storm Front\n\t2) Summer Knight\n\t3) Changes\n\t4) Skin Game");
    answer = keyboard.nextInt();
    if (answer == 3 ) {
      System.out.println("\nTotes McGoats!");
      score++;
    } else {
      System.out.println("\nI dunno");
    }

    System.out.println("You got " + score + " answers correct.  100 points to Slytherin");
  }
}
