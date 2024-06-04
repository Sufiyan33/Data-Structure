package mergeSort;

import java.util.Arrays;

public class SortArrayTakingExtraSpace {

	/*
	 * Sort an array using merge sort. Here we are going to use extra space, means
	 * taking temp array.
	 * 
	 * Steps 1 : Divide array into two parts.
	 * 
	 * Steps 2 : Solve this two subArray using recursion.
	 * 
	 * Steps 3 : Merge left & right array into temp array then return that array.
	 * while merging array take two pointers and compare the value. If any array
	 * have some elements to compare then at the end add directly elements into the
	 * temp array.
	 * 
	 * Here original array is not modified because using a temp array.
	 */

	public static void main(String[] args) {
		// int[] arr = { 20, 14, 13, 18, 31 };
		int[] arr = { 5, 4, 3, 2, 1 };
		// int[] arr = { 1, 0 };
		// int[] arr = { 1 };
		// int[] arr = {}; not working for empty array.

		int[] result = sort(arr);
		System.out.println(Arrays.toString(result));
	}

	static int[] sort(int[] arr) {

		if (arr.length == 1)
			return arr;

		// divide array into parts.
		int mid = arr.length / 2;

		// now sort each parts one by one. Here passing copy of original array.
		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

		return mergeArrays(left, right);
	}

	static int[] mergeArrays(int[] first, int[] second) {

		int i = 0, j = 0, index = 0;
		int temp[] = new int[first.length + second.length];

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				temp[index] = first[i];
				i++;
				index++;
			} else {
				temp[index] = second[j];
				j++;
				index++;
			}
		}

		// Now if some element remains in first array then add directly into temp.
		while (i < first.length) {
			temp[index] = first[i];
			i++;
			index++;
		}

		// Now if some element remains in second array then add directly into temp.
		while (j < second.length) {
			temp[index] = second[j];
			j++;
			index++;
		}
		return temp;
	}
}
