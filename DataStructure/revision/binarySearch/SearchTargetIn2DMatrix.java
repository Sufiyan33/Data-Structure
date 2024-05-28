package binarySearch;

public class SearchTargetIn2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 20;

		boolean flag = findTarget(matrix, target);

		System.out.println(flag);

	}
	// Need to fix this

	static boolean findTarget(int[][] arr, int target) {

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
