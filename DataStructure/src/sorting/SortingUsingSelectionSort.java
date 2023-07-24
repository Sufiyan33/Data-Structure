package sorting;

import java.util.Arrays;

public class SortingUsingSelectionSort {
	/*
	 * Selection sort.
	 * 
	 * Pick a smallest or larger element one by one and place at correct index or
	 * position. you can do this in two way.
	 * 
	 * 1- pick large element and do swapping.
	 * 
	 * 2- pick smallest element and do swapping.
	 */
	// Here I am picking smallest element.
	public static void main(String[] args) {
		// int arr[] = { 64, 25, 12, 22, 11 };
		// int[] arr = { 5, 4, 1, 3, 2 };
		int[] arr = { 14, 3, 1, 8, 90, 4, 0 };
		// int[] arr = { -13, 15, -12, 5, 14, 0, 3, -2, -23 };
		// int[] arr = { 1 };
		// int[] arr = {};
		// int[] arr = { 5, 4 };
		System.out.println("Unsorted array is :: " + Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("Sorted array is :: " + Arrays.toString(arr));
	}

	public static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// find min element in unsorted array.
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// Now swap element bc we found min element.
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
