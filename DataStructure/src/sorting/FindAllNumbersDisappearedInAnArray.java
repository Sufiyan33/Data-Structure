package sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
	/*
	 * 448. Find All Numbers Disappeared in an Array
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 */

	// Need to fix this
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Output: [5,6]
		// int[] nums = { 1, 1 };
		List<Integer> numbers = findDisappearedNumbers(nums);
		System.out.println(numbers);
	}

	public static List<Integer> findDisappearedNumbers(int[] arr) {
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
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1)
				list.add(index + 1);
		}
		return list;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
