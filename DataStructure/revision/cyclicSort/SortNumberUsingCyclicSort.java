package cyclicSort;

import java.util.Arrays;

public class SortNumberUsingCyclicSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2 };

		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void cyclicSort(int[] arr) {
		int i = 0;

		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			if (arr[i] != arr[correctIndex]) { // Step 1 : check whether number is at correct index or not.
				swap(arr, i, correctIndex); // Step 2 : swap with correct index.
			} else {
				i++; // Step 3 : move forward.
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
