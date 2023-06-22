package arrays;

public class FindSubArrayWithGivenSumInArray {
	/*
	 * Use to loop in first loop iterate array and check if currentSum = sum then
	 * print Array otherwise traverse;
	 */
	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 22 }, sum = 23;
		// int arr[] = { 1, 4, 20, 3, 10, 5 }, sum = 33;

		// int arr[] = { 1, 4, 0, 0, 3, 10, 5 }, sum = 7;

		for (int i = 0; i < arr.length; i++) {
			int currentSum = arr[i];
			if (currentSum == sum) {
				System.out.println("sum found at index :: " + i);
				return;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					currentSum += arr[j];
					if (currentSum == sum) {
						System.out.println("sum found at index :: " + i + " " + j);
						return;
					}
				}
			}
		}
		/*
		 * for (int aa : arr) { System.out.println(aa); }
		 */
	}
}
