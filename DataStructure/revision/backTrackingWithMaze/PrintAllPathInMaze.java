package backTrackingWithMaze;

import java.util.ArrayList;

public class PrintAllPathInMaze {

	/*
	 * Print all possible paths to reach destination in Maze.
	 */

	public static void main(String[] args) {
		// printPath("", 3, 3);
		ArrayList<String> result = printPathReturn("", 3, 3);
		System.out.println(result);
	}

	static void printPath(String p, int row, int col) {
		if (row == 1 && col == 1) {
			System.out.println(p);
			return;
		}

		// if row > 1 then we can't go down.
		if (row > 1) {
			printPath(p + 'D', row - 1, col);
		}

		// if col>1 then we can't go right.
		if (col > 1) {
			printPath(p + 'R', row, col - 1);
		}
	}

	// Return as List

	static ArrayList<String> printPathReturn(String p, int row, int col) {
		if (row == 1 && col == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> list = new ArrayList<>();
		// if row > 1 then we can't go down.
		if (row > 1) {
			list.addAll(printPathReturn(p + 'D', row - 1, col));
		}

		// if col>1 then we can't go right.
		if (col > 1) {
			list.addAll(printPathReturn(p + 'R', row, col - 1));
		}
		return list;
	}
}
