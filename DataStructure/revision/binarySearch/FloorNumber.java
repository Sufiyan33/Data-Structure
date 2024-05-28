package binarySearch;

public class FloorNumber {

	/*
	 * Biggest number in array which is smaller or equal to target element. In this case return end.
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 12, 14, 18, 20, 21, 24, 29 };
		int target = 50;

		int num = floorNumber(arr, target);

		if (num != -1) {
			System.out.println("Floor number is : " + num);
		} else {
			System.out.println("number is not found");
		}
	}

	static int floorNumber(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			// boundry condition
			if (arr.length == -1)
				return -1;

			// if target is greater than end then
			if (target >= arr[end])
				return arr[end];

			if (target < arr[start])
				return -1;

			if (arr[mid] == target)
				return arr[mid];

			if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		// when s>e end then return end or array[end].

		return arr[end];
	}
}
