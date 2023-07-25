package sorting;

import java.util.Arrays;

public class SetMismatch {
	/*
	 * 645. Set Mismatch
	 * 
	 * https://leetcode.com/problems/set-mismatch/
	 */
	public static void main(String[] args) {
		// int[] nums = { 1, 2, 2, 4 }; // Output: {2,3}
		int[] nums = { 1, 1 }; // Output: {1,2}
		int[] missmatch = findErrorNums(nums);
		System.out.println("duplicate & missing number are :: " + Arrays.toString(missmatch));
	}

	public static int[] findErrorNums(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// now find missing and duplicate number here.

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return new int[] { arr[index], index + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
