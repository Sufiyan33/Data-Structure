package recursion;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int n = 5;
		int fact = factorial(n);
		System.out.println(fact);
	}

	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}
}
