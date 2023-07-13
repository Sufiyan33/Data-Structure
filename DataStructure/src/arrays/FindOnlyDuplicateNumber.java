package arrays;

public class FindOnlyDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int number = findDuplicate(nums);
		System.out.println("Only Duplicate number is :: " + number);
	}

	public static int findDuplicate(int[] arr) {
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					result = arr[j];
				}
			}
		}
		return result;
	}
}
