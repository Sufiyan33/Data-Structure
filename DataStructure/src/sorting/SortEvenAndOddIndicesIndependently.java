package sorting;

import java.util.Arrays;

public class SortEvenAndOddIndicesIndependently {
	/*
	 * 2164. Sort Even and Odd Indices Independently
	 * https://leetcode.com/problems/sort-even-and-odd-indices-independently/
	 * description/
	 */

	public static void main(String[] args) {
		// int[] arr = { 4, 1, 2, 3 }; // Output: [2,3,4,1]
		// int[] arr = { 2, 1 }; // Output: [2,1]
		int[] arr = { 4, 2, 5, 7 }; // Output: [4,5,2,7]

		int[] sortArray = sortEvenOdd(arr);
		System.out.println("even number array =: " + Arrays.toString(sortArray));
	}

	// Need to fix this
	public static int[] sortEvenOdd(int[] arr) {

		// sort odd in desc order.
		/*
		 * Sort number in asce order which are present in even index.
		 */
		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (arr[i] % 2 == 0) {
					temp[k++] = arr[i];
				}
			} else {
				if (arr[i] % 2 != 0) {
					temp[k++] = arr[i];
				}
			}
		}

		return temp;
	}
}
