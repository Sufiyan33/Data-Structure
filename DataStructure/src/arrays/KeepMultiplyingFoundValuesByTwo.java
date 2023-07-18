package arrays;

public class KeepMultiplyingFoundValuesByTwo {

	/*
	 * 2154 : Keep Multiplying Found Values by Two.
	 */
	public static void main(String[] args) {
		int[] nums = { 5, 3, 6, 1, 12 };
		int original = 3;
		// int[] nums = { 2, 7, 9 };
		// int original = 4;

		int number = findFinalValue(nums, original);
		System.out.println(number);
	}

	public static int findFinalValue(int[] arr, int original) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == original) {
				original = 2 * original;
				return findFinalValue(arr, original);
			}
		}
		return original;
	}
}
