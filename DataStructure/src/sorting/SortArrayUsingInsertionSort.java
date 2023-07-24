package sorting;

import java.util.Arrays;

public class SortArrayUsingInsertionSort {
	/*
	 * Insertion sort.
	 * 
	 * first pick an element and compare from its previous element. if less then
	 * compare otherwise break loop. In each pass array will be sorted in left side.
	 * Here, i would start from zero till < arr.lenght-1 or <= arr.length -2; J will
	 * start from i+1 and J should be > 0 and each time J-- will be subtracted.
	 */

	public static void main(String[] args) {
		// int[] arr = { 5, 4, 3, 1, 2 };
		// int[] arr = { -12, 0, 2, 54, 7, 1, -43, 6 };
		// int[] arr = { 5, 4 };
		// int[] arr = {};
		// int[] arr = { 1 };
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("Unsorted array is :: " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("sorted array is :: " + Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		// run i < arr.length-1 or i <= arr.length - 2; both are same.
		// run 1st loop for passed and J for comparison.
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1])
					swap(arr, j, j - 1);
				else
					break;
			}
		}
	}

	public static void swap(int[] arr, int first, int end) {
		int temp = arr[first];
		arr[first] = arr[end];
		arr[end] = temp;
	}
}
