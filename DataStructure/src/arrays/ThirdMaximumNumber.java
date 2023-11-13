package arrays;

public class ThirdMaximumNumber {
	/*
	 * 414. Third Maximum Number
	 * 
	 * https://leetcode.com/problems/third-maximum-number/
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 2, 1 }; // Output: 1
		// int[] nums = { 1, 2 }; // Output: 2
		int[] nums = { 2, 2, 3, 1 }; // Output: 1
		int result = thirdMax(nums);
		System.out.println("3rd max is =: " + result);
	}

	// Need to fix this
	public static int thirdMax(int[] arr) {

		if (arr.length >= 3) {
			return arr[2];
		}
		if (arr.length < 3) {
			return arr[1];
		}

		return -1;
	}
}
