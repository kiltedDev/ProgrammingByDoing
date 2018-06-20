public class XsAndYs {
  public static void main(String[] args) {
    System.out.println(" x\t y");
    System.out.println("----------");

    for (Double n = -10.0; n <= 10; n = n+0.5) {
      System.out.println(n + "\t" + (n*n));
    }
  }
}
