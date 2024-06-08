package backTrackingWithMaze;

public class MazeProblems {

	/*
	 * FInd how many ways to reach destination in maze.
	 */
	public static void main(String[] args) {
		int count = findWay(4, 4);
		System.out.println(count);
	}

	static int findWay(int row, int col) {
		if (row == 1 || col == 1)
			return 1;

		int left = findWay(row - 1, col);
		int right = findWay(row, col - 1);

		return left + right;
	}
}
