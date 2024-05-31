package recursion;

public class CountZero {

	/*
	 * first take the reminder, if reminder is zero then divide number by 10 and
	 * increase count. if reminder is not zero then divide and check until you not
	 * get. If no zero is found then return count whatever it is.
	 */
	public static void main(String[] args) {
		int result = count(10000, 0);
		System.out.println(result);
	}

	static int count(int n, int count) {
		if (n == 0)
			return count;

		int reminder = n % 10;
		if (reminder == 0)
			return count(n / 10, count + 1);

		return count(n / 10, count);
	}
}
