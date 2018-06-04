import java.util.Scanner;

public class ChooseOwnAdventure {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String introduction = "";

    System.out.println("You awaken in a bright forest glade.");
    System.out.println("You hear the bleating of sheep in the distance to the EAST.");
    System.out.println("You can also hear the sound of falling water to the NORTH.");

    do {
      System.out.print("\nWhich direction will you travel? ");
      introduction = keyboard.next().toLowerCase();
    } while (!introduction.equals("north") && !introduction.equals("east"));

    if (introduction.equals("east")) {
      System.out.println("\nYou come to a pasture full of grazing sheep.");
      System.out.println("Down the hill there is a small COTTAGE with smoke rising from the chimney.");
      System.out.println("You can hear the sheep crying, something may be amiss on the HILL.");

      String east = "";

      do {
        System.out.print("\nWhere will you go? ");
        east = keyboard.next().toLowerCase();
      } while (!east.equals("cottage") && !east.equals("hill"));

      if (east.equals("cottage")) {
        System.out.println("Inside the cottage a man and his daughter sit down to a large,\ndelicious looking dinner.");
        System.out.println("The DAUGHTER pats the seat next to her, inviting you to the meal.");
        System.out.println("Her FATHER mimics the gesture, smiling invitingly and batting his lashes at you.");

        String cottage = "";

        do {
          System.out.print("\nWho will you sit next to? ");
          cottage = keyboard.next().toLowerCase();
        } while (!cottage.equals("daughter") && !cottage.equals("father"));

        if (cottage.equals("daughter")) {
          System.out.println("\nYou strike up a conversation with the daughter and immediately find yourself smiling.");
          System.out.println("She is clever and pretty and charming and you cannot take your eyes away from hers.");
          System.out.println("You excuse yourselves after the meal and find your way back to the secluded glen where you first awoke.");
          System.out.println("You hold her and gaze up at the fool moon wishing the night would never end."); //sic
          System.out.println("To your horror you discover that your newly found lover is a werewolf and she eats you.");
        } else if (cottage.equals("father")) {
          System.out.println("\nThe two of you strike up a pleasant enough conversation.  You laugh.  He laughs.  It's wonderful.");
          System.out.println("He is funny and handsone and can mostly keep the food out of his beard.");
          System.out.println("You excuse yourselves after the meal and find your way back to the secluded glen where you first awoke.");
          System.out.println("His beard tickles your chin as you kiss tentatively at first.  Later,\nyour head rests on his chest and rises and falls as he breathes.");
          System.out.println("You are wholly unprepared as he deflates.  The spider swarm that inhabited his fleshy disguise swarms around you, biting and cocooning you.");
        }

      } else if (east.equals("hill")){
        System.out.println("You find yourself watching over a flock of sheep, paralyzed in fear as a wolf stalks the woodline.");
        System.out.println("You can direct the SHEEP into hiding.");
        System.out.println("Or you could brandish your sword and prepare to fight off the WOLF.");


        String hill = "";

        do {
          System.out.print("\nWhich animal do you go to? ");
          hill = keyboard.next().toLowerCase();
        } while (!hill.equals("sheep") && !hill.equals("wolf"));

        if (hill.equals("sheep")) {
          System.out.println("\nThe sheep, being sheep, follow you to a hidden hollow in the pasture.");
          System.out.println("The wolf, seeing that the sheep are now defended, stalks off.");
          System.out.println("You smile triumphantly, and decide it is time to head to the cottage.");
          System.out.println("You see the flock of sheep, their red eyes gleaming.  They smile and reveal pointed teeth.");
          System.out.println("They swarm you like piranhas (if piranhas were fluffy and cute).");
        } else if (hill.equals("wolf")) {
          System.out.println("\nWhat sword?");
          System.out.println("Oh no...");
          System.out.println("You are in trouble now.");
          System.out.println("The wolf... we'll censor this part out.  But it doesn't end well for you.");
        }
      }

    } else if (introduction.equals("north")) {
      System.out.println("You find yourself at the base of a beautiful waterfall.");
      System.out.println("Predicatably, there is a CAVE behind it.");
      System.out.println("As that may be a trap... You could just follow the RIVER.");

      String north = "";

      do {
        System.out.print("\nWhere does adventure lead you? ");
        north = keyboard.next().toLowerCase();
      } while (!north.equals("cave") && !north.equals("river"));

      if (north.equals("cave")) {
        System.out.println("The cave is dark and damp.  Something glitters in the shadows.");
        System.out.println("Light your trusty TORCH.");
        System.out.println("Something glitters?  Run over and see if it's GOLD.");

        String cave = "";

        do {
          System.out.print("\nWhat do you grab? ");
          waterfall = keyboard.next().toLowerCase();
        } while (!waterfall.equals("torch") && !waterfall.equals("gold"));

        if (waterfall.equals("torch")) {
          System.out.println("\nIt was gold!  A whole pile of it.");
          System.out.println("You start shoving it into your pockets and bag, realizing gold is pretty heavy.");
          System.out.println("When you step out of the cave you notice that you are surrounded by bandits.");
          System.out.println("Without leaving time for any witty remarks they shoot you a half dozen times..");
          System.out.println("Then they roll you into the river after taking your haul.");
        } else if (waterfall.equals("gold")) {
          System.out.println("\nIt was gold!  A whole pile of it.");
          System.out.println("You start shoving it into your pockets and bag, realizing gold is pretty heavy.");
          System.out.println("You hear some kind of flapping behind you.");
          System.out.println("This is quickly followed by the feeling of sharp teeth.");
          System.out.println("You have been eaten by a grue.");
        }

    } else if (north.equals("river")){
        System.out.println("You enjoy a lovely walk through the woods, the burbling river rolling beside you.");
        System.out.println("From a upstream on a tributary you hear SPLASHING.");
        System.out.println("In some bushes off the path you hear a RUSTLING.");


        String river = "";

        do {
          System.out.print("\nWhich sound do you investigate? ");
          river = keyboard.next().toLowerCase();
        } while (!river.equals("splashing") && !river.equals("rustling"));

        if (river.equals("splashing")) {
          System.out.println("\nThe splashing turns out to be a couple of water nymphs enjoying a bath.");
          System.out.println("They coo and invite you to come swimming with them, which you're unable to refuse.");
          System.out.println("You find yourself quickly disrobed and splashing in the water with the fae creatures.");
          System.out.println("Their smiles never fade as they drag you under the water.");
          System.out.println("They gorge themselves on your liver while you watch, your vision dimming.");
        } else if (river.equals("rustling")) {
          System.out.println("\nYou find, to your great surprise, a Lion.  It has a thorn in it's paw.");
          System.out.println("Remembering the story of Androcles, you slowly make your way to the lion and sit beside it.");
          System.out.println("Ever so gently you take the lion's paw and extract the thorn.  The lion seems immediately relieved.");
          System.out.println("Realizing that it is hungry, the lion turns on you and savages you.");
        }
      }
    }

    System.out.println("\nYou are dead.");
    // System.out.println("Good job, Marquis.")
  }
}
