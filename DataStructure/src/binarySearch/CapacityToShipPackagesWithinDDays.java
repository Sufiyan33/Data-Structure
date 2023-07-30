package binarySearch;

public class CapacityToShipPackagesWithinDDays {
	/*
	 * 1011. Capacity To Ship Packages Within D Days
	 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
	 */

	// Approach.
	/*
	 * This problem is exactly same to this one :
	 * https://leetcode.com/problems/split-array-largest-sum/
	 */
	public static void main(String[] args) {
		int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int days = 5;// Output: 15

		// int[] weights = { 3, 2, 2, 4, 1, 4 };
		// int days = 3;// Output: 6
		int minimumCapacity = shipWithinDays(weights, days);
		System.out.println("minimum capacity is :: " + minimumCapacity);
	}

	public static int shipWithinDays(int[] weights, int days) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < weights.length; i++) {
			start = Math.max(start, weights[i]);
			end += weights[i];
		}
		while (start < end) {
			int mid = start + (end - start) / 2;
			int sum = 0;
			int packages = 1;

			for (int num : weights) {
				if (sum + num > mid) {
					sum = num;
					packages++;
				} else {
					sum += num;
				}
			}
			if (packages > days) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return end; // here start == end, retrun anyone
	}
}
