package recursion;

public class CountZeros {
	/*
	 * Count number of zero in the given number using Recursion.
	 */
	static int count(int n) {
		return helper(n, 0);
	}

	private static int helper(int n, int c) {
		if (n == 0) {
			return c;
		}

		int reminder = n % 10;
		if (reminder == 0) {
			return helper(n / 10, c + 1);
		}
		return helper(n / 10, c);
	}

	public static void main(String[] args) {
		System.out.println("Number of zeros are := " + count(300001));
	}
}
