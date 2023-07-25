package sorting;

public class FindDuplicateInArrayUsingCycleSort {

	/*
	 * 287. Find the Duplicate Number
	 * https://leetcode.com/problems/find-the-duplicate-number/
	 */
	// you can solve this by using Map but I solve using cycle sort.
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Output: [2,3]
		// int[] nums = { 1, 1, 2 }; // Output: [1]
		// int[] nums = { 1 };// Output: []
		int duplicate = findDuplicate(nums);
		System.out.println("Duplicate number is :: " + duplicate);

	}

	public static int findDuplicate(int[] arr) {
		// Using HashMap
		/*
		 * int result = 0; HashMap<Integer, Integer> map = new HashMap<>(); for (int aa
		 * : arr) { map.put(aa, map.getOrDefault(aa, 0) + 1); } for (int aa : arr) { if
		 * (map.get(aa) > 1) { result = aa; } }
		 * 
		 * return result;
		 */

		// using cycle sort

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// find duplicate element.
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return arr[index];
			}
		}

		return arr.length;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
