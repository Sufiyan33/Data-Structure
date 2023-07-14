package binarySearch;

import java.util.Arrays;

public class FindFirstAndLastIndexOfTargetElementInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 7, 7, 8, 8, 9 };
		int target = 7;
		int[] index = lastAndFirstIndex(arr, target);
		System.out.println(Arrays.toString(index));
	}

	public static int[] lastAndFirstIndex(int[] arr, int target) {
		int[] index = { -1, -1 };

		int start = findNumber(arr, target, true);
		int last = findNumber(arr, target, false);

		index[0] = start;
		index[1] = last;

		return index;
	}

	public static int findNumber(int[] arr, int target, boolean findStartIndex) {
		int start = 0, end = arr.length - 1;
		int index = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				index = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return index;
	}
}
