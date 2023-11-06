package arrays;

import java.util.ArrayList;

public class FindLeadersInArray {
	/*
	 * Leaders in an array : GFG.
	 */
	// Need to fix this
	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		ArrayList<Integer> list = leaders(arr, n);
		System.out.println(list);
	}

	static ArrayList<Integer> leaders(int arr[], int n) {
		// Your code here
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
			}
			if (j == n) {
				list.add(arr[i]);
			}
		}
		return list;
	}
}
