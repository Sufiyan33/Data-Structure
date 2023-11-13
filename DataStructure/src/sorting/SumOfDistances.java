package sorting;

import java.util.Arrays;

public class SumOfDistances {
	/*
	 * 2615. Sum of Distances
	 * 
	 * https://leetcode.com/problems/sum-of-distances/
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 1, 2 };
		long[] d = distance(nums);
		System.out.println(Arrays.toString(d));
	}

	public static long[] distance(int[] nums) {
		int k = 0;
		long[] temp = new long[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] & i != j) {
					temp[k++] = Math.abs(i - j) + Math.abs(i - j);
				} else {
					temp[k++] = 0;
				}
			}
		}
		return temp;
	}
}
