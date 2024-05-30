package recursion;

public class PrintNumber {

	public static void main(String[] args) {
		int n = 5;
		print(n);
		System.out.println("-------------------");
		printN(n);
	}

	static void print(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		print(n - 1);
	}

	static void printN(int n) {
		if (n == 0) {
			return;
		}

		printN(n - 1);
		System.out.println(n);
	}
}
