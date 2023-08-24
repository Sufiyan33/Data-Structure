package backtracking;

import java.util.ArrayList;

public class MazeProblem {
	/*
	 * Solving maze problem with all scenario using Recursion
	 */
	// Approach.
	public static void main(String[] args) {
		int countMove = moveCount(3, 03);
		System.out.println("Number of moves to destination are := " + countMove);

		System.out.println();

		System.out.println("Printing all possible paths are := ");
		paths("", 3, 3);

		System.out.println();

		System.out.println("All possible paths returning as List := ");
		System.out.println(pathsReturnList("", 3, 3));
	}

	static int moveCount(int row, int col) {
		if (row == 1 || col == 1) {
			return 1;
		}

		// If we are moving towards down then decrease row, col will remain same.
		int left = moveCount(row - 1, col);

		// If we are moving towards right then row will remain same & decrease col.
		int right = moveCount(row, col - 1);

		return left + right;
	}

	// Now print all paths to reach destination.

	static void paths(String p, int row, int col) {
		if (row == 1 && col == 1) {
			System.out.println(p);
			return;
		}

		// if row > 1 then we move next either it down or right otherwise it will give
		// exception.
		if (row > 1) {
			paths(p + 'D', row - 1, col);
		}

		// if col > 1 then we move right. Hence add right move in path.

		if (col > 1) {
			paths(p + 'R', row, col - 1);
		}
	}

	// Now return all possible paths as a List.

	static ArrayList<String> pathsReturnList(String p, int row, int col) {
		if (row == 1 && col == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> ans = new ArrayList<>();

		if (row > 1) {
			ans.addAll(pathsReturnList(p + 'D', row - 1, col));
		}

		if (col > 1) {
			ans.addAll(pathsReturnList(p + 'R', row, col - 1));
		}
		return ans;
	}

}
