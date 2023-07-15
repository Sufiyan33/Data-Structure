package binarySearch;

public class FindPeakIndexInMoutainArray {

	/*
	 * Mountain array is the array where number sorted in ascending and descending
	 * both. Step 1: if find the mid and compare if mid > mid+1 means you are
	 * searching in decreasing array but may be your peak is in left side. Hence
	 * search in left side and for this end = mid; Step 2: if mid < mid + 1 then you
	 * are increasing part of array but may be peak is in right.Hence search in
	 * right as well and for this start = mid + 1; step 3: Now in somewhere may be
	 * you start == end. Hence in this case start while loop from(start<end) and
	 * return either end or start.
	 */
	public static void main(String[] args) {
		// int[] arr = { 0, 1, 0 };
		// int[] arr = { 0, 2, 1, 0 };
		int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2 };
		int peakNumber = findPeak(arr);
		System.out.println("Peak number index is :: " + peakNumber);
	}

	public static int findPeak(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		// here you can return start or end as well as.
		return start;
	}
}
