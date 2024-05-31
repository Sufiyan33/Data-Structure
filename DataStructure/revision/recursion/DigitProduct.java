package recursion;

public class DigitProduct {

	/*
	 * Find product of each individual product. example : 123 = 1*2*3 = 6
	 */
	public static void main(String[] args) {
		int n = 2131;
		int num = product(n);
		System.out.println(num);
	}

	static int product(int n) {
		if (n % 10 == n)
			return n;

		return product(n / 10) * product(n % 10);
	}
}
