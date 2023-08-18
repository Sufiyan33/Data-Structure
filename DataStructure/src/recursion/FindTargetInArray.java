package recursion;

public class FindTargetInArray {
	/*
	 * Find target in given array by using Recursion.
	 */
	static boolean find(int[] arr, int target, int index) {
		if (index == arr.length) {
			return false;
		}
		return arr[index] == target || find(arr, target, index + 1);
	}

	static int findIndex(int[] arr, int target, int index) {

		if (index == arr.length) {
			return -1;
		}

		if (arr[index] == target) {
			return index;
		} else {
			return findIndex(arr, target, index + 1);
		}
	}

	static int findIndexFromLast(int[] arr, int target, int index) {

		if (index == -1) {
			return -1;
		}

		if (arr[index] == target) {
			return index;
		} else {
			return findIndexFromLast(arr, target, index - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 14, 9, 0 };
		int target = 14;
		System.out.println("Find Target is =: " + find(arr, target, 0));

		System.out.println("-----------------------------------");

		int[] arr1 = { 1, 3, 4, 6, 14, 9, 0 };
		int target1 = 19;
		System.out.println("Find Target at index =: " + findIndex(arr1, target1, 0));

		System.out.println("-----------------------------------");

		int[] arr2 = { 1, 3, 4, 6, 14, 9, 0 };
		int target2 = 14;
		System.out.println("Find Target at index =: " + findIndexFromLast(arr2, target2, arr.length - 1));

	}
}
