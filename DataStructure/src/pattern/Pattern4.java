package pattern;

public class Pattern4 {
	/*
	 * Print having right + opposite right triangle.
	 */
	// Approach.
	/*
	 * Step 1 : First identify the number of rows.
	 * 
	 * Step 2 : Check, how many columns are there in each row. Here 1st row has 1
	 * column and 2nd row 2 column and accordingly but at one time column is
	 * decreasing. Hence we have to find the totalColSize. Size n we can write 2 * n
	 * as well.
	 * 
	 * Step 3 : For the above use formula : row > n ? 2*n : row.
	 * 
	 * Step 4 : identify what to print and print that element.
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern4(n);
	}

	public static void pattern4(int n) {
		for (int row = 0; row < 2 * n; row++) {
			int totalColSize = row > n ? 2 * n - row : row;
			for (int col = 0; col < totalColSize; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
