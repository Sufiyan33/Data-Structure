package arrays;

import java.util.Arrays;

public class FindANumberIn2DArray {
	/*
	 * Here, need to find a number in 2D array. First set lower bound and upper
	 * bound then try to find out number. Searching in 2D array try to minimize
	 * search space as minimal as possible.
	 */
	// Approach.
	/*
	 * Case 1: if arr[row][col == target then you found the number. Case 2: if
	 * arr[row][col] > target, it means you should ignore that row and column, any
	 * these number would be greater to target.(col--) Case 3 : if arr[row][col] <
	 * target, means you should check on next row. Hence update row++;
	 */

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 19, 29, 37, 49 }, { 22, 32, 42, 50 } };
		// int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
		// 15, 16 } };
		int target = 37;
		int[] findTarget = searchIn2DArray(arr, target);
		System.out.println(Arrays.toString(findTarget));
	}

	public static int[] searchIn2DArray(int[][] arr, int target) {

		int row = 0;
		int col = arr.length - 1;

		while (row < arr.length && col >= 0) {

			if (arr[row][col] == target) {
				return new int[] { row, col };
			} else if (arr[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return new int[] { -1, -1 };
	}
}
