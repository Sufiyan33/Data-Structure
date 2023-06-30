package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramToSplitArrayExample3 {

	/*
	 * Here we will run only one loop 0 to arr.length and will check in condition
	 * that if index > position then store element in new array. And if
	 * index<position or position>index then store element in new array
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int n = arr.length;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a position :: ");
		int position = sc.nextInt();

		if (position > 0 && position < n) {
			int[] aa = new int[position];
			int[] bb = new int[n - position];

			for (int i = 0; i < n; i++) {
				if (i > position) {
					aa[i] = arr[i];
				} else {
					bb[position - i] = arr[i];
				}
			}
			System.out.println("First split array is :: " + Arrays.toString(aa));
			System.out.println("Second split array is :: " + Arrays.toString(bb));
		} else {
			System.out.println("Entered invalide position :: " + position);
		}
		sc.close();
	}
	/*
	 * this program is giving me Exception at line 28
	 * java.lang.ArrayIndexOutOfBoundsException:, I need to fix this. I will fix
	 * later.
	 */
}
