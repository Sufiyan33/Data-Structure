package recursion;

public class BinarySearchUsingRecursion {

	/*
	 * Here we will use recursion technique to find out a target in array.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 23, 56, 66, 78, 89 };
		int target = 11;
		int targetIndex = search(arr, target, 0, arr.length - 1);
		System.out.println("Found target index is := " + targetIndex);
	}

	public static int search(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if (arr[mid] == target)
			return mid;

		if (target > arr[mid])
			return search(arr, target, mid + 1, end);

		return search(arr, target, start, mid - 1);
	}
}
