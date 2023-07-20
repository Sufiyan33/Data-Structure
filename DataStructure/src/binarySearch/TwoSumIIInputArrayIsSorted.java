package binarySearch;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
	/*
	 * 167. Two Sum II - Input Array Is Sorted LeetCode problem Given a 1-indexed
	 * Array is sorted in ascending order, find two number and their sum equal to
	 * target number. And then return index of those number.
	 */
	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] twoSumIndex = twoSum(numbers, target);
		System.out.println(Arrays.toString(twoSumIndex));
	}

	public static int[] twoSum(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int sum = arr[start] + arr[end];
			if (target > sum)
				start++;
			else if (target < sum)
				end--;
			else
				return new int[] { ++start, ++end };
		}

		return new int[] { ++start, ++end };
	}
}
