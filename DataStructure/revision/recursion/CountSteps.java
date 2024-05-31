package recursion;

public class CountSteps {

	/*
	 * LeetCode question : number of steps to reduce a number zero => 14 == 0 ?
	 */
	public static void main(String[] args) {
		int result = countSteps(1996, 0);
		System.out.println(result);
	}

	static int countSteps(int num, int step) {
		if (num == 0)
			return step;

		if (num % 2 == 0) {
			return countSteps(num / 2, step + 1);
		}
		return countSteps(num - 1, step + 1);
	}
}
