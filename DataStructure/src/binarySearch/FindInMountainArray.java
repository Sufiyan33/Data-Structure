package binarySearch;

public class FindInMountainArray {
	/*
	 * 1095. Find in Mountain Array. Step 1: Find a peak element index; Step 2: Now
	 * ApplyBinarSearch in ascending array => (0 to peak). Step 3: Again apply BN in
	 * descending array => (peak+1, arr.length-1); Note :: step 2 and 3 are example
	 * of orderAgnostic Array.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		int peak = findPeakIndex(arr);
		int firstIndex = orderAgnosticBS(arr, target, 0, peak);

		if (firstIndex != -1) {
			System.out.println("first index is :: " + firstIndex);
		}
		int secondIndex = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
		System.out.println("Second index :: " + secondIndex);
	}

	public static int findPeakIndex(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return -1;
	}
}
