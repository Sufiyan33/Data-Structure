package binarySearch;

public class FindMinimumInRotatedSortedArrayII {
	/*
	 * Find Minimum in Rotated Sorted Array II
	 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/ Given
	 * the sorted rotated array nums that may contain duplicates, return the minimum
	 * element of this array.
	 */
	// Approach : apply binary search here.
	/*
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5 }; // Output: 1
		// int[] nums = { 2, 2, 2, 0, 1 }; // Output: 0
		// int[] nums = { 1, 3, 3 }; // Output: 1
		// int[] nums = { 3, 1, 3 }; // Output: 3
		int minValue = findMin(nums);
		System.out.println("find min value is :: " + minValue);
	}

	public static int findMin(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[end]) {
				start = mid + 1;
			} else {
				if (arr[mid] < arr[end]) {
					end = mid;
				} else {
					end--;
				}
			}
		}
		return arr[end];
	}
}
