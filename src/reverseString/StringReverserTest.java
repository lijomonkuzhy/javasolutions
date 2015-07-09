package reverseString;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringReverserTest {
	StringReverser stringReverser = null;

	@Before
	public void prepareTest() {
		stringReverser = new StringReverser();
	}

	@Test
	public void shouldReverseWithoutStringBuilderReverse() {
		assertEquals("abc",
				stringReverser.reverseStringWithStringBuilder("cba"));
	}

	@Test
	public void shouldReverseRecursively() {
		assertEquals("abc", stringReverser.reverseStringRecursively("cba"));
	}

	@Test
	public void shouldReverse() {
		assertEquals("abc", stringReverser.reverseString("cba"));
	}

}
