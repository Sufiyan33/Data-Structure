package mathForDSA;

public class AddDigits {

	/*
	 * 258. Add Digits :: Given an integer num, repeatedly add all its digits until
	 * the result has only one digit, and return it.
	 * 
	 * https://leetcode.com/problems/add-digits/
	 */
	// Approach.
	/*
	 * Explanation: The process is 38 --> 3 + 8 --> 11 11 --> 1 + 1 --> 2 Since 2
	 * has only one digit, return it.
	 */
	public static void main(String[] args) {
		int num = 38; // Output: 2
		int didits = addDigits(num);
		System.out.println(didits);
	}

	public static int addDigits(int n) {
		int sum = 0;
		int counter = 0;
		while (n > 9) {
			counter++;
			n = n / 10;
			sum += n;
			System.out.println(sum);
		}
		return counter;
	}
}
