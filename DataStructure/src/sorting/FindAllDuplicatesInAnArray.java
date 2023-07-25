package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	/*
	 * 442. Find All Duplicates in an Array
	 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
	 */
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Output: [2,3]
		// int[] nums = { 1, 1, 2 }; // Output: [1]
		System.out.println("Unsorted array is :: " + Arrays.toString(nums));
		List<Integer> duplicates = findDuplicates(nums);
		System.out.println("duplicates are :: " + duplicates);
	}

	public static List<Integer> findDuplicates(int[] arr) {
		List<Integer> list = new ArrayList<>();

		// first sort the array.
		// Case 1 : if array start from 0 to N then find index.
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex])
				swap(arr, i, correctIndex);
			else
				i++;
		}

		// Case 1 : search for missing number.
		// System.out.println("swapped array is :: " + Arrays.toString(arr));

		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					list.add(arr[k]);
				}
			}
		}

		return list;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
