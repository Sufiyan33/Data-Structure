package arrays;

import java.util.Arrays;

public class RotateArrayToTheRightByK {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int[] rotate = rotate(nums, k);
		System.out.println(Arrays.toString(rotate));
	}

	public static int[] rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		int[] revers = reverse(nums, 0, n - 1);
		revers = reverse(nums, 0, k - 1);
		revers = reverse(nums, k, n - 1);

		return revers;
	}

	public static int[] reverse(int[] nums, int start, int end) {

		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

		return nums;
	}
}
