package mathForDSA;

public class RightShiftofNumber {
	/*
	 * Find Right shift of a number example : 2 >> 1;
	 */
	// Approach.
	/*
	 * Step 1 : If you will do 2 >> 1 then result would be 1. it means if you do
	 * right shift of a number n then answer will be n/2.
	 * 
	 * Step 2 : Hence if do right shift of number a to b times (a >> b)then output
	 * will be = a / (2 power b). remember this formula.
	 */
	public static void main(String[] args) {
		int a = 20;
		int b = 2;

		System.out.println("a >> 1 is := " + (a >> 1));
		System.out.println("a >> 1 is := " + (a >> 2));

		int ans = rightShift(a, b);
		System.out.println("a >> b is := " + ans);
	}

	public static int rightShift(int a, int b) {
		return (int) (a / (Math.pow(2, b)));
	}
}
