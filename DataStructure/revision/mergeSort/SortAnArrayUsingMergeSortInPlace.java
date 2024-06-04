package mergeSort;

import java.util.Arrays;

public class SortAnArrayUsingMergeSortInPlace {

	/*
	 * Here, we are going to sort an array using merge sort without taking an extra
	 * space. Means we will modify original array. To do this we will use indices
	 * start, mid and end.
	 */

	public static void main(String[] args) {
		// int arr[] = { 5, 4, 3, 1, 2 };
		// int[] arr = { 20, 14, 13, 18, 31 };
		// int[] arr = { 5, 4, 3, 2, 1 };
		// int[] arr = { 1, 0 };
		int[] arr = { 1 };
		sort(arr, 0, arr.length);

		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr, int start, int end) {
		if (end - start == 1)
			return;

		int mid = start + (end - start) / 2;

		sort(arr, start, mid);
		sort(arr, mid, end);

		mergeArrays(arr, start, mid, end);
	}

	static void mergeArrays(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid;
		int index = 0;

		int[] mix = new int[end - start];

		// compare & merge values.
		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				mix[index] = arr[i];
				i++;
			} else {
				mix[index] = arr[j];
				j++;
			}
			index++;
		}

		// if elements remain in first half array then directly add in array.
		while (i < mid) {
			mix[index] = arr[i];
			i++;
			index++;
		}

		// if elements remain in second half array then directly add in array.
		while (j < end) {
			mix[index] = arr[j];
			j++;
			index++;
		}

		// Now transfer all elements of mix into original array.
		// Here, array size would be => start + k;
		for (int k = 0; k < mix.length; k++) {
			arr[start + k] = mix[k];
		}
	}
}
