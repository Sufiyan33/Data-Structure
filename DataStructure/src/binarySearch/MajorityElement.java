package binarySearch;

public class MajorityElement {
	/*
	 * 169. Majority Element
	 * 
	 * Majority element ?= The majority element is the element that appears more
	 * than ⌊n / 2⌋ times.
	 */

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		// int[] nums = { 2, 2, 1, 1, 1, 2, 2 }
		// int[] nums = { 6, 6, 6, 7, 7 }; // output = 6;
		int number = majorityElement(nums);
		System.out.println("majority element is :: " + number);
	}

	public static int majorityElement(int[] nums) {
		int mjElement = nums.length / 2;
		int count = 0;
		int temp = 0;

		if (nums.length == 1) {
			return 1;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					temp = nums[j];
				}
			}
		}

		if (count >= mjElement) {
			return temp;
		}
		return -1;
	}
}
