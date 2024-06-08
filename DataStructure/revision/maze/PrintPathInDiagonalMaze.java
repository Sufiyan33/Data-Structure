package maze;

public class PrintPathInDiagonalMaze {

	/*
	 * Print all possible path in maze in each direction including diagonal.
	 */
	public static void main(String[] args) {
		printPathDiagonal("", 3, 3);
	}

	static void printPathDiagonal(String p, int row, int col) {
		if (row == 1 && col == 1) {
			System.out.println(p);
			return;
		}

		if (row > 1 && col > 1)
			printPathDiagonal(p + 'D', row - 1, col - 1);

		if (row > 1)
			printPathDiagonal(p + 'V', row - 1, col);

		if (col > 1) {
			printPathDiagonal(p + 'H', row, col - 1);
		}
	}
}
