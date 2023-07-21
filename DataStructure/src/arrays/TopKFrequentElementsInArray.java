package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class TopKFrequentElementsInArray {
	/*
	 * Find k most frequent number from array.
	 */
	// Approach
	/*
	 * 1 - create a HashMap and iterate array and insert in map while counting
	 * frequency of each element; 2- now create a new temp array and a index
	 * variable. 3- Start a loop from 0 to till k and inside this iterate map using
	 * forEach or iterator. 4- check if itr.getValue > count, then store value in
	 * count and key in max variable. 5- now map.put(max, 0); 6- add this max value
	 * in temp and return this array.
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		/*
		 * int[] arr = { 1 }; int k = 1;
		 */
		int[] topKelement = topKFrequent(arr, k);
		System.out.println(Arrays.toString(topKelement));
	}

	public static int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int aa : nums) {
			if (map.containsKey(aa)) {
				int count = map.get(aa);
				count++;
				map.put(aa, count);
			} else {
				map.put(aa, 1);
			}
		}

		// now create a new array and start for loop 0 to till k and iterate it.
		int[] temp = new int[k];
		int index = 0;
		for (int i = 0; i < k; i++) {
			int count = 0;
			int max = 0;

			// now iterate map to fetch Key and value, data.
			for (Entry<Integer, Integer> itr : map.entrySet()) {
				// check here, if value > count then store value in count.
				if (itr.getValue() > count) {
					count = itr.getValue();
					max = itr.getKey();
				}
			}
			System.out.println("max id :: " + max);
			map.put(max, 0);
			temp[index] = max;
			index++;
		}

		return temp;
	}
}
