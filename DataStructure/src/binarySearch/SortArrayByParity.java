package binarySearch;

import java.util.Arrays;

public class SortArrayByParity {
	/*
	 * 905. Sort Array By Parity
	 * 
	 * https://leetcode.com/problems/sort-array-by-parity
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4 }; // Output: [2,4,3,1]
		// int[] arr = { 0 }; // Output: [0]

		int[] even = sortArrayByParity(arr);
		System.out.println("even : " + Arrays.toString(even));
	}

	private static int[] sortArrayByParity(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		if (arr[left] % 2 == 0 && arr[right] % 2 != 0) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}

		if (arr[left] % 2 == 0) {
			right++;
		}
		if (arr[right] % 2 != 0) {
			left++;
		}

		return arr;
	}
}
