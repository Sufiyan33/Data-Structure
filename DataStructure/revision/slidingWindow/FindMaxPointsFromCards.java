package slidingWindow;

public class FindMaxPointsFromCards {

	/*
	 * Various types of card is given in array. Find maximum sum of points you can
	 * obtain from array where k = 4.
	 * 
	 * Means you can take 4 cards at a time either from left or right consecutive.
	 * 
	 * You can pick 1 left and 3 from right or 2 left and 2 from right or vice
	 * versa.
	 */

	public static int maxPoints(int[] arr, int k) {

		if (arr.length == 0) {
			return -1;
		}

		int lSum = 0, rSum = 0, maxSum = 0;

		for (int i = 0; i < k; i++) {
			lSum = lSum + arr[i];
			maxSum = lSum;
		}


		int rIndex = arr.length - 1;

		for (int i = k - 1; i >= 0; i--) {
			lSum = lSum - arr[i];
			rSum = rSum + arr[rIndex];
			rIndex = rIndex - 1;

			maxSum = Math.max(maxSum, (lSum + rSum));
		}

		return maxSum;
	}

	public static void main(String[] args) {

		// int[] arr = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
		// int k = 4;
		int[] arr = { 1, 2, 3, 4, 5, 6, 1 };
		int k = 3;

		int result = maxPoints(arr, k);
		System.out.println("Maxpoints from array is :: " + result);
	}
}
