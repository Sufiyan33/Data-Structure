package cyclicSort;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		//int[] arr = { 1, 3, 4, 2, 2 };
		// int[] arr = { 4, 3, 3, 2 };
		// int[] arr = { 3, 1, 3, 4, 2 };
		// int[] arr = { 1, 1 };
		int[] arr = { 1, 1, 2 };
		
		int num = findDuplicate(arr);
		System.out.println(num);
	}

	static int findDuplicate(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;

			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		// Find Duplicate number. index = arr[i]-1; hence arr[i] = index+1;
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return arr[index];
			}
		}
		return arr.length;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
