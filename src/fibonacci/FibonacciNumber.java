package fibonacci;

import java.util.HashMap;
import java.util.Map;

/*
 * Creates Nth value of the Fibonacci sequence.
 */
public class FibonacciNumber {

	/*
	 * returns Nth value of the Fibonacci sequence of given number.
	 */
	public int fibonacciValue(int num) {
		Map<Integer, Integer> fibonacciMap = new HashMap<Integer, Integer>();
		if (fibonacciMap.containsKey(num)) {
			return fibonacciMap.get(num);
		}
		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}

		int fibonacciValue = fibonacciValue(num - 1) + fibonacciValue(num - 2);
		fibonacciMap.put(num, fibonacciValue);
		return fibonacciMap.get(num);
	}
}
