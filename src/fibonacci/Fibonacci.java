package fibonacci;

import java.util.ArrayList;
import java.util.List;

/*
 * Create Fibonacci series for a given number
 */
public class Fibonacci {

	/*
	 * Return Fibonacci series for a given number
	 */
	public List buildFibonacci(final int num) {
		List<Integer> fibonacciList = new ArrayList();

		if (num == 0) {
			fibonacciList.add(0);
			return fibonacciList;
		}

		if (num == 1) {
			fibonacciList.add(0);
			fibonacciList.add(1);
			return fibonacciList;
		}
		fibonacciList.add(0);
		fibonacciList.add(1);
		for (int i = 2; i <= num; i++) {

			fibonacciList.add(fibonacciList.get(i - 1)
					+ fibonacciList.get(i - 2));

		}

		return fibonacciList;

	}

}
