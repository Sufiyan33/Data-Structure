package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramToSplitArrayExample1 {
	/*
	 * Example 1 is : use in built method of Arrays class and that is
	 * Arrays.copyOfRang() with Scanner class;
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a position to split Array");
		int position = sc.nextInt();

		// create two new arrays
		if (position > 0 && position < n) {
			int[] aa = Arrays.copyOfRange(arr, 0, position);
			int[] bb = Arrays.copyOfRange(arr, position, n);

			// use can use for or ForEach loops to print Array;

			System.out.println("First Array :: " + Arrays.toString(aa));
			System.out.println("Second Array :: " + Arrays.toString(bb));
		} else {
			System.out.println("Entered invalid position :: " + position);
		}

		sc.close();

	}
}
