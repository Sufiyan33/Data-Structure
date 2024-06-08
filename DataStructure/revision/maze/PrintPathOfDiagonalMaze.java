package maze;

public class PrintPathOfDiagonalMaze {

	/*
	 * Here, we can traverse in 3 directions : down, right and diagonal.
	 */

	public static void main(String[] args) {
		System.out.println(countPath(3, 3));
	}

	static int countPath(int row, int col) {
		if (row == 1 || col == 1) {
			return 1;
		}
		int left = 0;
		int middle = 0;
		int right = 0;

		// if row is below than 1 then you can't go diagonal.
		if (row > 1)
			left = countPath(row - 1, col);

		// if row && column < is below than 1 then you can't go diagonal.
		if (row > 1 && col > 1)
			middle = countPath(row - 1, col - 1);

		// if column is below than 1 then you can't go diagonal.
		if (col > 1)
			right = countPath(row, col - 1);

		return left + middle + right;
	}
}
