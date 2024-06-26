package recursion;

public class FindTargetUsingLinearSearchWithRecursion {

	/*
	 * perform Linear search using Recursion.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 8, 11, 15 };
		int target = 15;

		boolean flag = findTarget(arr, target, 0);
		System.out.println(flag);

		int index = findIndex(arr, target, 0);
		System.out.println(index);

		int indexFromLast = findIndexFromLast(arr, target, arr.length - 1);
		System.out.println(indexFromLast);
	}

	static boolean findTarget(int[] arr, int target, int index) {
		if (index == arr.length)
			return false;

		return arr[index] == target || findTarget(arr, target, index + 1);
	}

	static int findIndex(int[] arr, int target, int index) {
		if (index == arr.length)
			return -1;

		if (arr[index] == target) {
			return index;
		}

		return findIndex(arr, target, index + 1);
	}

	static int findIndexFromLast(int[] arr, int target, int index) {
		if (index == -1)
			return -1;

		if (arr[index] == target) {
			return index;
		}

		return findIndexFromLast(arr, target, index - 1);
	}
}
