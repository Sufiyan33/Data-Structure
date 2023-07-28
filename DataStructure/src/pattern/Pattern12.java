package pattern;

public class Pattern12 {

	/*
	 * Print Delta pattern.
	 */

	// Approach.
	/*
	 * this problem is very similar to Pattern 11, Only difference is instead of
	 * number print here * and here row will start from n to 1, in decreasing order.
	 */
	/*
	 * 
 *******
  *****
   ***
    *
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern12(n);
	}

	public static void pattern12(int n) {
		for (int row = n; row > 0; row--) {
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
