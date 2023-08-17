package recursion;

public class PrintOneToN {
	/*
	 * Program to print One to N number by using Recursion.
	 */
	public static void main(String[] args) {
		fun(5);
	}

	static void fun(int n) {
		if (n == 0) {
			return;
		}
		fun(n - 1);
		System.out.println(n);

	}
}
