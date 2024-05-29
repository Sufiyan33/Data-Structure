package bubbleSort;

import java.util.Arrays;

public class SortArrayUsingInsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2 };

		// int[] arr = { 5, -2, 0, 1, 9, 4, 2 };
		// int[] arr = { 5, 4 };

		// int[] arr = {};

		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
