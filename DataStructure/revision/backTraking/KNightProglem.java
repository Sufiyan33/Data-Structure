package backTraking;

public class KNightProglem {

	/*
	 * N * N cross board has given, we have to put a knight in each cells. Knight
	 * can move in two types :
	 * 
	 * 1 : one step vertically and two steps horizontally.
	 * 
	 * OR 2 : one step horizontally and two steps vertically.
	 * 
	 * Hence total there are 8 moves in one round & make sure Knight should not
	 * revisit any cells. It should visit each cell exactly one.
	 */

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		knight(board, 0, 0, 4);
	}

	static void knight(boolean[][] board, int row, int col, int knights) {
		if (knights == 0) {
			display(board);
			System.out.println();
			return;
		}

		if (row == board.length - 1 && col == board.length) {
			return;
		}
		if (col == board.length) {
			knight(board, row + 1, 0, knights);
			return;
		}

		// check if next row & column are safe to move.
		if (isSafe(board, row, col)) {
			board[row][col] = true;
			knight(board, row, col + 1, knights - 1);
			board[row][col] = false;
		}

		// if above is not safe then move in next column and don't place knight.
		knight(board, row, col + 1, knights);
	}

	static boolean isSafe(boolean[][] board, int row, int col) {
		// check here all 4 condition or move.
		if (isValid(board, row - 2, col - 1)) {
			// if they are valid then check each row & column have placed knights.
			if (board[row - 2][col - 1]) {
				return false;
			}
		}
		if (isValid(board, row - 2, col + 1)) {
			// if they are valid then check each row & column have placed knights.
			if (board[row - 2][col + 1]) {
				return false;
			}
		}
		if (isValid(board, row - 1, col + 2)) {
			// if they are valid then check each row & column have placed knights.
			if (board[row - 1][col + 2]) {
				return false;
			}
		}
		if (isValid(board, row + 1, col - 2)) {
			// if they are valid then check each row & col have placed knights.
			if (board[row + 1][col - 2]) {
				return false;
			}
		}
		return true;
	}

	// check here for boundary conditions.
	static boolean isValid(boolean[][] board, int row, int col) {
		if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
			return true;
		}
		return false;
	}

	static void display(boolean[][] board) {
		for (boolean[] arr : board) {
			for (boolean element : arr) {
				if (element) {
					System.out.print("K ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
}
