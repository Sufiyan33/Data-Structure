package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
	/*
	 * 2089. Find Target Indices After Sorting Array leetCode problem.
	 */

	// need to do some correction
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 5, 2, 3 };
		int[] arr = { 1, 2, 5, 2, 3 };
		int target = 3;
		// int target = 2;
		List<Integer> result = targetIndices(arr, target);
		System.out.println(result);
	}

	public static List<Integer> targetIndices(int[] nums, int target) {
		Arrays.sort(nums);
		ArrayList<Integer> list = new ArrayList<>();

		int first = findFirstAndLastIndex(nums, target, true);
		int second = findFirstAndLastIndex(nums, target, false);
		// int third = findFirstAndLastIndex(nums, target);
		// list.add(first);

		System.out.println("value of nums[first] is " + nums[first]);
		System.out.println("value of nums[second] is " + nums[second]);

		if (nums[first] != target && nums[second] != target) {
			int third = findFirstAndLastIndex(nums, target);
			list.add(third);
			return list;
		} else {
			list.add(first);
			// list.add(second);
			return list;
		}
	}

	public static int findFirstAndLastIndex(int[] arr, int target, boolean findIndex) {
		int ans = -1;
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				ans = mid;
				if (findIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

	public static int findFirstAndLastIndex(int[] arr, int target) {
		int ans = -1;
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return ans;
	}
}
