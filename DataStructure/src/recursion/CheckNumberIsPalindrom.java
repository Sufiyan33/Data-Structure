package recursion;

public class CheckNumberIsPalindrom {
	/*
	 * Here, we need to check given number is Palindrom or not.
	 */
	// Need to fix this
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
