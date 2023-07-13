package binarySearch;

public class FindFloorOfANumber {
	/*
	 * FLOOR :: means greatest number which is smaller or equal to target number.
	 * when condition break the while loop it means start > end, hence in this case
	 * end would be the floor number which is smaller or equal to target number.
	 * Leetcode problem.
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 9, 14, 16, 18 };
		int target = 15;
		int result = floorNumber(arr, target);
		System.out.println("floor number of target is :: " + result);
	}

	public static int floorNumber(int[] arr, int target) {
		int start = 0, end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		/*
		 * if you want return index then simply return end, otherwise rerturn arr[end];
		 */

		int floor = arr[end];
		return floor;
	}
}
