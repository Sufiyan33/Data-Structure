package binarySearch;

public class SearchInRotatedSortedArrayWithDuplicateElement {

	/*
	 * 81. Search in Rotated Sorted Array II (duplicate element array).
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 1, 0, 1, 2 };
		int target = 0;
		int index = searchInRotatedSortedDuplicateArray(arr, target);
		System.out.println("found target index is :: " + index);
	}

	public static int searchInRotatedSortedDuplicateArray(int[] arr, int target) {
		int pivot = findPivotInDuplicateArray(arr);
		// if you did not find pivot then just do normal BS.
		if (pivot == -1) {
			return binarySearch(arr, target, 0, arr.length - 1);
		}
		// if pivot has been found then check for different scenario
		if (arr[pivot] == target)
			return pivot;
		if (arr[pivot] >= arr[0]) {
			return binarySearch(arr, target, 0, pivot - 1);
		}
		return binarySearch(arr, target, pivot + 1, arr.length - 1);
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {

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
		return -1;
	}

	public static int findPivotInDuplicateArray(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			// if start, end and mid are equal then skip start and end
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// but what if start or end is pivot?
				// so check one by one;
				if (start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
				if (end > start && arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
				// so left side is sorted. Hence check pivot in right side.
			} else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}
}
