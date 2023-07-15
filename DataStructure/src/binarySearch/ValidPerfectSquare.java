package binarySearch;

public class ValidPerfectSquare {
	/*
	 * 367. Valid Perfect Square leetCode problem.
	 */
	public static void main(String[] args) {
		int num = 1;
		boolean res = findNumber(num);
		System.out.println("result is :: " + res);
	}

	public static boolean findNumber(int num) {
		int start = 1, end = num;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (num > mid * mid) {
				start = mid + 1;
			} else if (num < mid * mid) {
				end = mid - 1;
			} else if (mid * mid == num) {
				return true;
			}
		}
		return false;
	}
}
