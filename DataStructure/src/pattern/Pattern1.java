package pattern;

public class Pattern1 {
	/*
	 * print 90 degree Triangle.
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.println("number of rows are =: " + n);
		pattern1(n);
	}

	public static void pattern1(int n) {
		// step 1 : Run outer loop till the given number of line.
		for (int row = 0; row < n; row++) {
			// Step 2 : identify column in each row and for every row run column.
			for (int col = 0; col <= row; col++) {
				// Step 3: what do you want to print.
				System.out.print("* ");
			}
			// when one row printed then add new line.
			System.out.println();
		}
	}
}
