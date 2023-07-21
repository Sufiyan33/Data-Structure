package binarySearch;

import java.util.Arrays;

public class MajorityElementIterativeApproach {
	/*
	 * 169. Majority Element. Majority element ?= The majority element is the
	 * element that appears more than ⌊n / 2⌋ times.
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 2, 3 };
		// int[] nums = { 2, 2, 1, 1, 1, 2, 2 }
		int[] nums = { 6, 6, 6, 7, 7 }; // output = 6;
		int number = majorityElement(nums);
		System.out.println("majority element is :: " + number);
	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int length = nums.length;
		return nums[length / 2];
	}
}
