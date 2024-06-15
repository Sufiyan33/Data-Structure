package maze;

import java.util.ArrayList;

public class PrintPathInDiagonalMaze {

	/*
	 * Print all possible path in maze in each direction including diagonal.
	 */
	public static void main(String[] args) {
		// printPathDiagonal("", 3, 3);

		ArrayList<String> list = printPathDiagonalReturn("", 3, 3);
		System.out.println(list);
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

	static ArrayList<String> printPathDiagonalReturn(String p, int row, int col) {
		if (row == 1 && col == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		// This list for internal recursion call only.
		ArrayList<String> list = new ArrayList<>();

		if (row > 1 && col > 1)
			list.addAll(printPathDiagonalReturn(p + 'D', row - 1, col - 1));

		if (row > 1)
			list.addAll(printPathDiagonalReturn(p + 'V', row - 1, col));

		if (col > 1) {
			list.addAll(printPathDiagonalReturn(p + 'H', row, col - 1));
		}
		return list;
	}
}
