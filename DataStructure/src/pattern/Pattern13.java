package pattern;

public class Pattern13 {

	/*
	 * Print Triangle having star.
	 */
	// Approach.
	/*
	 * Approach is very similar to other triangle pattern the only thing is you need
	 * to take care of spaces.
	 */
	/*
	 *     *  
         *   *  
       *   *   *  
     *   *   *   *  
   *   *   *   *   *
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern12(n);
	}

	// Need to fix this.
	public static void pattern12(int n) {
		for (int row = 0; row < n; row++) {

			int totalSpaces = n - row;
			for (int space = 0; space < totalSpaces; space++) {
				System.out.print("  ");
			}

			for (int col = 0; col <= row; col++) {
				System.out.print(" * " + " ");
			}
			System.out.println();
		}
	}
}
