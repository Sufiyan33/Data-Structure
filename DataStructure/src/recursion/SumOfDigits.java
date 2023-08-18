package recursion;

public class SumOfDigits {
	/*
	 * Program to find sum of individual digits. Example : 1234 = 1+2+3+4 = 10;
	 */
	public static void main(String[] args) {
		int ans = sum(1234);
		System.out.println("sum of digits =: " + ans);
	}

	static int sum(int n) {
		if (n == 0) {
			return 0;
		}

		return (n % 10) + sum(n / 10);
	}
}
