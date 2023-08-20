package merge_sort;

import java.util.Arrays;

public class SortAnArray {
	/*
	 * Sort an array using merge sort.
	 */
	public static void main(String[] args) {
		int[] arr = { 8, 3, 4, 12, 5, 6 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));

		/*
		 * Here original array will not modified, if you want you can print original
		 * array.
		 */
		int[] arr1 = { 5, 4, 3, 2, 1 };
		int[] ans = mergeSort(arr1);
		System.out.println("Original Array =: " + Arrays.toString(arr1));
		System.out.println("Sorted Array =: " + Arrays.toString(ans));
	}

	static int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);
	}

	private static int[] merge(int[] first, int[] second) {
		int[] mix = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int index = 0;

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				mix[index] = first[i];
				i++;
			} else {
				mix[index] = second[j];
				j++;
			}
			index++;
		}

		/*
		 * May be at the last one of the array not complete or remain some element. so
		 * for this simply copy element in mix array.
		 */

		while (i < first.length) {
			mix[index] = first[i];
			i++;
			index++;
		}
		while (j < second.length) {
			mix[index] = second[j];
			j++;
			index++;
		}

		return mix;
	}
}
