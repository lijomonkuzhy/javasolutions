package fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz = null;

	@Before
	public void prepareTest() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shpuldPrintFizz() {
		assertEquals(Arrays.asList("1", "2", "Fizz"),
				fizzBuzz.fizzBuzzBuilder(3));

	}

	@Test
	public void shpuldPrintFizzAndBuzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"),
				fizzBuzz.fizzBuzzBuilder(5));

	}

	@Test
	public void shpuldPrintFizzBuzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
				"8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"),
				fizzBuzz.fizzBuzzBuilder(15));

	}
}
