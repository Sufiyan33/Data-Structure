package recursion;

public class PrintNtoOne {
	/*
	 * Program to print N to 1 number by using Recursion.
	 */
	public static void main(String[] args) {
		fun(5);
	}

	static void fun(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		fun(n - 1);
	}
}
