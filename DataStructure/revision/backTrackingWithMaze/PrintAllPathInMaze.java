package backTrackingWithMaze;

public class PrintAllPathInMaze {

	/*
	 * Print all possible paths to reach destination in Maze.
	 */

	public static void main(String[] args) {
		printPath("", 3, 3);
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
}
