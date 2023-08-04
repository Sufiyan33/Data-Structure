package mathForDSA;

public class FindSetBits {

	/*
	 * Given a number n, find the number of set bits in it.
	 */
	// Approach.
	/*
	 * set bits means -> how many 1's are present in Binary number. if you will
	 * convert number in binary then you will know.
	 * 
	 * Step 1 : take a counter and do & operation.
	 * 
	 * Step 2 : if return count.
	 */
	public static void main(String[] args) {
		int n = 43;
		System.out.println("Number in Binary := " + Integer.toBinaryString(n));
		int setBit = setBits(n);
		System.out.println("Number of set bits are := " + setBit);
	}

	public static int setBits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			// n = n & (n - 1);
			// you can also write below code.
			n -= (n & (-n));
		}
		return count;
	}
}
