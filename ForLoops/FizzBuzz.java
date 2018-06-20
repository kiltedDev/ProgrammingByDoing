public class FizzBuzz {
  public static void main(String[] args) {
    for (int n = 1; n <= 100; n++) {
      if (n%3 == 0 && n%5 == 0) {
        System.out.println("FizzBuzz");
      } if (n%3 == 0) {
        System.out.println("Fizz");
      } if (n%5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(n);
      }
    }
  }
}
