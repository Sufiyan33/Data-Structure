package slidingWindow;

public class MaxConsecutiveOnes {

	/*
	 * Max Consecutive Ones 111.
	 * 
	 * OR Find Longest subArray of consecutive 111 where k = 2. means you can count
	 * or take subArray till two zero if 4rd came then shrink window size and check
	 * others.
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;

		System.out.println(subArray(arr, k));
	}

	// Brute force Approach - TC = O(N*N)
	public static int subArray(int[] arr, int k) {
		if (arr.length == 0) {
			return -1;
		}

		int maxLen = 0;

		for (int i = 0; i < arr.length; i++) {
			int zero = 0;

			for (int j = i; j < arr.length; j++) {

				if (arr[j] == 0) {
					zero++;
				}

				if (zero <= k) {
					int len = j - i + 1;
					maxLen = Math.max(maxLen, len);
				} else {
					break;
				}
			}
		}
		return maxLen;
	}
}
