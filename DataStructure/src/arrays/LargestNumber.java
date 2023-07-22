package arrays;

import java.util.Arrays;

public class LargestNumber {
	/*
	 * 179. Largest Number.
	 * 
	 * Given a list of non-negative integers nums, arrange them such that they form
	 * the largest number and return it.
	 * 
	 * Since the result may be very large, so you need to return a string instead of
	 * an integer.
	 */

	public static void main(String[] args) {
		// int[] nums = { 10, 2 }; // output = "210";
		int[] nums = { 3, 30, 34, 5, 9 }; // Output: "9534330";
		String largestNumber = largestNumber(nums);
		System.out.println("Largest number is :: " + largestNumber);
	}

	public static String largestNumber(int[] nums) {
		String result = "";

		/*
		 * for (int i = arr.length - 1; i >= 0; i--) { result += arr[i] + ""; }
		 * 
		 * return result;
		 */

		String[] s = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			s[i] = String.valueOf(nums[i]);
		Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
		return s[0].equals("0") ? "0" : String.join("", s);
	}
}
