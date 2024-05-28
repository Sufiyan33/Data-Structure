package binarySearch;

import java.util.Arrays;

public class FindTargetIn2DArray {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45, }, { 17, 27, 37, 47 }, { 20, 29, 39, 49 } };
		int target = 17;
		int[] result = findNumber(arr, target);
		System.out.println(Arrays.toString(result));
	}

	static int[] findNumber(int[][] arr, int target) {

		int row = 0;
		int col = arr.length - 1;

		while (row < arr.length && col >= 0) {

			if (arr[row][col] == target)
				return new int[] { row, col };

			if (arr[row][col] > target) {
				col--;
			}

			if (col >= 0 && arr[row][col] < target) {
				row++;
			}
		}

		return new int[] { -1, -1 };
	}
}
