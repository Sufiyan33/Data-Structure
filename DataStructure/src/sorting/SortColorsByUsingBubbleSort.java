package sorting;

import java.util.Arrays;

public class SortColorsByUsingBubbleSort {
	/*
	 * 75. Sort Colors
	 */
	// Approach
	/*
	 * Sort the 3 colors, red, white and blue color. We will use the integers 0, 1,
	 * and 2 to represent the color red, white, and blue, respectively.
	 */
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		boolean swapped = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
