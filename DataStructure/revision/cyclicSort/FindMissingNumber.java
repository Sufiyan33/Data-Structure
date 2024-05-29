package cyclicSort;

public class FindMissingNumber {

	/*
	 * Here range is from 0 to N. Hence correct index == array[value]
	 */
	public static void main(String[] args) {

		//int arr[] = { 3, 0, 1 };
		
		// int[] arr = { 0, 1 };
		int[] arr = { 1, 0, 3, 2 };

		int num = findNumber(arr);
		System.out.println(num);
	}

	static int findNumber(int[] arr) {

		int i = 0;

		while (i < arr.length) {
			int correctIndex = arr[i];

			if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// Case 1 : Search for first missing number.

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index) {
				return index;
			}
		}

		// Case 2 : if missing number is not in array then return array length;

		return arr.length;
	}

	static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
