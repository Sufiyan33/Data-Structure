package arrays;

public class MaximumProductOfThreeNumbers {
	/*
	 * 628. Maximum Product of Three Numbers
	 * 
	 * https://leetcode.com/problems/maximum-product-of-three-numbers/
	 */
	public static void main(String[] args) {
		// int[] nums = { 1, 2, 3 }; // Output: 6
		// int[] nums = { 1, 2, 3, 4 }; // Output: 24
		int[] nums = { -1, -2, -3 }; // Output: -6
		int product = maximumProduct(nums);
		System.out.println("maximum Product =: " + product);
	}

	public static int maximumProduct(int[] nums) {
		int product = 1;
		for (int num : nums) {
			product *= num;
		}
		return product;
	}
}
