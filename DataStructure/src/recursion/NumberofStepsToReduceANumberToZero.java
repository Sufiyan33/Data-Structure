package recursion;

public class NumberofStepsToReduceANumberToZero {
	/*
	 * 1342. Number of Steps to Reduce a Number to Zero
	 */
	static int findSteps(int num) {
		return helper(num, 0);
	}

	private static int helper(int num, int steps) {
		if (num == 0) {
			return steps;
		}
		if (num % 2 == 0) {
			return helper(num / 2, steps + 1);
		}
		return helper(num - 1, steps + 1);
	}

	public static void main(String[] args) {
		int steps = findSteps(41);
		System.out.println("Minimum number of steps are  := " + steps);
	}
}
