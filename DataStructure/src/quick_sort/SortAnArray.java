package quick_sort;

import java.util.Arrays;

public class SortAnArray {
	/*
	 * Sort an array using Quick Sort (In-place).
	 */
	// Approach
	/*
	 * Step 1 : Define base conditions so that recursive call gets terminate. The
	 * condition would be when low mean initial value >= to end elements.
	 * 
	 * Step 2 : Define some variables like start, end, mid (find), pivot.
	 * 
	 * Step 3 : There may be various ways to find pivot. You can take middle element
	 * as pivot or last element or whatever you want.
	 * 
	 * Step 4 : Now, we found the pivot, the main thing is to place pivot is in
	 * correct position. Take two pointer start and last, start checking from start
	 * to end
	 * 
	 * Tips :
	 * 
	 * 1- All the left side elements should be less than Pivot means array[start] <
	 * pivot.
	 * 
	 * 2- All the right side elements should be greater than Pivot elements
	 * array[end] > pivot.
	 * 
	 * Step 5 : Follow the above conditions whenever condition violates just swap
	 * the number increase pointer start++, end--;
	 * 
	 * Step 6 : Till here Pivot has been placed at correct index. Now make recursive
	 * calls to sort these two halves.
	 */

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		quick_sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void quick_sort(int[] arr, int low, int high) {
		if (low >= high)
			return;

		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;

		int pivot = arr[mid];

		// Here, I am trying to put pivot at correct index.
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}

			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			// Now Pivot has been placed at correct index. So sort array.
			quick_sort(arr, low, end);
			quick_sort(arr, start, high);
		}
	}
}
