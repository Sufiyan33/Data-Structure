package arrays;

class DeleteElementFromArray {

	/*
	 * In order to delete a number from an array follow below steps : 1 - Find
	 * element or key which you want to delete. if not present then return -1. 2 -
	 * Now delete that founded keys and return some message or return void.
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 13, 14, 5, 6, 3, 7 };
		int key = 5;

		System.out.println("Array size before deleting :: " + arr.length);
		int result = deleteElement(arr, key);
		System.out.println(result);
		System.out.println("Array size After deleting :: " + result);
	}

	static int findElement(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	// Delete element
	static int deleteElement(int arr[], int key) {
		int position = findElement(arr, key);

		if (position == -1) {
			System.out.println("element not found");
			return arr.length;
		}
		for (int i = position; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return arr.length - 1;
	}
}
