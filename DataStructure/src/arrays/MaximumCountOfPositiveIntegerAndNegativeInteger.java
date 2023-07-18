package arrays;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

	public static void main(String[] args) {
		// int[] nums = { -3, -2, -1, 0, 0, 1, 2 };
		int[] nums = { -3, -2, -1, 1, 2, 3 };
		int result = maximumCount(nums);
		System.out.println("count is :: " + result);
	}

	public static int maximumCount(int[] nums) {
		int posCount = 0;
		int negCount = 0;
		for (int num : nums) {
			if (num > 0 && num != 0) {
				posCount++;
			} else if (num < 0) {
				negCount++;
			}
		}
		return posCount > negCount ? posCount : negCount;
	}
}
