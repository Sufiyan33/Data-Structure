package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramToSplitArraysInChunksExample4 {

	public static void main(String[] args) {
		Object[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Object[]> splitArray = splitArray(arr, 3);
		for (Object[] aa : splitArray) {
			System.out.println(Arrays.toString(aa));
		}
	}

	public static List<Object[]> splitArray(Object[] arr, int splitSize) {
		int numberOfArrays = arr.length / splitSize;
		int reminder = arr.length % splitSize;

		int start = 0;
		int end = 0;

		List<Object[]> list = new ArrayList<>();
		for (int i = 0; i < numberOfArrays; i++) {
			end = end + splitSize;
			list.add(Arrays.copyOfRange(arr, start, end));
			start = end;
		}

		if (reminder > 0) {
			list.add(Arrays.copyOfRange(arr, start, (start + reminder)));
		}

		return list;
	}
}
