package binarySearch;

public class KthMissingPositiveNumber {

	/*
	 * 1539. Kth Missing Positive Number
	 */

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		/*
		 * int[] arr = { 1, 2, 3, 4 }; int k = 2;
		 */
		int missingNumber = findKthPositive(arr, k);
		System.out.println("missing number is :: " + missingNumber);
	}

	public static int findKthPositive(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] - mid - 1 < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return start + k;
	}
}
