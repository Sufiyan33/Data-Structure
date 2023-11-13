package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElementInASortedMatrix {
	/*
	 * 378. Kth Smallest Element in a Sorted Matrix
	 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8; // Output: 13
		int kthSmallest = kthSmallest(matrix, k);
		System.out.println(kthSmallest);
	}

	public static int kthSmallest(int[][] matrix, int k) {
		List<Integer> list = convertMatrixIntoList(matrix);
		int[] arr = new int[list.size()];

		int j = 0;
		for (Integer aa : list) {
			arr[j++] = aa;
		}

		Arrays.sort(arr);
		return arr[k];
	}

	public static List<Integer> convertMatrixIntoList(int[][] arr) {
		List<Integer> list = new ArrayList<>();

		for (int[] row : arr) {
			for (int col : row) {
				list.add(col);
			}
		}
		return list;
	}
}
