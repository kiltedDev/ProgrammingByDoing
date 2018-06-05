public class CompareToChallenge {
  public static void main(String[] args) {
    String[][] magazine = {
      {"axe", "dog"},
      {"banana", "hammock"},
      {"sailor", "tailor"},
      {"mage", "thief"},
      {"kanye", "west"},
      {"additive", "add"},
      {"upgrade", "broken"},
      {"ghastly", "ghast"},
      {"pool", "noodle"},
      {"tinker", "engineer"},
      {"tacocat", "tacocat"},
      {"mom", "mom"}
    };
    int i;

    for (i = 0; i < 12; i++) {
      ComposeComparison(magazine[i]);
    }
  }

  public static void ComposeComparison(String[] strings) {
    System.out.print("Comparing \"" +strings[0]+ "\" with \"" +strings[1]+ "\" produces ");
    int i = strings[0].compareTo(strings[1]);
    System.out.println(i);
  }
}
