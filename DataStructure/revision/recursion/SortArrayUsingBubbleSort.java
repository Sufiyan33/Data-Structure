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

		System.out.println("--------- Using for loop --------");
		bubble(arr, arr.length);
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

	// other way.
	static void bubble(int[] arr, int n) {
		// if arr.length or n == 1 then return

		if (n == 1)
			return;

		// iterate array
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				// do swapping
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		// Reduce array in each phase.
		bubble(arr, n - 1);
	}
}
