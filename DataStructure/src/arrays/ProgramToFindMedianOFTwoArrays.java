package arrays;

import java.util.Arrays;

public class ProgramToFindMedianOFTwoArrays {

	/*
	 * 1- Create a new temp[arr1.length + arr2.length] and take a variable k to
	 * indicate index of temp array. 2- Simply iterate array one by one and add in
	 * new temp array 3- If you want to sort it then sort array otherwise return it.
	 * 4- Now we have to find median of this newly created array.
	 */
	// Median
	/*
	 * if arr.length is odd then middle element is median. if arr.length is even
	 * then average of middle two element is median.
	 */
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 5, 6, 7, 8 };
		int[] arr2 = { 4, 9, 11 };
		int[] mergeArrays = mergeArray(arr1, arr2);
		Arrays.sort(mergeArrays);
		System.out.println("merging of two arrays are :: " + Arrays.toString(mergeArrays));

		double median = medianOfArray(mergeArrays);
		System.out.println("median of array is :: " + median);
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

	public static double medianOfArray(int[] temp) {
		int length = temp.length;
		System.out.println("length of array is :: " + length);

		if (length % 2 != 0) {
			return temp[length / 2];
		} else {
			return (double) (temp[(length - 1) / 2] + temp[length / 2]) / 2;
		}
	}
}
