package backtracking;

public class NQueen {
	/*
	 * Here we will write code for NQueens Problem.
	 */
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		System.out.println(queens(board, 0));
	}

	static int queens(boolean[][] board, int row) {
		if (row == board.length) {
			display(board);
			System.out.println();
			return 1;
		}

		int count = 0;

		// Here placing the queens & checking for every row and column.
		for (int col = 0; col < board.length; col++) {
			// Now place the queens, if it is safe.
			if (isSafe(board, row, col)) {
				board[row][col] = true;
				count += queens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
	}

	/*
	 * Check here weather row or col are safe to put Queens which we Saw in
	 * recursion tree.
	 */
	private static boolean isSafe(boolean[][] board, int row, int col) {
		// Check for vertical row :

		for (int i = 0; i < row; i++) {
			if (board[i][col]) {
				return false;
			}
		}

		// Check for Diagonal left.
		int maxLeft = Math.min(row, col);
		for (int i = 1; i <= maxLeft; i++) {
			if (board[row - i][col - i]) {
				return false;
			}
		}

		// Check for Diagonal right.
		int maxRight = Math.min(row, board.length - col - 1);
		for (int i = 1; i <= maxRight; i++) {
			if (board[row - i][col + i]) {
				return false;
			}
		}

		return true;
	}

	private static void display(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean elements : row) {
				if (elements) {
					System.out.print("Q ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}
