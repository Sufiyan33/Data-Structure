package binarySearch;

public class OrderAgnosticArray {
	/*
	 * when you don't know weather array is sorted or not, then how to search
	 * target. for this compare first and last number of array, eg arr[first] >
	 * arr[end] means descending order. So for this take boolean flag and based on
	 * that write code.
	 * 
	 */

	public static void main(String[] args) {
		// int[] arr = { -18, -9, 0, 2, 3, 5, 6, 12, 22, 34, 50, 55, 60, 99 };
		int[] arr = { 99, 66, 54, 44, 34, 30, 12, 11, 10, 5, 4, 2, 1, 0, -1, -2 };
		int target = -2;
		int index = orderAgnositcBinarySearch(arr, target);
		System.out.println("target element index is :: " + index);
	}

	public static int orderAgnositcBinarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];
		System.out.println("is array in ascending order :: " + isAsc);

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) { // if arr is in ascending order then follow this.
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else { // if arr is in descending order then follow this.
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
