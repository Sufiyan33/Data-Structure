package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program4Sum {
	/*
	 * 18. 4Sum
	 * 
	 * https://leetcode.com/problems/4sum/
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0; // Output: {{-2,-1,1,2};,{-2,0,0,2};,{-1,0,0,1};};

		// int[] nums = { 2, 2, 2, 2, 2 };
		// int target = 8; // Output: {{2,2,2,2}
		List<List<Integer>> fourSum = fourSum(nums, target);
		System.out.println("four sum = : " + fourSum);
	}

	public static List<List<Integer>> fourSum(int[] arr, int target) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(arr);
		int sum = 0;

		for (int i = 0; i < arr.length - 2; i++) {
			int a = i + 1;
			int b = i + 2;
			int c = arr.length - 1;

			while (a < c) {
				sum = arr[i] + arr[a] + arr[b] + arr[c];
				if (sum == target) {
					set.add(Arrays.asList(arr[i], arr[a++], arr[b++], arr[c--]));
				}
				if (sum < 0)
					a++;
				if (sum < 0)
					b++;
				if (sum > 0)
					c--;
			}
		}
		return new ArrayList<>(set);
	}
}
