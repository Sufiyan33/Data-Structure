package bubbleSort;

import java.util.Arrays;

public class SortUsingBubbleSortInOptimalWay {

	public static void main(String[] args) {
		//int arr[] = { 3, 1, 5, 4, 2 };
		int[] arr = { 1, 2, 3, 4, 5 };
		bubbleSorting(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSorting(int arr[]) {

		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

					swapped = true;
				}
			}

		// if you didn't swap a particular value for i, it means array is already
		// sorted.

		if (!swapped) {
			break;
		}
	}
	}
}
