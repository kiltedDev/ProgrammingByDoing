import java.util.Scanner;

public class Adventure2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String location = "start";
    boolean  inactive = false;

    while (!inactive) {
      if (location == "start") {
        System.out.println("Description of Start.");
        System.out.println("Description of route to Option1.");
        System.out.println("Description of route to Option2.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option1") ) {
          location = "option1";
        } else if (action.equals("option2") ) {
          location = "option2";
        }
      }

      if (location == "option1") {
        System.out.println("Description of Option1.");
        System.out.println("Description of route to Option11.");
        System.out.println("Description of route to Option12.");
        System.out.println("Description of route to Start.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option11") ) {
          location = "option11";
        } else if (action.equals("option12") ) {
          location = "option12";
        } else if (action.equals("start") ) {
          location = "start";
        }
      }

      if (location == "option2") {
        System.out.println("Description of Option2.");
        System.out.println("Description of route to Option21.");
        System.out.println("Description of route to Option22.");
        System.out.println("Description of route to Start.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option21") ) {
          location = "option21";
        } else if (action.equals("option22") ) {
          location = "option22";
        } else if (action.equals("start") ) {
          location = "start";
        }
      }

      if (location == "option11") {
        System.out.println("Description of Option11.");
        System.out.println("Description of route to Option1.");
        System.out.println("Description of route to inactive.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option1") ) {
          location = "option1";
        } else if (action.equals("inactive") ) {
          inactive = true;
        }
      }

      if (location == "option12") {
        System.out.println("Description of Option12.");
        System.out.println("Description of route to Option1.");
        System.out.println("Description of route to inactive.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option1") ) {
          location = "option1";
        } else if (action.equals("inactive") ) {
          inactive = true;
        }
      }

      if (location == "option21") {
        System.out.println("Description of Option21.");
        System.out.println("Description of route to Option2.");
        System.out.println("Description of route to inactive.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option2") ) {
          location = "option2";
        } else if (action.equals("inactive") ) {
          inactive = true;
        }
      }

      if (location == "option22") {
        System.out.println("Description of Option22.");
        System.out.println("Description of route to Option2.");
        System.out.println("Description of route to inactive.");
        System.out.print("> ");
        String action = keyboard.nextLine().toLowerCase();
        if (action.equals("option2") ) {
          location = "option2";
        } else if (action.equals("inactive") ) {
          inactive = true;
        }
      }

      System.out.println("");
    }
    System.out.println("You Win!");
  }
}
