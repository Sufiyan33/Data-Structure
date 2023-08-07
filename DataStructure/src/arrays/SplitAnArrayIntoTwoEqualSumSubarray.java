package arrays;

public class SplitAnArrayIntoTwoEqualSumSubarray {

	/*
	 * Split An Array In to Two Equal Sum SubArray.
	 */
	// Approach.
	/*
	 * Step 1 : run two loop for i and j.
	 * 
	 * Step 2 : run 1st loop and calculate array sum and store in leftSum.
	 * 
	 * Step 3 : run 2nd loop and calculate array sum and store in RightSum.
	 * 
	 * Step 4 : now check if leftSum == RightSum, if yes then split the array i+1;
	 * otherwise not possible to split.
	 */
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5, 5 };
		// Output : { 1 2 3 4 } { 5 , 5 }

		// int arr[] = { 4, 1, 2, 3 };
		// Output : {4 1} {2 3}

		int arr[] = { 4, 3, 2, 1 };
		// Output : Not Possible
		splitArray(arr);
	}

	public static int findSplitPoint(int[] arr) {
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			leftSum += arr[i];

			int rightSum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				rightSum += arr[j];
			}
			// Split point index
			if (leftSum == rightSum) {
				return i + 1;
			}
		}
		// Otherwise not possible to split array into subArrays.
		return -1;
	}

	public static void splitArray(int[] arr) {
		int splitPoint = findSplitPoint(arr);

		if (splitPoint == -1 || splitPoint == arr.length) {
			System.out.println("Not possible to split array");
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (splitPoint == i)
				System.out.println();

			System.out.print(arr[i] + " ");
		}
	}
}
