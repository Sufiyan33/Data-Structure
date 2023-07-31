package recursion;

public class PrintNumberUsingRecursion {
	/*
	 * Print number 1 to 5 using recursion.
	 */
	public static void main(String[] args) {
		print(1);
	}

	static void print(int n) {
		// Here, define base condition here So that recursive call break here.
		if (n == 5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n + 1);
	}
}
