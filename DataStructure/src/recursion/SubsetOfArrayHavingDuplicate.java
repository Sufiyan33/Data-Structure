package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArrayHavingDuplicate {
	/*
	 * Find subset of an array using Iterative approach while array contain
	 * duplicate element.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> ans = sebSetDuplicate(arr);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}

		System.out.println("----with Duplicate Data -------");
		// int[] arr1 = { 1, 2, 2 };
		int[] arr1 = { 2, 1, 2 };
		List<List<Integer>> ans1 = sebSetDuplicate(arr1);
		for (List<Integer> list : ans1) {
			System.out.println(list);
		}
	}

	static List<List<Integer>> sebSetDuplicate(int[] arr) {
		List<List<Integer>> outer = new ArrayList<>();
		Arrays.sort(arr);

		outer.add(new ArrayList<>());

		int start = 0;
		int end = 0;

		for (int i = 0; i < arr.length; i++) {
			start = 0;
			// if current and previous element are same then start = end + 1;
			if (i > 0 && arr[i] == arr[i - 1]) {
				start = end + 1;
			}
			end = arr.length - 1;

			int n = outer.size();

			for (int j = start; j < n; j++) {
				List<Integer> internal = new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}

}
