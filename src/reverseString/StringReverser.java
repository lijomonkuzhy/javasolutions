package reverseString;

import java.util.Arrays;

/*
 * Reverse a given string
 */

public class StringReverser {

	/*
	 * Return reverse string for the given string, using string builder
	 * reverse()
	 */
	public String reverseStringWithStringBuilder(final String word) {
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();

		return sb.toString();
	}

	/*
	 * Return reverse string for the given string, without using string builder
	 * reverse
	 */
	public String reverseStringRecursively(final String word) {
		if (word.length() == 1) {
			return word;
		}

		String reverse = word.charAt(word.length() - 1)
				+ reverseStringRecursively(word.substring(0, word.length() - 1));

		return reverse;
	}

	/*
	 * Return reverse string for the given string, without using string builder
	 * reverse
	 */
	public String reverseString(final String word) {
		char[] charrArray = word.toCharArray();
		int length = charrArray.length;
		for (int i = 0; i < length / 2; i++) {
			char temp = charrArray[length - i - 1];
			charrArray[length - i - 1] = charrArray[i];
			charrArray[i] = temp;
		}

		return new String(charrArray);
	}

}
