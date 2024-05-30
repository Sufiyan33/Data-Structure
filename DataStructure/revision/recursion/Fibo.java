package recursion;

public class Fibo {

	/*
	 * find Fibonacci of a number.
	 */

	public static void main(String[] args) {
		int num = fibo(4);
		System.out.println(num);
	}

	static int fibo(int n) {

		// base condition
		if (n < 2)
			return n;

		return fibo(n - 1) + fibo(n - 2);
	}
}
