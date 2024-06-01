package recursion;

public class RotatedBinarySearch {

	/*
	 * Here, we will find target element in rotated binary search.
	 */
	public static void main(String[] args) {
		int[] arr = {};
		int target = 9;

		int findTarget = findTarget(arr, target, 0, arr.length - 1);
		System.out.println(findTarget);
	}

	static int findTarget(int[] arr, int target, int start, int end) {
		if (start > end)
			return -1;

		int mid = start + (end - start) / 2;
		if (arr[mid] == target)
			return mid;

		/*
		 * Case 1 : if target is lying in first half & arr[start] <= arr[end] means
		 * first half is already sorted.
		 */

		if (arr[start] <= arr[mid]) {
			if (target >= arr[start] && target <= arr[mid]) {
				return findTarget(arr, target, start, mid - 1);
			} else {
				return findTarget(arr, target, mid + 1, end);
			}
		}
		// Case 2 : if above is not the case it means target is 2nd half.
		if (target >= arr[mid] && target <= arr[end]) {
			return findTarget(arr, target, mid + 1, end);
		}

		return findTarget(arr, target, start, mid - 1);
	}
}
