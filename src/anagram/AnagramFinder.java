package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Find a list of anagrams for a given word.
 */
public class AnagramFinder {

	/*
	 * Return a list of anagrams for a given word
	 */
	public List<String> findAnagramList(final String word,
			final List<String> searchList) {
		// Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> anagaramList = new ArrayList<String>();
		String signature = findSignature(word);

		for (String searchWord : searchList) {

			if (signature.equals(findSignature(searchWord))) {
				anagaramList.add(searchWord);
			}
		}

		return anagaramList;

	}

	/*
	 * Return sorted String for any given String
	 */
	public String findSignature(String word) {
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

}
