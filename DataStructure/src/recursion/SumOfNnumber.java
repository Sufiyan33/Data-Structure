package recursion;

public class SumOfNnumber {
	/*
	 * Program to find sum of N numbers.
	 */
	public static void main(String[] args) {
		long sum = sum(10);
		System.out.println("Sum of N number is  " + sum);
	}

	public static long sum(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return (n + sum(n - 1));
	}
}
