package pattern;

public class Pattern15 {
	/*
	 * Print Right Triangle having number in increasing order row wise.
	 */
	// Approach.
	/*
	 * This pattern is exactly same but different is here you need to print row
	 * number instead of star.
	 */

	/*
	 * 1 1 1 1 1 1 1 
2 2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 
5 5 5 
6 6 
7 
	 */
	public static void main(String[] args) {
		int n = 8;
		pattern15(n);
	}

	public static void pattern15(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = n; col > row; col--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
