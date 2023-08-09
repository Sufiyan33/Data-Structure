package binarySearch;

import java.util.Arrays;

public class SearchTargetIn2DArray {
	/*
	 * Search Target in 2D array. Where sorted row and column wise.
	 */
	// Approach.
	/*
	 * Step 1 : if target == arr[row][col] -> means you found the number.
	 * 
	 * Step 2 : if arr[row][col] > target -> means target is less. Hence you can
	 * ignore that row and column to minimize search space. (column--);
	 * 
	 * Step 3 : if arr[row][col] < target -> means target is greater to element.
	 * Hence try to find in next row.(row++)
	 */

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45, }, { 17, 27, 37, 47 }, { 20, 29, 39, 49 } };
		int target = 17;
		int[] targetIndex = searchIn2DArray(arr, target);
		System.out.println("Target index is =: " + Arrays.toString(targetIndex));
	}

	public static int[] searchIn2DArray(int[][] arr, int target) {
		int row = 0;
		int col = arr.length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target)
				return new int[] { row, col };

			if (arr[row][col] > target)
				col--;
			if (col >= 0 && arr[row][col] < target)
				row++;
		}
		return new int[] { -1, -1 };
	}
}
