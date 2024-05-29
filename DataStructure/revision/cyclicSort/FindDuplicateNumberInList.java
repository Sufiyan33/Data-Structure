package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumberInList {

	public static void main(String[] args) {
		// int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] arr = { 1, 1, 2 };
		// int[] arr = { 1, 4, 3, 4, 2, 3, 4, 5, 5, 7 };

		List<Integer> result = findNumber(arr);
		System.out.println(result);
	}

	static List<Integer> findNumber(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}else {
				i++;
			}
		}

		// Find All duplicate number that are not in correct index.
		List<Integer> list = new ArrayList<>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				list.add(arr[index]);
			}
		}
		return list;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
