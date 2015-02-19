
/**
 * Implements the FizzBuzz problem.
 */
public class FizzBuzz {
  /**
   * Prints Fizz or Buzz or FizzBuzz for each input.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    String outputString;
    outputString = testFizzBuzz(100);
    System.out.println(outputString);

  }

  /**
   * prints a response based on inputs.
   * @param inputNumber The input number.
   * @return The string to print.
   */
  public static String testFizzBuzz(int inputNumber) {
    String returnString = "";
    for (int i = 1; i <= inputNumber; i++) {

      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
        returnString = "FizzBuzz";
      }
      else if (i % 3 == 0) {
        System.out.println("Fizz");
        returnString = "Fizz";
      }
      else if (i % 5 == 0) {
        System.out.println("Buzz");
        returnString = "Buzz";
      }
      else {
        System.out.println(i);
        returnString = "";
      }
    }
    return returnString;
  }
}
