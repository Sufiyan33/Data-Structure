package recursion;

public class CheckArrayIsSorted {
	/*
	 * Check given array sorted or not using Recursion.
	 */
	// Approach
	/*
	 * Step 1 : check from index 0 and till the last element. If index will go out
	 * of the array then it will give you ArrayIndexOutOfBoundException. Hence to
	 * avoid check weather it is == arr.length-1;
	 * 
	 * Step 2 : to check array is sorted add if arr[index]< arr[index + 1] and do
	 * the recursive call.
	 */
	static boolean sorted(int[] arr, int index) {
		if (index == arr.length - 1)
			return true;

		return arr[index] < arr[index + 1] && sorted(arr, index + 1);
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr = { 1, 2, 3, 6, 5 };
		System.out.println("Array is sorted := " + sorted(arr, 0));

	}
}
