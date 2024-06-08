package maze;

public class MazeWithRestrictions {

	/*
	 * find or count path in maze having restrictions.
	 */
	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, false, true } };
		mazeRestriction("", maze, 0, 0);
	}

	static void mazeRestriction(String p, boolean[][] maze, int row, int col) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		// check either maze next cell contain river or not.
		if (!maze[row][col])
			return;

		if (row < maze.length - 1)
			mazeRestriction(p + 'D', maze, row + 1, col);

		if (col < maze[0].length - 1)
			mazeRestriction(p + 'R', maze, row, col + 1);
	}
}
