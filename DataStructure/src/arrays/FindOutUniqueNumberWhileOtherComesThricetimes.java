package arrays;

public class FindOutUniqueNumberWhileOtherComesThricetimes {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 3, 2 };

		int findNumer = findNumber(nums);
		System.out.println(findNumer);
	}

	public static int findNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] != nums[j]) {
					return result = nums[j];
				}
			}
		}
		return result;
	}
}
