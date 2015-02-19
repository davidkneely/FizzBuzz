import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests FizzBuzz with sample input.
 */
public class FizzBuzzTest {
  /**
   * Tests FizzBuzz with sample inputs.
   * @throws Exception Ignored.
   */
  @Test
  public void testTestFizzBuzz() throws Exception {
    assertEquals("tests FizzBuzz with input of 3", "Fizz", FizzBuzz.testFizzBuzz(3));
    assertEquals("tests FizzBuzz with input of 5", "Buzz", FizzBuzz.testFizzBuzz(5));
    assertEquals("tests FizzBuzz with input of 15", "FizzBuzz", FizzBuzz.testFizzBuzz(15));
    assertEquals("tests FizzBuzz with input of 1", "", FizzBuzz.testFizzBuzz(1));
  }
}