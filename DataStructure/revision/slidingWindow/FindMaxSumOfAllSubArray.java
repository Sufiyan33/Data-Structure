package slidingWindow;

public class FindMaxSumOfAllSubArray {

	public static void main(String[] args) {
		/*
		 * int[] arr = { 100, 200, 300, 400 }; int k = 2;
		 */
		
		/*
		 * int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 }; int k = 4;
		 */

		int arr[] = { 2, 3 };
		int k = 3;

		int result = findSum(arr, k);
		System.out.println(result);
	}

	public static int findSum(int[] arr, int k) {

		if (arr.length <= k) {
			return -1;
		}
		int sum = 0, maxSum = 0;
		
		int l = 0, r = k-1;

		// Calculate first window sum...
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		maxSum = sum;

		// Now expand window and shrink
		while (r < arr.length - 1) {
			sum -= arr[l];
			l++;
			r++;
			sum += arr[r];

			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
}
