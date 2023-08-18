package pattern;

public class Pattern18 {

	/*
	 * 
	 */

	// Need to fix this.
	public static void main(String[] args) {
		int n = 5;
		pattern18(n);
	}

	public static void pattern18(int n) {

		// for downward triangle.
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

		// for upward triangle.

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
