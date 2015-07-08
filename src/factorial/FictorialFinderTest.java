package factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FictorialFinderTest {
	FactorialFinder factorialFinder = null;

	@Before
	public void prepareTest() {
		factorialFinder = new FactorialFinder();
	}

	@Test
	public void shouldReturnFactorialRecursively() {

		assertEquals(6, factorialFinder.findFactorialRecursively(3));
	}

	@Test
	public void shouldReturnFactorial() {

		assertEquals(6, factorialFinder.findFactorial(3));
	}

}
