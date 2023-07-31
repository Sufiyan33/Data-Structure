package recursion;

public class FibonacciNumber {

	/*
	 * Program to find nth fibonacci number.
	 */

	public static void main(String[] args) {
		int ans = fibo(7);
		System.out.println("5th fibonacci serires := " + ans);
	}

	public static int fibo(int n) {
		// base condition
		/*
		 * Since here 0 and 1 are the lowest number hence set bas condition accordingly.
		 */
		if (n < 2) {
			return n;
		}

		return fibo(n - 1) + fibo(n - 2);
	}
}
