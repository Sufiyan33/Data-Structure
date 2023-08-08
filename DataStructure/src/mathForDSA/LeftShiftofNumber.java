package mathForDSA;

public class LeftShiftofNumber {
	/*
	 * Find left shift of a number example : 2 << 1;
	 */
	// Approach.
	/*
	 * Step 1 : If you will do 2 << 1 then result would be 4. it means if you do
	 * left shift of a number n then answer will be 2n.
	 * 
	 * Step 2 : Hence if do left shift of number a to b times (a<<b)then output will
	 * be = a * (2 power b). remember this formula.
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println("left shift of a := " + (a << 1));
		System.out.println("left shift of a := " + (a << 4));

		double ans = leftShift(a, b);
		System.out.println("a << b time is := " + ans);

	}

	public static double leftShift(int n, int b) {
		return n * (Math.pow(2, b));
	}
}
