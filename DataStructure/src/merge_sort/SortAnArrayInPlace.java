package merge_sort;

import java.util.Arrays;

public class SortAnArrayInPlace {
	/*
	 * Sort array using merge sort but in-place means don't use extra space.
	 */
	public static void main(String[] args) {
		int[] arr = { 8, 3, 4, 12, 5, 6 };
		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void mergeSort(int[] arr, int start, int end) {
		if (end - start == 1)
			return;

		int mid = start + (end - start) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);

		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int[] mix = new int[end - start];
		int i = start;
		int j = mid;
		int index = 0;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				mix[index] = arr[i];
				i++;
			} else {
				mix[index] = arr[j];
				j++;
			}
			index++;
		}

		/*
		 * May be at the last one of the array not complete or remain some element. so
		 * for this simply copy element in mix array.
		 */

		while (i < mid) {
			mix[index] = arr[i];
			i++;
			index++;
		}
		while (j < end) {
			mix[index] = arr[j];
			j++;
			index++;
		}

		for (int t = 0; t < mix.length; t++) {
			arr[start + t] = mix[t];
		}
	}
}
