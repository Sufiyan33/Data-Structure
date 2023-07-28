package strings;

public class BasicCalculatorII {
	/*
	 * 227. Basic Calculator II
	 * 
	 * https://leetcode.com/problems/basic-calculator-ii/
	 */
	// Approach.
	/*
	 * 1- first solve brackets first. 2- then do division then. 3- Then do
	 * multiplication. 4- And the you go from left to right. :)
	 */
	public static void main(String[] args) {
		String s = "3+2*2"; // Output: 7
		// String s = " 3/2 "; // Output: 1
		// String s = " 3+5 / 2 "; // Output: 5
		int found = calculate(s);
		System.out.println("found = :" + found);
	}

	// Need to fix this
	public static int calculate(String s) {

		int num = 0;
		int last = 0, sum = 0;

		char operator = '+';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			}

			if (isOperator(c) || i == s.length() - 1) {
				if (operator == '*') {
					last *= num;
				} else if (operator == '/') {
					last /= num;
				} else if (operator == '*') {
					last = last - last;
					last = num;
				} else if (operator == '+') {
					last = last + last;
					last = +num;
				}

				num = 0;
				operator = c;
			}
		}

		return sum = sum + last;
	}

	public static boolean isOperator(char operator) {
		return operator == '+' || operator == '-' || operator == '*' || operator == '/';
	}
}
