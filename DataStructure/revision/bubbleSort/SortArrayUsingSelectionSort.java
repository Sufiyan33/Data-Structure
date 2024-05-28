package bubbleSort;

import java.util.Arrays;

public class SortArrayUsingSelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2, 6, 9, 7 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			// find max number and swap it...
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			
			swap(arr, maxIndex, last);
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;

		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
