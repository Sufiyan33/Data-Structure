package binarySearch;

public class FindMinimumInRotatedSortedArray {
	/*
	 * 153. Find Minimum in Rotated Sorted Array
	 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
	 * description. Given the sorted rotated array nums of unique elements, return
	 * the minimum element of this array.
	 */
	// Approach : Apply binary search here.
	/*
	 * step 1 : find start, end and mid value.
	 * 
	 * step 2 : check if arr[mid] >= arr[end], if yes then it means we have to
	 * search in right side. Otherwise search in left side.
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 4, 5, 1, 2 }; // Output: 1
		// int[] nums = { 4, 5, 6, 7, 0, 1, 2 }; // Output: 0
		int[] nums = { 11, 13, 15, 17 }; // Output: 11
		int minValue = findMin(nums);
		System.out.println("Find min value is := " + minValue);
	}

	public static int findMin(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] >= arr[end]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return arr[start];
	}
}
