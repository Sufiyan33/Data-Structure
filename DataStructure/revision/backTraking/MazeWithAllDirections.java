package backTraking;

public class MazeWithAllDirections {

	/*
	 * Now, compute path with all directions. You are free to move in four
	 * directions.
	 */
	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
		pathAllDirections("", maze, 0, 0);
	}

	static void pathAllDirections(String p, boolean[][] maze, int row, int col) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
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

		if (row < maze.length - 1)
			pathAllDirections(p + 'D', maze, row + 1, col);

		if (col < maze[0].length - 1)
			pathAllDirections(p + 'R', maze, row, col + 1);

		// If row > 0 then we can move up.
		if (row > 0)
			pathAllDirections(p + 'U', maze, row - 1, col);

		if (col > 0)
			pathAllDirections(p + 'L', maze, row, col - 1);

		/*
		 * This line is where, the function call gets over. Hence before function gets
		 * removed, also remove those changes which marked false or visited.
		 */
		maze[row][col] = true;
	}
}
