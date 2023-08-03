package mathForDSA;

public class PowerOfThree {
	/*
	 * 326. Power of Three :: https://leetcode.com/problems/power-of-three/
	 */

	public static void main(String[] args) {
		int n = -1;
		System.out.println("power of three is := " + power(n));
	}

	// Need to fix
	public static boolean power(int n) {

		for (int i = 0; i < n; i++) {
			int power = (int) Math.pow(3, i);
			if (power == n)
				return true;
		}
		return false;
	}
}
