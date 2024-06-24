package slidingWindow;

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
}
