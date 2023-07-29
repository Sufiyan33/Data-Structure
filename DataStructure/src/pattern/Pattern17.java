package pattern;

public class Pattern17 {

	/*
	 * Print Triangle having number in increasing order.
	 */
	// Approach.
	/*
	 * This very similar to Pattern 13 and you just need to print in down site
	 * 
	 * Step 1 : First Identify the row number and here row start from 1.
	 * 
	 * Step 2 : Identify the column size. Here each column having increasing number.
	 * 
	 * Step 3 : identify that what to print. Here print number in increasing order.
	 */
	
	/*
	 * *   *   *   *   *  
	 *   *   *   *  
     *   *   *  
       *   *  
         *
	 */

	public static void main(String[] args) {
		int n = 5;
		pattern17(n);
	}

	public static void pattern17(int n) {
		for (int row = n; row > 0; row--) {
			int totalSpace = n - row;

			for (int space = 0; space < totalSpace; space++) {
				System.out.print("  ");
			}

			for (int col = row; col > 0; col--) {
				System.out.print(" * " + " ");
			}
			System.out.println();
		}
	}
}
