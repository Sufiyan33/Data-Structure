package pattern;

public class Pattern16 {

	/*
	 * Print Triangle having number in increasing order.
	 */
	// Approach.
	/*
	 * Step 1 : First Identify the row number and here row start from 1.
	 * 
	 * Step 2 : Identify the column size. Here each column having increasing number.
	 * 
	 * Step 3 : identify that what to print. Here print number in increasing order.
	 */
	/*
	 * 1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern16(n);
	}

	public static void pattern16(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 0; col < row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
