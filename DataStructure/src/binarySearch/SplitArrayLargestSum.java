package binarySearch;

public class SplitArrayLargestSum {

	/*
	 * Split Array Largest Sum : LeetCode Problem
	 */
	public static void main(String[] args) {
		int[] arr = { 7, 2, 5, 10, 8 };
		int m = 2;
		int subArray = splitArrayInSubArray(arr, m);
		System.out.println("Split Array Largest sun is :: " + subArray);
	}

	public static int splitArrayInSubArray(int[] arr, int m) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			start = Math.max(start, arr[i]);
			end += arr[i];
		}
		// apply binary search
		while (start < end) {
			int mid = start + (end - start) / 2;

			// calculate how many pieces you can divide this in with this max;
			int sum = 0;
			int pieces = 1;

			for (int num : arr) {
				if (sum + num > mid) {
					// you can not add in this subarray, create new one.
					// Hence adding in new subarray, sum will be equal to num itSelf.
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}

			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return end; // here start == end;
	}
}
