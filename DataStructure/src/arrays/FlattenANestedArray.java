package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenANestedArray {

	/*
	 * 1- First traverse array, there value would be integer or a list. 2- If this
	 * is a integer then directly add in list. 3- If this is a list then again we
	 * have to iterate list and put all integers in list. 4- This is a recursive
	 * approach. 5- Simply return the list.
	 */
	public static void main(String[] args) {
		Object[] arr = { 1, 2, new Object[] { 3, 4, new Object[] { 5, 6 }, 7 }, 10 };
		Integer[] flattenarr = flattenArray(arr);
		System.out.println(Arrays.toString(flattenarr));
	}

	public static Integer[] flattenArray(Object[] inputArray) {
		if (inputArray == null)
			return null;

		List<Integer> flatList = new ArrayList<>();

		for (Object element : inputArray) {
			if (element instanceof Integer) {
				flatList.add((Integer) element);
			} else if (element instanceof Object[]) {
				flatList.addAll(Arrays.asList(flattenArray((Object[]) element)));
			} else {
				throw new IllegalArgumentException("Input must be a array of integers");
			}
		}

		return flatList.toArray(new Integer[flatList.size()]);

	}
}
