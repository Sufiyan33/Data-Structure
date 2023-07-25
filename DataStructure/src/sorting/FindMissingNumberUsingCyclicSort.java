package sorting;

import java.util.Arrays;

public class FindMissingNumberUsingCyclicSort {
	/*
	 * Find a missing number in range of 0 to N. use cyclic sort.
	 */
	public static void main(String[] args) {
		// int[] arr = { 3, 0, 1 };
		int[] arr = { 4, 2, 0, 1 };
		System.out.println("Unsorted array is :: " + Arrays.toString(arr));
		int number = missingNumber(arr);
		System.out.println("sorted array is :: " + Arrays.toString(arr));
		System.out.println("missing number is :: " + number);
	}

	public static int missingNumber(int[] arr) {
		// first sort the array.
		// Case 1 : if array start from 0 to N then find index.
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correctIndex])
				swap(arr, i, correctIndex);
			else
				i++;
		}

		// Case 1 : search for missing number.
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index)
				return index;
		}

		// Case 3 : if target is not found then return N means arr.length;
		return arr.length;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
