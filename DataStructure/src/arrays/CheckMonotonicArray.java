package arrays;

public class CheckMonotonicArray {
	/*
	 * If array is increasing or in descending order then it is monotonic array.
	 */
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 2, 3 };
		int[] arr = { 1, 2, 2, 6, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j])
					System.out.println("array is monotonic :: true");
				else
					System.out.println("array is monotonic :: false");
			}
		}
	}
}
