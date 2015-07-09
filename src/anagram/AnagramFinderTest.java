package anagram;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AnagramFinderTest {

	AnagramFinder anagramFinder = null;

	@Before
	public void prepareTest() {
		anagramFinder = new AnagramFinder();
	}

	@Test
	public void ShouldRetrunAnagramList() {
		assertEquals(
				Arrays.asList("listen", "silent"),
				anagramFinder.findAnagramList("silent",
						Arrays.asList("listen", "abc", "silent")));
	}
}
