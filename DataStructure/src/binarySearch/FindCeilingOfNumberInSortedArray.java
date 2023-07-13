package binarySearch;

public class FindCeilingOfNumberInSortedArray {
	/*
	 * Here we need to find out ceiling of number in sorted array. ceiling means
	 * smallest number in array which is greater than or equal to target element.
	 * Solution :: when condition break the while loop it means start > end, here
	 * start is the ceiling number because it is greater to target.
	 */

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 9, 14, 16, 18 };
		int target = 15;
		int result = ceilingNumber(arr, target);
		System.out.println("ceiling number of target is :: " + result);
	}

	public static int ceilingNumber(int[] arr, int target) {
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

		/*
		 * if you want to return index then simple return start, otherwise return
		 * arr[start]. Hence you will get actual number.
		 * 
		 */
		int result = arr[start];

		return result;
	}
}
