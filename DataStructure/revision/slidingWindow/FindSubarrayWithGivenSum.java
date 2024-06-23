package slidingWindow;

public class FindSubarrayWithGivenSum {

	/*
	 * Find subArray with given sum. Let's try first brutte force then will apply
	 * pattern 2 approach.
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;

		subarray(arr, sum);
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
}
