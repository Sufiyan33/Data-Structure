package binarySearch;

public class SingleElementInASortedArray {
	/*
	 * 540. Single Element in a Sorted Array. LeetCode Problem
	 */
	/*
	 * nums = [1,1,2,3,3,4,4,8,8], Output: 2 Input: nums = [3,3,7,7,10,11,11],
	 * Output: 10
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		// int[] arr = { 10, 10, 4, 4, 7, 11, 11, 12, 12, 2, 2 };
		int element = findSingleElement(arr);
		System.out.println("single element is :: " + element);
	}

	static int findSingleElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			// mid is in odd index then subtract 1 to make it even.
			if (mid % 2 == 1) {
				mid--;
			}
			if (arr[mid] != arr[mid + 1]) {
				// means we have to search in the left or may be this is the only answer hence
				// return it.
				end = mid;
			} else {
				// otherwise element must be present in the right side. So start would be start
				// = mid + 2. to make it even index.
				start = mid + 2;
			}
		}
		return arr[start];
	}
}
