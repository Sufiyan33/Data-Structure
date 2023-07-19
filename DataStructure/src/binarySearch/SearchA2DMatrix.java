package binarySearch;

public class SearchA2DMatrix {
	/*
	 * 74. Search a 2D Matrix | LeetCode Problem
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 1;
		boolean flag = findTargetIn2DArray(matrix, target);
		System.out.println("is target found :: " + flag);
	}

	public static boolean findTargetIn2DArray(int[][] arr, int target) {
		int row = 0;
		int col = arr.length - 1;

		while (row < arr.length && col >= 0) {

			if (arr[row][col] == target) {
				return true;
			}
			if (arr[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}
}
