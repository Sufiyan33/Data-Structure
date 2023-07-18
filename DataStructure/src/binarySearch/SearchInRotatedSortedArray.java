package binarySearch;

public class SearchInRotatedSortedArray {
	/*
	 * 33. Search in Rotated Sorted Array : LeetCode problem.
	 */

	/*
	 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 Input: nums =
	 * [4,5,6,7,0,1,2], target = 3 Output: -1 Input: nums = [1], target = 0 Output:
	 * -1
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int result = searchinRotatedSortedArray(arr, target);
		System.out.println("search in sorted rotated array is :: " + result);
	}

	public static int searchinRotatedSortedArray(int[] arr, int target) {

		int pivot = findPivot(arr);
		System.out.println("Index of pivot is :: " + pivot);

		// if you did not find. It means array is not rotated.
		if (pivot == -1) {
			// just do the normal binarySearch.
			return binarySearch(arr, target, 0, arr.length - 1);
		}

		/*
		 * if you is found then there are 3 cases. it means you have found 2 asc array.
		 * case : 1 if pivot == target case : 2 if pivot > target case : 3 if pivot <
		 * target
		 */
		if (arr[pivot] == target) {
			return pivot;
		}
		if (target >= arr[0]) {
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

	public static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		// here 4 cases are there
		while (start < end) {
			int mid = start + (end - start) / 2;

			/*
			 * Case 1: if mid < end and arr[mid] > arr[mid+1], may be the mid is pivot.
			 * hence return the mid;
			 */
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			/*
			 * Case 2 : If above is not the case then might be pivot would previous element
			 * of mid. hence return mid-1;
			 */
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			/*
			 * Case 3: may be start is pivot right. hence check ar[start]>= arr[mid]. if
			 * yes, then you need to search in left. Hence end would be updated.
			 * 
			 * Case 4: may be end is pivot. So check if arr[mid]>= arr[end]. if yes then
			 * need to update start.
			 */
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
