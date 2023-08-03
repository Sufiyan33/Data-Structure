package mathForDSA;

public class PowerOfTwo {
	/*
	 * 231. Power of Two :: https://leetcode.com/problems/power-of-two/
	 * 
	 * Try to solve using recursion.
	 */
	public static void main(String[] args) {
		int n = 20;
		boolean result = power(n);
		System.out.println("Power of two := " + result);
	}

	public static boolean power(int n) {
		if (n < 1)
			return false;

		return (n & (n - 1)) == 0 ? true : false;

	}
}
