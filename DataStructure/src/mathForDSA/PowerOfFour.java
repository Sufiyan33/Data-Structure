package mathForDSA;

public class PowerOfFour {
	/*
	 * 326. Power of Four :: https://leetcode.com/problems/power-of-three/
	 */
	// Approach
	/*
	 * I made one formula by using this you can check any number is power of any
	 * number.
	 * 
	 * Step 1 : use this expression n == 4 power x.
	 * 
	 * Step 2 : find out the number which was base.
	 * 
	 * Step 3 : Now round this so that no decimal number are there.
	 * 
	 * Step 4 : check if power of this number is equal to n then return true
	 * otherwise false
	 */

	public static void main(String[] args) {
		int n = 243;
		System.out.println("power of three is := " + power(n));
	}

	// Need to fix
	public static boolean power(int n) {

		if (n < 1)
			return false;

		double x = (Math.log(n) / (Math.log(4)));
		int roundNumber = (int) Math.round(x);
		return (Math.pow(4, roundNumber) == n) ? true : false;
	}
}
