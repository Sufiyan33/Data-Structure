package sorting;

import java.util.Arrays;

public class SortArrayByParity {
	/*
	 * 905. Sort Array By Parity
	 * 
	 * https://leetcode.com/problems/sort-array-by-parity
	 */
	public static void main(String[] args) {
		// int[] arr = { 3, 1, 2, 4 }; // Output: [2,4,3,1]
		int[] arr = { 0 }; // Output: [0]

		int[] even = sortArrayByParity(arr);
		System.out.println("even : " + Arrays.toString(even));
	}

	public static int[] sortArrayByParity(int[] arr) {
		if (arr.length == 1)
			return new int[] { arr[0] };

		int[] evenArray = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArray[k++] = arr[i];
			}
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				evenArray[k++] = arr[j];
			}
		}

		return evenArray;
	}
}
