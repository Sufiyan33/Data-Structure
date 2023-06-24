package linearSearch;

public class FindAnumberInRangeOfArrayByUsingLinearSearch {

	public static void main(String[] args) {
		int arr[] = { 22, 33, 1, 3, 4, -4, 5, -1, -9, 5, 14 };
		int target = 4;

		int location = search(arr, target, 2, 7);
		System.out.println("number found at location is :: " + location);
	}

	static int search(int[] arr, int target, int start, int end) {

		if (arr.length == 0)
			return -1;

		for (int i = start; i <= end; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
