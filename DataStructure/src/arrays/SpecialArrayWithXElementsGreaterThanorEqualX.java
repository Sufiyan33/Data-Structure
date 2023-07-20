package arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
	/*
	 * 1608. Special Array With X Elements Greater Than or Equal X
	 */
	public static void main(String[] args) {
		int[] nums = { 3, 5 };
		int result = specialArray(nums);
		System.out.println(result);
	}

	public static int specialArray(int[] nums) {
		for (int i = 1; i <= nums.length; i++) {
			int count = 0;
			for (int element : nums) {
				if (element >= i) {
					count++;
				}
			}
			if (count == i) {
				return i;
			}
		}
		return -1;
	}
}
