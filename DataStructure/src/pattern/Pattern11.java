package pattern;

public class Pattern11 {

	/*
	 * Print Triangle with *
	 */
	// Approach.
	/*
	 * this problem is very similar to Pattern 8, Only difference is instead of
	 * number print here *.
	 */
	
	/*
	 *
   ***
  *****
 *******
*********
	 */
	public static void main(String[] args) {
		int n = 9;
		pattern11(n);
	}

	public static void pattern11(int n) {
		for (int row = 0; row <= n; row++) {

			int totalSpace = n - row;
			for (int space = 0; space < totalSpace; space++) {
				System.out.print(" ");
			}

			for (int col = row; col > 1; col--) {
				System.out.print("*");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
