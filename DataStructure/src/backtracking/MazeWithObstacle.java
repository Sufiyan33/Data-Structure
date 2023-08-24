package backtracking;

public class MazeWithObstacle {
	/*
	 * Program to find path in given Maze with Obstacle.
	 */
	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };
		mazeObstacle("", maze, 0, 0);
	}

	static void mazeObstacle(String p, boolean[][] maze, int row, int col) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		// How to handle obstacle, if we land on river then recursive call should stop.
		if (maze[row][col] == false) {
			return;
		}

		if (row < maze.length - 1) {
			mazeObstacle(p + 'D', maze, row + 1, col);
		}

		if (col < maze[0].length - 1) {
			mazeObstacle(p + 'R', maze, row, col + 1);
		}
	}

}
