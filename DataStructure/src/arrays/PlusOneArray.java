package arrays;

import java.util.Arrays;

public class PlusOneArray {
	/*
	 * We have to add 1 in last element and return the array;
	 */
	// Approach.
	/*
	 * 1- iterate from last to start. 2- And check if arr[i] < 9 if element is less
	 * than 9 then simply add 1 and return array. 3- if last number is 9 or all
	 * element is 9 then in this case need to increase the length of size. 4- in
	 * this case assign 0 to current value and add 1 to previous value or in array.
	 */
	public static void main(String[] args) {
		// int[] arr = { 6, 3, 8, 2 };
		// int[] arr = { 6, 3, 8, 9 };
		// int[] arr = { 9, 9 };
		int[] arr = { 9 };
		int[] plusOne = plusOne(arr);
		System.out.println(Arrays.toString(plusOne));

	}

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		// create a new array if all element in array are 9.
		int[] temp = new int[digits.length + 1];
		temp[0] = 1;
		return temp;
	}
}
