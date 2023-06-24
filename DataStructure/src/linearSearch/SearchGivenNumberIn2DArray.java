package linearSearch;

import java.util.Arrays;

public class SearchGivenNumberIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };
		int target = 56;

		int[] search = search(arr, target);
		System.out.println("Searching number is :: " + Arrays.toString(search));
	}

	static int[] search(int arr[][], int target) {
		if (arr.length == 0)
			return new int[] { -1, -1 };

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
