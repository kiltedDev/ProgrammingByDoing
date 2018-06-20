public class NoticingEvenNumbers {
  public static void main(String[] args) {
    String even = "";
    for (int n = 1; n <= 20; n++) {
      if (n%2 == 0) {
        even = " <";
      } else {
        even = "";
      }
      System.out.println(n + even);
    }
  }
}
