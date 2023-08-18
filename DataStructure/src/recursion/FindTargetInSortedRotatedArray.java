package recursion;

public class FindTargetInSortedRotatedArray {
	/*
	 * Find target in sorted rotated array using Recursion.
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 1, 2 };
		int target = 11;
		System.out.println("Target find at index =: " + search(arr, target, 0, arr.length - 1));
	}

	static int search(int[] arr, int target, int start, int end) {
		// Case 1 :
		if (start > end)
			return -1;

		int mid = start + (end - start) / 2;

		// Case 2 :
		if (target == arr[mid])
			return mid;

		// Case 3 :
		if (arr[start] <= arr[mid]) {
			// Case 3.1 :
			if (target >= arr[start] && target <= arr[mid]) {
				return search(arr, target, start, mid - 1);
			} else {
				// Case 3.2 :
				return search(arr, target, mid + 1, end);
			}
		}

		// Case 4.1 :
		if (target >= arr[mid] && target <= arr[end]) {
			return search(arr, target, mid + 1, end);
		}

		// Case 4.2 :
		return search(arr, target, start, mid - 1);
	}
}
