package backTraking;

import java.util.Arrays;

public class PrintPathAndMatrix {

	/*
	 * Print all path with moving matrix that shows from where to where it goes.
	 */

	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
		int[][] path = new int[maze.length][maze[0].length];
		printPathWithMatrix("", maze, 0, 0, path, 1);
	}

	static void printPathWithMatrix(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			path[row][col] = step;
			for (int[] aa : path) {
				System.out.println(Arrays.toString(aa));
			}
			System.out.println(p);
			System.out.println();
			return;
		}

		// check if that part is already visited or not.
		if (!maze[row][col])
			return;

		/*
		 * I am considering this block in my path. Hence Moving forward mark this cell
		 * false or visited.
		 */
		maze[row][col] = false;
		path[row][col] = step;

		if (row < maze.length - 1)
			printPathWithMatrix(p + 'D', maze, row + 1, col, path, step + 1);

		if (col < maze[0].length - 1)
			printPathWithMatrix(p + 'R', maze, row, col + 1, path, step + 1);

		// If row > 0 then we can move up.
		if (row > 0)
			printPathWithMatrix(p + 'U', maze, row - 1, col, path, step + 1);

		if (col > 0)
			printPathWithMatrix(p + 'L', maze, row, col - 1, path, step + 1);

		/*
		 * This line is where, the function call gets over. Hence before function gets
		 * removed, also remove those changes which marked false or visited.
		 */
		maze[row][col] = true;
		path[row][col] = 0;
	}
}
