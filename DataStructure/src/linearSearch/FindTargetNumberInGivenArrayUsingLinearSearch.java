package linearSearch;

public class FindTargetNumberInGivenArrayUsingLinearSearch {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, 2, -3, 8, 9, 19, 16, -11, 8 };
		int target = 19;
		int result = linearSearch(arr, target);
		System.out.println("target found on location :: " + result);
	}

	static int linearSearch(int[] arr, int target) {
		/*
		 * for (int aa : arr) { if (target == aa) { return aa; } }
		 */

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
