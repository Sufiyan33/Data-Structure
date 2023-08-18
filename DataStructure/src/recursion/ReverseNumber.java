package recursion;

public class ReverseNumber {
	/*
	 * Reverse a number using Recursion. Example 1842 = 2481
	 */
	static int sum = 0;

	static void reverse(int n) {
		if (n == 0) {
			return;
		}
		int reminder = n % 10;
		sum = sum * 10 + reminder;
		reverse(n / 10);
	}

	public static void main(String[] args) {
		reverse(1234);
		System.out.println("reverse number is =: " + sum);
	}
}
