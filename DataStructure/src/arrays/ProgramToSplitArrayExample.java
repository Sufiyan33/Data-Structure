package arrays;

import java.util.Arrays;

public class ProgramToSplitArrayExample {
	/*
	 * Example 1 is : use in built method of Arrays class and that is
	 * Arrays.copyOfRang();
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int n = arr.length;
		int position = 4;
		int aa[] = new int[position];
		int bb[] = new int[n - position];

		aa = Arrays.copyOfRange(arr, 0, position);
		bb = Arrays.copyOfRange(arr, position, n);

		System.out.println("first array is :: " + Arrays.toString(aa));
		System.out.println("second array is :: " + Arrays.toString(bb));

	}
}
