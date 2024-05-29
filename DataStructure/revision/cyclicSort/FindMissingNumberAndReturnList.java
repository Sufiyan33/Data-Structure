package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberAndReturnList {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		// int[] arr = { 1, 1 };

		List<Integer> result = findNumber(arr);

		System.out.println(result);
	}

	static ArrayList<Integer> findNumber(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// Searching missing numbers.
		/*
		 * Here we, know that index = value -1; then we can say value = index + 1;
		 */
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				list.add(index + 1);
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
