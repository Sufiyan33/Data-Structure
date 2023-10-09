package test_knowledge;

public class Recursion {

	int fun(int n) {
		int result;
		if (n == 1) {
			return 1;
		}
		result = fun(n - 1);
		return result;
	}
}
