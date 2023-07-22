package sorting;

import java.util.Arrays;

public class SortArrayUsingBubbleSort {
	/*
	 * Sort the given array using bubble sort.
	 */
	// Approach.
	/*
	 * 1- first run a loop for i from 0 to array length. 2- again run loop for j
	 * from 1 to array length or arr.length - i;. 3- Now check if element is less
	 * from previous element then do swapping and return arr.
	 */
	public static void main(String[] args) {
		// int[] arr = { 3, 1, 4, 5, 2 };
		// int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		// int[] arr = { 2, 0, 2, 1, 1, 0 };
		int[] arr = { 2, 0, 1 };
		System.out.println("Original array :: " + Arrays.toString(arr));
		int[] sort = bubbleSort(arr);

		System.out.println("sorted array :: " + Arrays.toString(sort));
	}

	public static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

}
