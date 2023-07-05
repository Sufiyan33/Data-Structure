package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flatten2DNestedArray {

	public static void main(String[] args) {
		Object[][] arr = { { 1, 2 }, { 4, 6 }, { 7 }, { 8, 9 }, { 3, 11 } };
		Integer[] flatResult = flattenArray(arr);
		System.out.println(Arrays.toString(flatResult));
	}

	public static Integer[] flattenArray(Object[] inputArray) {

		if (inputArray == null)
			return null;

		List<Integer> flatList = new ArrayList<>();

		for (Object data : inputArray) {
			if (data instanceof Integer) {
				flatList.add((Integer) data);
			} else if (data instanceof Object[]) {
				flatList.addAll(Arrays.asList(flattenArray((Object[]) data)));
			} else {
				throw new IllegalArgumentException("Input must be an array of integer :: ");
			}
		}

		return flatList.toArray(new Integer[flatList.size()]);
	}

}
