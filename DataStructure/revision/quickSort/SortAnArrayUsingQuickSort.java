package quickSort;

import java.util.Arrays;

public class SortAnArrayUsingQuickSort {

	/*
	 * Sort an array using quick sort.
	 */
	public static void main(String[] args) {
		// int[] arr = { 5, 4, 3, 1, 2 };
		// int[] arr = { 20, 14, 13, 18, 31 };
		// int[] arr = { 5, 4, 3, 2, 1 };
		// int[] arr = { 1, 0 };
		int[] arr = { 1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int[] arr, int low, int high) {
		// base condition
		if (low >= high)
			return;

		int start = low;
		int end = high;

		int mid = start + (end - start) / 2;
		int pivot = arr[mid];

		while (start <= end) {
			// conditions will violate if
			while (arr[start] < pivot) {
				start++;
			}

			while (arr[end] > pivot) {
				end--;
			}

			// if condition violates then only swap to stop violates and increase pointer.
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}

			/*
			 * Now my pivot is at correct index. Hence make recursive call and sort two
			 * half.
			 */

			quickSort(arr, low, end);
			quickSort(arr, start, high);
		}
	}
}
