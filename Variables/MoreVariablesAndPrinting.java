public class MoreVariablesAndPrinting {
  public static void main( String[] args) {
    String name, eyes, teeth, hair;
    int age, height, weight;
    double heightCM, mass;
    String[] pronouns = new String[3];

    name = "Tom Wilson";
    age = 36;
    height = 73; // inches
    weight = 185; // lbs
    eyes = "Brown";
    teeth = "White"; // Mostly
    hair = "Brown";
    heightCM = height*2.54;
    mass = weight*0.45;
    pronouns[0] = "He";
    pronouns[1] = "Him";
    pronouns[2] = "His";

    System.out.println( "Let's talk about " + name + "." );
    System.out.print( pronouns[0] + "'s " + height + " inches ");
    System.out.println("(" + heightCM + "cm) tall." );
    System.out.print( pronouns[0] + "'s " + weight + " pounds ");
    System.out.println("(" + mass + "kg) heavy." );
    System.out.println( "Actually, that's not so heavy.");
    System.out.println( pronouns[0] + "'s got " + eyes + " eyes and " + hair + " hair." );
    System.out.println( pronouns[2] + " teeth are usually " + teeth + " depending on the tea." );

    // This lins is tricky; try to get it exactly right.
    System.out.println( "If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + "."  );

  }
}
