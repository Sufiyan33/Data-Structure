package recursion;

import java.util.Arrays;

public class SortArrayUsingBubbleSort {

	/*
	 * Sort array using bubble sort with Recursion.
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1, 5, 6 };
		bubbleSort(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr, int lastIndex, int index) {
		if (lastIndex == 0)
			return;

		if (index < lastIndex) {
			if (arr[index] > arr[index + 1]) {
				// swap
				int temp = arr[index];
				arr[index] = arr[index + 1];
				arr[index + 1] = temp;
			}
			bubbleSort(arr, lastIndex, index + 1);
		} else {
			bubbleSort(arr, lastIndex - 1, 0);
		}
	}
}
