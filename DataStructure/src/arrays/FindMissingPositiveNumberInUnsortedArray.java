package arrays;

import java.util.HashMap;

public class FindMissingPositiveNumberInUnsortedArray {
	/*
	 * since one element is missing it means size of array is n+1; 1- run the for
	 * loop i =0 to n and insert all element in map. 2- run another loop i = 1, to
	 * n+1, to search all positive number. 3- If any number is not present in the
	 * map then return index, otherwise continue for iteration
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9, 12, 15 };
		int missingNumber = firstMissingPositive(arr);
		System.out.println("Missing positive number is :: " + missingNumber);
	}

	public static int firstMissingPositive(int[] arr) {
		int n = arr.length;
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(arr[i], true);
		}

		for (int i = 1; i <= n + 1; i++) {
			if (!map.containsKey(i)) {
				return i;
			}
		}
		return -1;
	}
}
