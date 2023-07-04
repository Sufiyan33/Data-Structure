package arrays;

import java.util.Arrays;

public class FlattenANestedArray {

	/*
	 * This program need to fix. its working for first half of an array and not for
	 * the entire array.
	 */
	public static void main(String[] args) {
		Object[] arr = { 1, 2, new Object[] { 4, new int[] { 5, 6 }, 7 }, 10 };
		System.out.println("Array size is :: " + arr.length);
		String deepString = Arrays.deepToString(arr);

		// String replacedString = deepString.replace("[", "").replace("]", "");
		String replacedString = deepString.replaceAll("[(\\[|\\])]", "");
		String[] splits = replacedString.split(",");

		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = Integer.parseInt(splits[i].trim());
		}

		System.out.println(Arrays.toString(temp));

	}
}
