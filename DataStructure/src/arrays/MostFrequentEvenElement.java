package arrays;

import java.util.ArrayList;
import java.util.List;

public class MostFrequentEvenElement {
	/*
	 * 2404. Most Frequent Even Element
	 */
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 4, 4, 1 };
		// int[] nums = { 29, 47, 21, 41, 13, 37, 25, 7 };
		int even = mostFrequentEven(nums);
		System.out.println(even);
	}

	public static int mostFrequentEven(int[] arr) {
		List<Integer> eList = new ArrayList<>();
		List<Integer> oList = new ArrayList<>();

		for (int aa : arr) {
			if (aa % 2 == 0) {
				eList.add(aa);
			} else {
				oList.add(aa);
			}
		}

		// If odd number are there then return -1;
		/*
		 * for (Integer bb : oList) { if (bb % 2 != 0) return -1; }
		 */

		// if element is even then return which appear most.
		for (Integer aa : eList) {
			if (aa > 1) {
				return aa;
			}
		}

		System.out.println(eList);
		// Need to fix this problem
		return 0;
	}
}
