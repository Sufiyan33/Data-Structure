package binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementAppear3Times {
	/*
	 * 229. Majority Element II
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 2, 3 };
		int[] nums = { 1, 2 };
		List<Integer> majorityElement = majorityElement(nums);
		System.out.println("majority elements are :: " + majorityElement);
	}

	// need to fix this
	public static List<Integer> majorityElement(int[] arr) {
		List<Integer> list = new ArrayList<>();

		int length = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int aa : arr) {
			map.put(aa, map.getOrDefault(aa, 0) + 1);
		}

		length = length / 3;
		for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
			if (itr.getValue() > length) {
				list.add(itr.getKey());
			}
		}
		return list;
	}
}
