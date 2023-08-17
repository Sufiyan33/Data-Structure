package recursion;

public class Factorial {
	/*
	 * Find out factorial of a number using recursion.
	 */
	public static void main(String[] args) {
		long fact = factorial(20);
		System.out.println("Factorial of number is  " + fact);
	}

	public static long factorial(int n) {
		if (n <= 0) {
			return 1;
		}
		return (n * factorial(n - 1));
	}
}
