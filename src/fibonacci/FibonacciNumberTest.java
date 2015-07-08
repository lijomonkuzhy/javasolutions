package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciNumberTest {
	FibonacciNumber fibonacciNumber = null;

	@Before
	public void prepareTest() {
		fibonacciNumber = new FibonacciNumber();
	}

	@Test
	public void ShouldReturnNthFibonacci() {
		assertEquals(5, fibonacciNumber.fibonacciValue(5));
	}
}
