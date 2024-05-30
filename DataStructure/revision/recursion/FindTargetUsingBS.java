package recursion;

public class FindTargetUsingBS {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 8, 9, 13, 15, 17, 18 };
		int target = 10;

		int num = searchRecursion(arr, target, 0, arr.length);
		System.out.println("Target is found at index : " + num);
	}

	static int searchRecursion(int[] arr, int target, int start, int end) {

		// base condition
		if (start > end)
			return -1;

		// if target is greater than length of array.
		if (target > arr.length)
			return -1;

		int mid = start + (end - start) / 2;

		if (arr[mid] == target)
			return mid;

		if (target > arr[mid])
			return searchRecursion(arr, target, start + 1, end);

		return searchRecursion(arr, target, start, end - 1);
	}
}
