package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramToSplitArrayExample2 {
	/*
	 * Method 2 : Here we will use to for loop. First loop run form 0 to position
	 * and Second loop run from 0 to arr.length - position. We will create two
	 * arrays two store these two position;
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int n = arr.length;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a position :: ");
		int position = sc.nextInt();

		if (position > 0 && position < n) {
			int[] aa = new int[position];
			int[] bb = new int[n - position];

			for (int i = 0; i < position; i++) {
				aa[i] = arr[i];
			}

			for (int i = 0; i < n - position; i++) {
				bb[i] = arr[i + position];
			}
			// Here you can also use for or forEach loops to print array.

			System.out.println("First split array is :: " + Arrays.toString(aa));
			System.out.println("Second split array is :: " + Arrays.toString(bb));

		} else {
			System.out.println("Entered invalid position :: " + position);
		}

		sc.close();
	}
}
