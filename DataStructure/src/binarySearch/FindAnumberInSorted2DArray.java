package binarySearch;

import java.util.Arrays;

public class FindAnumberInSorted2DArray {
	/*
	 * To find a number in 2D array as I explained earlier that try to reduce search
	 * space as minimal as possible. It doesn't matter weather array is N*N or M*N.
	 * Here, let say target is 6. We know that our target is in row-1 and col-1.
	 * find middle to apply binary search
	 * 
	 * Case 1 : if element > target means we can ignore rows after it. Because every
	 * element would be greater than target.
	 * 
	 * Case 2 : if if element < target means we can ignore above rows. Because every
	 * element before target would be less
	 * 
	 * Case 3 : if element == target, then this is your answer.
	 * 
	 * Till here we reduce two rows. Now two rows remaining find out mid and find
	 * your target.
	 * 
	 * Case 4 : May be your mid is target, hence check within the middle.
	 * 
	 * Case 5 : if this is not the case then search left and right of middle.
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int target = 10;

		int[] targetNumberIndex = findTargetNumber(arr, target);
		System.out.println("Target Number index is :: " + Arrays.toString(targetNumberIndex));
	}

	public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {

		while (cStart <= cEnd) {
			int mid = cStart + (cEnd - cStart) / 2;
			if (arr[row][mid] == target) {
				return new int[] { row, mid };
			} else if (arr[row][mid] < target) {
				cStart = mid + 1;
			} else {
				cEnd = mid - 1;
			}
		}
		return new int[] { -1, -1 };
	}

	public static int[] findTargetNumber(int[][] arr, int target) {

		int rows = arr.length;
		int cols = arr[0].length; // Here may be array empty.

		// What if only one row is present in array
		if (rows == 1) {
			// then do normal binary search
			return binarySearch(arr, 0, 0, cols - 1, target);
		}

		// run below loop until two rows left.
		int rStart = 0;
		int rEnd = rows - 1;
		int cMid = cols / 2; // finding mid of column

		while (rStart < (rEnd - 1)) {
			int mid = rStart + (rEnd - rStart) / 2;

			if (arr[mid][cMid] == target) {
				return new int[] { mid, cMid };
			}
			if (arr[mid][cMid] < target) {
				rStart = mid;
			} else {
				rEnd = mid;
			}
		}

		// Now here, we have only two rows.Check weather target is in middle.
		if (arr[rStart][cMid] == target) {
			return new int[] { rStart, cMid };
		}
		if (arr[rStart + 1][cMid] == target) {
			return new int[] { rStart + 1, cMid };
		}

		// search in 1st half by using Binary Search.
		if (target <= arr[rStart][cMid - 1]) {
			return binarySearch(arr, rStart, 0, cMid - 1, target);
		}
		// search in 2nd half by using Binary Search.
		if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
			return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
		}
		// search in 3rd half by using Binary Search.
		if (target <= arr[rStart + 1][cMid - 1]) {
			return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
		} else {
			// search in 4th half by using Binary Search.
			return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
		}
	}
}
