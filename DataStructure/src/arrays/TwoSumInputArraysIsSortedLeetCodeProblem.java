package arrays;

import java.util.Arrays;

public class TwoSumInputArraysIsSortedLeetCodeProblem {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] arraySum = arraySum(numbers, target);
		System.out.println(Arrays.toString(arraySum));
	}

	public static int[] arraySum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
		// need to do some correction...
	}
}
