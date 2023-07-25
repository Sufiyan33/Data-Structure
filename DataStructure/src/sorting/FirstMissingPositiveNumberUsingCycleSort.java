package sorting;

public class FirstMissingPositiveNumberUsingCycleSort {
	/*
	 * 41. First Missing Positive
	 * https://leetcode.com/problems/first-missing-positive/
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 0 }; // Output: 3
		// int[] nums = { 3, 4, -1, 1 }; // Output: 2
		// int[] nums = { 7, 8, 9, 11, 12 }; // Output: 1
		int missingPositive = firstMissingPositive(nums);
		System.out.println("first missing positive is :: " + missingPositive);
	}

	public static int firstMissingPositive(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
		// Search missing number here.
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}
		}

		return arr.length + 1;
	}

	public static void swap(int[] arr, int first, int end) {
		int temp = arr[first];
		arr[first] = arr[end];
		arr[end] = temp;
	}
}
