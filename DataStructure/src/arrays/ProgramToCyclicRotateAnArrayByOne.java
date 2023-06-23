package arrays;

import java.util.Arrays;

public class ProgramToCyclicRotateAnArrayByOne {
	/*
	 * As we know in cyclic rotation we will bring last element to first and shift
	 * rest in forward direction.
	 */
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		/*
		 * Solution 1: 1) Store last element in a variable say x. 2) Shift all elements
		 * one position ahead. 3) Replace first element of array with x.
		 */

		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = x;
		for (int aa : arr) {
			System.out.println(aa);
		}

		/*
		 * Solution : 2 1-take two variable k -> start, j-> last element. 2-Now start
		 * swapping arr[k] and arr[j] and keep j fixed and i moving towards j. 3-Repeat
		 * till k is not equal to j.
		 */
		int ar[] = new int[] { 1, 2, 3, 4, 5 };
		int k = 0, j = ar.length - 1, temp;
		while (k != j) {
			temp = ar[j];
			ar[j] = ar[k];
			ar[k] = temp;
			k++;
		}
		System.out.println("rotated array is :: " + Arrays.toString(ar));
	}
}
