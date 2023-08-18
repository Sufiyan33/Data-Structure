package recursion;

public class BasicConcept {
	/*
	 * Check basic concept of Recursion.
	 */
	static void fun(int num) {
		if (num == 0)
			return;
		System.out.println(num);
		// fun(num--); // it will take you in infinite loops.
		fun(--num);

	}

	public static void main(String[] args) {
		fun(5);
	}
}
