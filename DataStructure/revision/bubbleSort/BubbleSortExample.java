package bubbleSort;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 4, 2 };
		int[] result = bubbleSort(arr);

		System.out.println(Arrays.toString(result));
	}

	static int[] bubbleSort(int[] arr) {


		for(int i=0; i<arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[i] < arr[j - 1]) {
					swap(arr, j);
				}
			}
		}
		return arr;
	}

	static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j - 1];
		arr[j - 1] = temp;
	}
}
