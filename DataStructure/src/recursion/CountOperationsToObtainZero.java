package recursion;

public class CountOperationsToObtainZero {
	/*
	 * 2169. Count Operations to Obtain Zero
	 */
	// Approach :
	/*
	 * In one operation, if num1 >= num2, you must subtract num2 from num1,
	 * otherwise subtract num1 from num2.
	 * 
	 * For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus
	 * obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one
	 * operation, num1 = 4 and num2 = 1. Return the number of operations required to
	 * make either num1 = 0 or num2 = 0.
	 */

	public static int countOperations(int num1, int num2) {
		return helper(num1, num2, 0);
	}

	public static int helper(int num1, int num2, int countSteps) {
		if (num1 == 0 || num2 == 0) {
			return countSteps;
		}

		if (num1 >= num2) {
			return helper(num1 - num2, num2, countSteps + 1);
		}
		return helper(num1, num2 - num1, countSteps + 1);
	}

	public static void main(String[] args) {
		int count = countOperations(5, 2);
		System.out.println("Count Operations are := " + count);
	}
}
