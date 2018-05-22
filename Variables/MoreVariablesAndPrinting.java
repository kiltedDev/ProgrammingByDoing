public class MoreVariablesAndPrinting {
  public static void main( String[] args) {
    String myName, myEyes, myTeeth, myHair;
    int myAge, myHeight, myWeight;
    String[] pronouns = new String[3];

    myName = "Tom Wilson";
    myAge = 36;
    myHeight = 73; // inches
    myWeight = 185; // lbs
    myEyes = "Brown";
    myTeeth = "White"; // Mostly
    myHair = "Brown";
    pronouns[0] = "He";
    pronouns[1] = "Him";
    pronouns[2] = "His";

    System.out.println( "Let's talk about " + myName + "." );
    System.out.println( pronouns[0] + "'s " + myHeight + " inches tall." );
    System.out.println( pronouns[0] + "'s " + myWeight + " pounds heavy." );
    System.out.println( "Actually, that's not so heavy.");
    System.out.println( pronouns[0] + "'s got " + myEyes + " eyes and " + myHair + " hair." );
    System.out.println( pronouns[2] + " teeth are usually " + myTeeth + " depending on the tea." );

    // This lins is tricky; try to get it exactly right.
    System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "."  );

  }
}
