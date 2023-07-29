package pattern;

public class Pattern14 {

	/*
	 * Print Diamond having number instead of start.
	 */
	// Approach.

	/*
	 * This is a combination of Pattern 6 & 8.
	 * 
	 * Step 1 : First identify the number of rows.
	 * 
	 * Step 2 : Check, how many columns are there in each row. Here 1st row has 1
	 * column and 2nd row 2 column and accordingly but at one time column is
	 * decreasing. Hence we have to find the totalColSize. Size n we can write 2 * n
	 * as well.
	 * 
	 * Step 3 : For the above use formula : row > n ? 2*n : row.
	 * 
	 * Step 4 : Check, how many columns are there in each row.
	 * 
	 * Step 5 : See here, each column having some spaces. Hence we need to also find
	 * spaces. If you will notice in 1st row space = 5 - 1 row = 4 spaces. in 2nd
	 * row space = 5 - 2 row = 3 spaces and more. It means that total space = total
	 * number - row. means totalSpace = n - row.
	 * 
	 * Step 6 : identify what to print and print that element.
	 */
	/*
	 *1 
    2 1 2 
  3 2 1 2 3 
4 3 2 1 2 3 4 
  3 2 1 2 3 
    2 1 2 
      1 
	 */
	public static void main(String[] args) {
		int n = 4;
		pattern14(n);
	}

	public static void pattern14(int n) {
		for (int row = 1; row <= 2 * n; row++) {

			int totalColSize = row > n ? 2 * n - row : row;
			int totalSpace = n - totalColSize;
			for (int space = 0; space < totalSpace; space++) {
				System.out.print("  ");
			}

			for (int col = totalColSize; col > 1; col--) {
				System.out.print(col + " ");
			}

			for (int col = 1; col <= totalColSize; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
