package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 5, 6, 7, 8 };
		int[] arr2 = { 4, 9 };
		int[] mergeArrays = mergeArray(arr1, arr2);
		Arrays.sort(mergeArrays);
		System.out.println("merging of two arrays are :: " + Arrays.toString(mergeArrays));
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] temp = new int[arr1.length + arr2.length];
		int k = 0;

		for (int aa : arr1) {
			temp[k++] = aa;
		}

		for (int bb : arr2) {
			temp[k++] = bb;
		}
		return temp;
	}
}
