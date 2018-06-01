import java.util.Scanner;

public class SpaceBoxing {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    int weight, planet = 0;
    Double gravity, planetaryWeight;

    System.out.print("Please enter your current Earth weight: ");
    weight = keyboard.nextInt();

    System.out.println("I have information for the following planets:");
    System.out.println("\t1. Venus   2. Mars    3. Jupiter");
    System.out.println("\t4. Saturn  5. Uranus  6. Neptune");
    do {
      System.out.print("\nOn which planet are you competing? ");
      planet = keyboard.nextInt();
    } while (planet < 1 || planet > 6);

    if ( planet == 1 ) {
      gravity = 0.78;
		} else if ( planet == 2 ) {
      gravity = 0.39;
		} else if ( planet == 3 ) {
      gravity = 2.65;
		} else if ( planet == 4 ) {
      gravity = 1.17;
		} else if ( planet == 5 ) {
      gravity = 1.05;
		} else {
      gravity = 1.23;
		}

    planetaryWeight = weight * gravity;

    System.out.println("Your weight would be " + planetaryWeight + " pounds on that planet.");
  }
}
