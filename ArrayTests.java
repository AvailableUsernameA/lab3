import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {2, 1}, input2);

    int[] input3 = { };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] { }, input3);

    int[] input4 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[] {4, 3, 2, 1}, input4);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {1};
    assertArrayEquals(new int[] {1}, ArrayExamples.reversed(input2));
    int[] input3 = {1, 2};
    assertArrayEquals(new int[] {2, 1}, ArrayExamples.reversed(input3));
    int[] input4 = {1, 2, 3};
    assertArrayEquals(new int[] {3, 2, 1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3};
    double result1 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(2.5, result1, 0.001);

    double[] input2 = {1, 1, 1, 2, 3};
    double result2 = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(1.75, result2, 0.001);
  }
}
