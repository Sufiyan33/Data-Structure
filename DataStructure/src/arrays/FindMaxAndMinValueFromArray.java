package arrays;

public class FindMaxAndMinValueFromArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 77, 22, 43, 10, 11, 9 };
		int min = arr[0];
		int max = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min :: " + min + " max :: " + max);
	}
}
