package cyclicSort;

import java.util.Arrays;

public class FindMissingAndDuplicateNumber {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 2, 4 };
		int[] arr = { 1, 1 };

		int[] nums = findNumbers(arr);
		System.out.println(Arrays.toString(nums));
	}

	static int[] findNumbers(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// Find missing and duplicate number.
		int duplicate;
		int missing;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				duplicate = arr[index];
				missing = index + 1;

				return new int[] { duplicate, missing };
			}
		}
		return new int[] { -1, -1 };
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
