package sorting;

import java.util.Arrays;

public class SortArrayUsingSelectionSort {
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
	// Here I am picking largest element.
	public static void main(String[] args) {
		// int[] arr = { 5, 4, 1, 3, 2 };
		// int[] arr = { 14, 3, 1, 8, 90, 4, 0 };
		// int[] arr = { -13, 15, -12, 5, 14, 0, 3, -2, -23 };
		// int[] arr = { 1 };
		// int[] arr = {};
		int[] arr = { 5, 4 };
		System.out.println("Original unsorted Array is :: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Now sorted Array is :: " + Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// Now find the max number to swap with correct index. Hence also find last
			// index.
			int last = arr.length - i - 1; // last index with whom max will swap
			int max = getMaxIndex(arr, 0, last);
			// now we found max and last. So now do swapping to each other.
			swap(arr, max, last);
		}
	}

	public static int getMaxIndex(int[] arr, int start, int end) {
		int max = start; // since start is zero OR you can assign it 0 as well.
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	public static void swap(int[] arr, int first, int end) {
		int temp = arr[first];
		arr[first] = arr[end];
		arr[end] = temp;
	}
}
