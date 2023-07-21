package sorting;

import java.util.Arrays;

public class SortArrayUsingBubbleSortOptimalWay {
	/*
	 * Sort the given array using bubble sort.
	 */
	// Approach.
	/*
	 * 1- first run a loop for i from 0 to array length.
	 * 
	 * 2- again run loop for j from 1 to array length or arr.length - i;. 3- Now
	 * check if element is less from previous element then do swapping and return
	 * arr.
	 */
	public static void main(String[] args) {
		// int[] arr = { 3, 1, 4, 5, 2 };
		// //int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int[] arr = { 3, 99, 34, -1, -22, 0, 70, -9 };
		System.out.println("Original array :: " + Arrays.toString(arr));
		int[] sort = bubbleSort(arr);
		System.out.println("sorted array :: " + Arrays.toString(sort));
	}

	public static int[] bubbleSort(int[] arr) {
		boolean swapped = false;
		// run the steps n-1 times;
		for (int i = 0; i < arr.length; i++) {
			/*
			 * for each item max item will be come as the last respective index Hence J loop
			 * will to n-1 or n-i items.
			 */
			for (int j = 1; j < arr.length - i; j++) {
				// swap if element is less from previous element.
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			/*
			 * if you did not swap for a particular value of i, it means array is already
			 * sorted. Hence stop the program.
			 */
			if (!swapped) {
				break;
			}
		}
		return arr;
	}
}
