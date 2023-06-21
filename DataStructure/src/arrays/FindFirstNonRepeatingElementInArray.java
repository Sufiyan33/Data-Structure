package arrays;

import java.util.HashMap;

public class FindFirstNonRepeatingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 9, 4, 9, 6, 7, 4 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (int aa : arr) {
			if (map.get(aa) == 1) {
				System.out.println(aa);
				break;
			}
		}
	}
}
