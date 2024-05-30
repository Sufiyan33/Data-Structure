package patterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 5;

		for (int row = n; row > 0; row--) {

			for (int space = 0; space < n - row; space++) {
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