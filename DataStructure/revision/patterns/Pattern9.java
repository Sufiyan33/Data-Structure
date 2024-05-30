package patterns;

public class Pattern9 {

	public static void main(String[] args) {

		int n = 5;
		for (int row = 2 * n; row > 0; row--) {

			int totalCol = row > n ? (2 * n - row) : row;
			int totalSpace = n - totalCol;

			for (int space = 0; space < totalSpace; space++) {
				System.out.print(" ");
			}

			for (int col = 0; col < totalCol; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
