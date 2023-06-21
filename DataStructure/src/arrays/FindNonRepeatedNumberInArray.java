package arrays;

import java.util.HashMap;

public class FindNonRepeatedNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 3, 4, 6, 9 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int aa : arr) {
			map.put(aa, map.getOrDefault(aa, 0) + 1);
		}

		for (int ss : arr) {
			if (map.get(ss) == 1) {
				System.out.print(ss + " ");
			}
		}

		System.out.println("--- Another approach using Map ---");
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i]) + 1);
			} else {
				hmap.put(arr[i], 1);
			}
		}
		for (int aa : arr) {
			if (hmap.containsKey(aa) && hmap.get(aa) == 1) {
				System.out.println(aa);
			}
		}
	}
}
