import java.util.Scanner;

public class Adventure2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String location = "streets";
    boolean girl = false, caseClosed = false;

    while (!caseClosed) {
      if (location == "streets") {
        System.out.println("You're Philly's only PI Sorcerer, on a case to find a missing child.");
        System.out.println("You've been using a tracking spell and have narrowed your search to Penn's Landing.");
        System.out.println("Your options are to check out the PARK or the sailing BOAT.");
        System.out.print("Remember, though, you're a sorcerer.  You can always cast a SPELL.\n> ");
        String action = kb.nextLine().toLowerCase();
        if (action.equals("spell") ) {
          System.out.println(spell(location) );
        } else if (action.equals("boat") ) {
          location = "boat"
        } else if (action.equals("park") ) {
          location = "park"
        }
      }

      if (location == "boat") {
        System.out.println("You're on the Spirit of Philadelphia.");
        System.out.println("This boat has a lot of history, but you can read about that later.");
        System.out.println("You don't see any sign of the girl, you can head back to the STREETS or try BELOW./n");
        String action = kb.nextLine().toLowerCase();
        if (action.equals("spell") ) {
          System.out.println(spell(location) );
        } else if (action.equals("streets") ) {
          location = "streets"
        } else if (action.equals("below") ) {
          location = "below"
        }
      }



      System.out.println("");
      caseClosed = true;
    }
  }

  public static String spell(String location) {
    String spellResult = "";
    if (location.equals("streets") ) {
      spellResult = "You try your Tracking Spell again. \nIt points towards the Spirit of Philadelphia, the BOAT.";
    }
    return spellResult;
  }
}

// Start on streets
// directions school & bridge & car
// SPELL: Location - girl towards bridge
//if girl, car = win

// school
// SPELL finds locker, grafittied

// bridge
// directions back to streets or warehouse
// if girl, then troll
// if not, then search of docks turns

// warehouse
// directions leave
// girl can be heard crying
// SPELL Light, show girl

// search
// directions talk to girl
// if light, talking
// if not, screams and runs away.  Lost trail
