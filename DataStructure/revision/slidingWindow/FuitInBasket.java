package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FuitInBasket {

	/*
	 * Find Fruit into basket - Means max length subArray with at most two types of
	 * numbers.
	 * 
	 * Means you can pick one type of fruit in one bucket and 2nd in other one....
	 */

	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };

		System.out.println(findLength(arr));

		System.out.println("--------------");

		System.out.println(length(arr));
	}

	/*
	 * Brute force Approach.
	 * 
	 * TC - O(n*n), SC - o(3) because used set.
	 */

	public static int findLength(int[] arr) {
		
		int maxLen = 0;
		
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> set = new HashSet<>();

			for (int j = i; j < arr.length; j++) {

				set.add(arr[j]);

				if (set.size() <= 2) {
					maxLen = Math.max(maxLen, j - i + 1);
				} else {
					break;
				}
			}
		}
		return maxLen;
	}

	/*
	 * Optimal Solutions. TC - O(N), SC = O(1)
	 */
	public static int length(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int l = 0, r = 0, maxLen = 0;

		while (r < arr.length) {
			int CurrentCount = map.getOrDefault(arr[r], 0);
			map.put(arr[r], CurrentCount + 1);

			if (map.size() > 2) {
				int fruitCount = map.get(arr[l]);
				if (fruitCount == 1) {
					map.remove(arr[l]);
				} else {
					map.put(arr[l], fruitCount - 1);
				}
				l++;
			}

			maxLen = Math.max(maxLen, r - l + 1);
			r++;
		}
		return maxLen;
	}

}
