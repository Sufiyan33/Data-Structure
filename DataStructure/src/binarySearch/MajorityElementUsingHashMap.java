package binarySearch;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementUsingHashMap {
	/*
	 * 169. Majority Element Majority element ?= The majority element is the element
	 * that appears more than ⌊n / 2⌋ times.
	 */
	// Approach
	/*
	 * 1- Create a hasMap 2- Iterate array and add one by one value into map. 3- Now
	 * iterate map using entrySet and for. 4- And check if value is greater than
	 * arr.length/2; if yes then return key of those values;
	 */
	public static void main(String[] args) {
		// int[] nums = { 3, 2, 3 };
		// int[] nums = { 2, 2, 1, 1, 1, 2, 2 }
		int[] nums = { 6, 6, 6, 7, 7 }; // output = 6;
		int number = majorityElement(nums);
		System.out.println("majority element is :: " + number);
	}

	public static int majorityElement(int[] arr) {
		int length = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int aa : arr) {
			map.put(aa, map.getOrDefault(aa, 0) + 1);
		}

		length = length / 2;
		for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
			if (itr.getValue() > length) {
				return itr.getKey();
			}
		}
		return 0;
	}
}
