package recursion;

public class SumOfNumber {

	public static void main(String[] args) {
		int n = 5;
		int result = sum(n);
		System.out.println(result);
	}

	static int sum(int n) {
		if (n <= 1) {
			return 1;
		}

		return n + sum(n - 1);
	}
}
