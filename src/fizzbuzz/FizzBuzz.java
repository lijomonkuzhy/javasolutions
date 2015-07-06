package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program that prints the number 1 to n by replacing multiples of 3 with Fizz, 
 * 5 with Buzz and 15 with FizzBuzz.
 */
public class FizzBuzz {

	/*
	 * Create a number list by replacing multiples of 3 with Fizz, 5 with Buzz
	 * and 15 with FizzBuzz.
	 */
	public List<String> fizzBuzzBuilder(int num) {
		List<String> fizzBuzzList = new ArrayList<String>();

		for (int i = 1; i <= num; i++) {
			String fizzBuzz = null;
			fizzBuzz = replaceNumberWithWord(i, 3, "Fizz")
					+ replaceNumberWithWord(i, 5, "Buzz");

			if (fizzBuzz.isEmpty()) {
				fizzBuzz = i + "";
			}

			fizzBuzzList.add(fizzBuzz);

		}

		return fizzBuzzList;
	}

	/*
	 * Replace the number with given word if the number is divisible by the
	 * Deviser
	 */
	public String replaceNumberWithWord(final int num, final int deviser,
			final String word) {

		return num % deviser == 0 ? word : "";
	}
}
