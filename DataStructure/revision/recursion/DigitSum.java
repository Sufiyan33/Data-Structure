package recursion;

public class DigitSum {

	/*
	 * Find sum of each individual digits. example => 1234 => 1+2+3+4 =>10
	 */
	public static void main(String[] args) {
		int n = 1019232142;

		int result = sum(n);
		System.out.println(result);
	}

	static int sum(int n) {
		if (n % 10 == n)
			return n;

		return sum(n / 10) + sum(n % 10);
	}
}
