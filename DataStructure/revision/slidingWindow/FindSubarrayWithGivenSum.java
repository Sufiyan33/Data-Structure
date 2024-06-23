package slidingWindow;

public class FindSubarrayWithGivenSum {

	/*
	 * Find subArray with given sum. Let's try first brutte force then will apply
	 * pattern 2 approach.
	 */

	public static void main(String[] args) {
		/*
		 * int arr[] = { 1, 4, 20, 3, 10, 5 }; int sum = 33;
		 */

		/*
		 * int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; int sum = 23;
		 */

		/*
		 * int arr[] = { 1, 4 }; int sum = 0;
		 */

		int arr[] = { 1, 4, 0, 0, 3, 10, 5 };
		int sum = 7;

		subarray(arr, sum);
		System.out.println("----------------------");

		int res = findSubArray(arr, sum);
		System.out.println(res);
	}

	// Brute force approach.
	public static void subarray(int[] arr, int sum) {
		
		if(arr.length == 0)
			return;
		
		for (int i = 0; i < arr.length; i++) {
			int currentSum = arr[i];
			
			if(currentSum == sum) {
				System.out.println("Sum is found at index  " + i);
				return;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					currentSum += arr[j];

					if (currentSum == sum) {
						System.out.println("Sum is found between index " + i + " & " + j);
						return;
					}
				}
			}
		}
	}

	// Optimal Solution
	public static int findSubArray(int[] arr, int sum) {
		int l = 0, r = 0;
		int currentSum = 0;

		while (r < arr.length) {
			currentSum += arr[r];

			while (currentSum > sum) {
				currentSum -= arr[l];
				l = l + 1;
			}

			if (currentSum == sum) {
				System.out.println("Find given some in between : " + l + " & " + r);
				return 1;
			}
			r = r + 1;
		}

		System.out.println("No subArray is found...");
		return 0;
	}
}
