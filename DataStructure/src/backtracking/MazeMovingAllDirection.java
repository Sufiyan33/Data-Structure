package backtracking;

import java.util.Arrays;

public class MazeMovingAllDirection {

	/*
	 * Now, In order to solve this issue we need backtracking approach because I
	 * explained that how it got stocked in recursion tree while moving back.
	 */
	public static void main(String[] args) {
		boolean[][] arr = { { true, true, true }, { true, true, true }, { true, true, true } };
		mazeAllDirections("", arr, 0, 0);

		System.out.println();

		int[][] path = new int[arr.length][arr[0].length];
		mazePaths("", arr, path, 0, 0, 1);
	}

	static void mazeAllDirections(String p, boolean[][] maze, int row, int col) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		// If obstacle are there then we need to stop recursion call.
		if (!maze[row][col]) {
			return;
		}

		maze[row][col] = false;

		if (row < maze.length - 1) {
			mazeAllDirections(p + 'D', maze, row + 1, col);
		}

		if (col < maze[0].length - 1) {
			mazeAllDirections(p + 'R', maze, row, col + 1);
		}

		if (row > 0) {
			mazeAllDirections(p + 'U', maze, row - 1, col);
		}

		if (col > 0) {
			mazeAllDirections(p + 'L', maze, row, col - 1);
		}

		/*
		 * Here, functions gets over. Then we make sure that whatever changes made by
		 * the recursive call while going down should be restore at the time of going
		 * up. Hence revert changes.
		 */
		maze[row][col] = true;
	}

	/*
	 * Question : Return path as Matrix
	 */

	static void mazePaths(String p, boolean[][] maze, int path[][], int row, int col, int steps) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			path[row][col] = steps;
			for (int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}

		// If obstacle are there then we need to stop recursion call.
		if (!maze[row][col]) {
			return;
		}

		maze[row][col] = false;
		// Here, we need to print step as well. Hence while going down will mark level
		// steps and once recursion gets over then
		path[row][col] = steps;

		if (row < maze.length - 1) {
			mazePaths(p + 'D', maze, path, row + 1, col, steps + 1);
		}

		if (col < maze[0].length - 1) {
			mazePaths(p + 'R', maze, path, row, col + 1, steps + 1);
		}

		if (row > 0) {
			mazePaths(p + 'U', maze, path, row - 1, col, steps + 1);
		}

		if (col > 0) {
			mazePaths(p + 'L', maze, path, row, col - 1, steps + 1);
		}

		/*
		 * Here, functions gets over. Then we make sure that whatever changes made by
		 * the recursive call while going down should be restore at the time of going
		 * up. Hence revert changes.
		 */
		maze[row][col] = true;
		path[row][col] = 0;
	}
}
