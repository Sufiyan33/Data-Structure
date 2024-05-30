package cyclicSort;

public class FindFristPositiveMissingNumber {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 0 };
		// int[] arr = { 3, 4, -1, 1 };
		// int[] arr = { 7, 8, 9, 11, 12 };
		int[] arr = { 3, 4, 2, 1 };

		int num = missingNumber(arr);
		System.out.println(num);
	}

	static int missingNumber(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			// Checking only for +ve number and number should be greater than N (arr.length)
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// find first missing positive number
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}
		}

		return arr.length + 1;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
