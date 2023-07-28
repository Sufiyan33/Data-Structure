package pattern;

public class Pattern3 {
	/*
	 * Print 5 line with 5 *.
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern3(n);
	}

	/*
	 * Step 1 : First identify the number of rows.
	 * 
	 * Step 2 : Check, how many columns are there in each row.
	 * 
	 * Step 3 : Here number rows = number of column.
	 * 
	 * Step 4 : identify what to print and print that element.
	 */

	public static void pattern3(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
