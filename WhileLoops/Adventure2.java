import java.util.Scanner;

public class Adventure2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String location = "streets", action;
    boolean  inactive = false, girlFound = false, eagles = false;

    while (!inactive) {
      if (location == "streets") {
        System.out.println("You're Philly's only PI Sorcerer, on a case to find a missing child.");
        System.out.println("You've been using a tracking spell and have narrowed your search to Penn's Landing.");
        System.out.println("Your options are to check out the PARK or the sailing BOAT.");
        System.out.print("Remember, though, you're a sorcerer. You can always cast a SPELL.\n\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("park") ) {
          location = "park";
        } else if (action.equals("boat") ) {
          location = "boat";
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      if (location == "park") {
        System.out.println("You find yourself in the Penn's Landing hammock park.");
        System.out.println("Nearby you can hear a HUMAN snoring in one of the hammocks. The park's only occupant.");
        System.out.println("There's also the pedestrian BRIDGE back to where you parked your car. You could just go home and nap.");
        System.out.print("A third option is backtracking to the STREETS.\n\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("human") ) {
          location = "human";
        } else if (action.equals("bridge") ) {
          location = "bridge";
        } else if (action.equals("streets") ) {
          location = "streets";
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      if (location == "boat") {
        System.out.println("You're on the Spirit of Philadelphia.");
        System.out.println("This boat has a lot of history, but you can read about that later.");
        System.out.println("You don't see any sign of the girl, you can explore the tiny BOARDWALK or try BELOW./n");
        System.out.println("Or you could always head back to the STREETS\n\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("boardwalk") ) {
          location = "boardwalk";
        } else if (action.equals("below") ) {
          location = "below";
        } else if (action.equals("streets") ) {
          location = "streets";
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      if (location == "human") {
        System.out.println("That's no human!  That's a vampire of the Blue Court.\nIts blue lips and the blue smoke leaking from its nostrils are a dead give away.");
        System.out.println("Behind you are the recesses of the PARK, the shadows there seem welcoming at the moment.");
        System.out.println("Alternately, you could try to ROUSE it and as if it's seen the girl.");
        System.out.print("\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("park") ) {
          location = "park";
        } else if (action.equals("rouse") ) {
          System.out.println("You've roused the vampire.  It opens its eyes and, when it does,\nyou fall catatonic to the ground. You are dead.");
          inactive = true;
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      if (location == "bridge") {
        if (girlFound) {
          System.out.println("You begin crossing the bridge, but a massive clawed hand stretches out from below.");
          System.out.println("It appears this bridge has a Troll.  Their monstrous head sniffs noisily in your direction.");
          System.out.print("'I smell a young Daughter of Eve.  GIVE her to me.'\n\n> ");
          System.out.print("\n> ");
          action = keyboard.nextLine().toLowerCase();
        } else {
          System.out.println("You haven't found the girl yet.  You realize this and turn back.");
          location = "park";
        }
        if (action.equals("park") ) {
          location = "park";
        } else if (action.equals("give") ) {
          System.out.println("You Monster!");
          System.out.println("You hand over the girl and head back to your car.");
          System.out.println("When you get home your cat cannot look at you.");
          inactive = true;
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
          System.out.println("Quick, while it's distracted with new warts!");
          System.out.println("You run to the car and, with girl in tow, escape this craziness.");
          System.out.println("She is very happy to be with her parents and\nno longer wishes to be a mermaid.");
          inactive = true;
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      if (location == "boardwalk") {
        if (eagles) {
          System.out.println("The boardwalk is covered in seagull bits.  This is surprisingly satisfying.");
        } else {
          System.out.println("The boardwalk is covered in angry seagulls.  Someone should do something about them.");
        }
        System.out.println("Your only real option is to head back to the BOAT.");
        System.out.print("\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("boat") ) {
          if (girlFound) {
            System.out.println("You've already found the girl.  Get moving.");
          } else {
            location = "boat";
          }
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
          eagles = true;
        }
      }

      if (location == "below") {
        System.out.println("You can hear a child sniffling down here.");
        System.out.println("You should probably opt against opening with a FIREBALL, you could STUMBLE forward and try to comfort her.");
        System.out.print("\n> ");
        action = keyboard.nextLine().toLowerCase();
        if (action.equals("boat") ) {
          System.out.println("You should probably save the girl.\nYou came all this way and all.");
        } else if (action.equals("fireball") ) {
          System.out.println("The boat erputs into flames like grass in a California summer.\nYou are, unfoturnately, still aboard.\nThis was a terrible idea.");
          inactive = true;
        } else if (action.equals("comfort") ) {
          System.out.println("She seems happy for some human contact and clutches you, crying.");
          System.out.println("'The mermaids were going to eat me,' she confides.");
          girlFound = true;
          location = "boat";
        } else if (action.equals("spell") ) {
          System.out.println(spell(location) );
        }
      }

      System.out.println("");
    }
    System.out.println("Fin!");
  }

  public static String spell(String location) {
    String spellResult = "";
    if (location.equals("streets") ) {
      spellResult = "You cast your patented Memory spell.\nYou're definitely going to remember where you parked.";
    } else if (location.equals("park") ){
      spellResult = "From the Depths of the Nevermind you call forth an eldtrich and arcane breeze.\nIt makes the wind chimes tintinabulate delightfully.";
    } else if (location.equals("boat") ){
      spellResult = "You spell shreds the veil hiding a murderous mermaid. She flees back into the waters.";
    } else if (location.equals("human") ){
      spellResult = "You cast a sleep spell on the vampire.  It's Super Effective!";
    } else if (location.equals("bridge") ){
      spellResult = "'Bufonidare!' you bellow and the troll turns into a common toad.\nExtra warty.  You know this won't last long.";
    } else if (location.equals("dock") ){
      spellResult = "You summon a trio of celestial eagles!  They tear into the seagulls.  It's kind of gruesome actually.";
    } else if (location.equals("below") ){
      spellResult = "'Lumos' brings your will to bear on the eldritch amethys you wear.\nIt shines with a purple light and shines on a\nnine year old girl, huddling in the corner.";
    }
    return spellResult;
  }
}
