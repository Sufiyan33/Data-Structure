package binarySearch;

public class SearchAnumberInSortedArray {

	public static void main(String[] args) {
		int[] arr = { -18, -9, 0, 2, 3, 5, 6, 12, 22, 34, 50, 55, 60, 99 };
		int target = -9;
		int ans = binarySearch(arr, target);
		System.out.println("target element index is :: " + ans);
	}

	// return index of target element.
	// if target element is not found then return -1;

	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			/*
			 * this is equal to (start + end)/2. you can verify. We written like this bc if
			 * start and end is large then there is a limitation of int. it can't store huge
			 * number.
			 */

			if (target < arr[mid]) {
				end = mid - 1; // search target in the left side.
			} else if (target > arr[mid]) {
				start = mid + 1; // search target in the right side.
			} else {
				return mid; // means target is equal to mid.
			}
		}

		return -1;
	}
}
