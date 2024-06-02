package recursion;

public class SumOfDigit {

	// need to fix
	public static void main(String[] args) {
		int num = 45771;

		int sum = digitSum(num);
		System.out.println(sum);
	}

	static int digitSum(int n) {
		if (n == 0) {
			return 0;
		}

		return (n % 10) + digitSum(n / 10);
	}
}
