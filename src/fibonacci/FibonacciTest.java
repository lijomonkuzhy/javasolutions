package fibonacci;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	Fibonacci fibonacci = null;

	@Before
	public void prepareTest() {
		fibonacci = new Fibonacci();

	}

	@Test
	public void shouldReturFibonacciListForOne() {
		assertEquals(Arrays.asList(0, 1), fibonacci.buildFibonacci(1));
	}

	@Test
	public void shouldReturFibonacciListForTwo() {
		assertEquals(Arrays.asList(0, 1, 1), fibonacci.buildFibonacci(2));
	}

	@Test
	public void shouldReturFibonacciListForThree() {
		assertEquals(Arrays.asList(0, 1, 1, 2), fibonacci.buildFibonacci(3));
	}

	@Test
	public void shouldReturFibonacciListForFive() {
		assertEquals(Arrays.asList(0, 1, 1, 2,3,5), fibonacci.buildFibonacci(5));
	}

}
