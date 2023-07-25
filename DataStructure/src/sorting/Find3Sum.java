package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find3Sum {
	/*
	 * 15. 3Sum
	 * 
	 * https://leetcode.com/problems/3sum/
	 */
	public static void main(String[] args) {
		// int[] nums = { -1, 0, 1, 2, -1, -4 }; // Output: [[-1,-1,2],[-1,0,1]]
		int[] nums = { 0, 1, 1 }; // Output: []
		// int[] nums = {0,0,0};//Output: [[0,0,0]]
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println("3 sum is :: " + threeSum);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				}
				if (sum < 0)
					j++;
				if (sum > 0)
					k--;
			}
		}
		return new ArrayList<>(set);
	}
}
