package recursion;

public class ProductOfNDigits {
	/*
	 * Program to find product of individual digits. Example : 1234 = 1*2*3*4 = 24;
	 */
	public static void main(String[] args) {
		int ans = product(12340);
		System.out.println("product of digits =: " + ans);
	}

	static int product(int n) {
		if (n % 10 == n) {
			return n;
		}

		return (n % 10) * product(n / 10);
	}
}
