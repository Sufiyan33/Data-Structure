package backTraking;

public class NQueensProblems {

	/*
	 * Place N queens on board but make sure that they should not clash each others.
	 */
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int ways = queens(board, 0);
		System.out.println("Number of ways :: " + ways);
	}

	static int queens(boolean[][] board, int row) {
		if (row == board.length) {
			display(board);
			System.out.println();
			return 1;
		}

		int count = 0;

		// Now placing the queens and checking for every rows and columns.s
		for (int col = 0; col < board.length; col++) {
			// place the queen if it is safe.
			if (isSafe(board, row, col)) {
				// if safe then while moving forward put false, so that can't be revisited.
				board[row][col] = true;

				// now make recursive call for the next row.
				count += queens(board, row + 1);

				// while moving back reverted all those changes which was made.
				board[row][col] = false;
			}
		}
		return count;
	}

	static boolean isSafe(boolean[][] board, int row, int col) {
		// 1 : check vertical row => (0, row), is it safe?
		for (int i = 0; i < row; i++) {
			if (board[i][col]) {
				return false;
			}
		}

		// 2 : check for diagonal left(row--, col--) => min(r,c)
		int leftMax = Math.min(row, col);
		for (int i = 1; i <= leftMax; i++) {
			if (board[row - i][col - i]) {
				return false;
			}
		}

		// 3 : check for diagonal right (row--, col ++) => take min(row, length-col-)
		int rightMax = Math.min(row, board.length - col - 1);
		for (int i = 1; i <= rightMax; i++) {
			if (board[row - i][col + i]) {
				return false;
			}
		}

		return true;
	}

	// Function to display board.
	static void display(boolean[][] board) {
		for (boolean[] arr : board) {
			for (boolean element : arr) {
				if (element) {
					System.out.print("Q ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}
