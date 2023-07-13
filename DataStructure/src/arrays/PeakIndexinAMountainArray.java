package arrays;

public class PeakIndexinAMountainArray {
	/*
	 * 852. Peak Index in a Mountain Array leetCode problem.
	 */
	public static void main(String[] args) {
		// int[] arr = { 0, 1, 0 };
		// int[] arr = { 0, 2, 1, 0 };
		int[] arr = { 0, 10, 5, 2 };
		// int[] arr = { 3, 4, 5, 1 };

		int peak = peakIndexInMountainArray(arr);
		System.out.println("peak number is :: " + peak);
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					result = i;
				}
			}
		}
		return result;
	}
}
