package pattern;

public class Pattern5 {
	/*
	 * Print pattern having number in increasing order.
	 */
	/*
	 * this is very similar to pattern 1 but only different is here instead of *, we
	 * are printing column number.
	 */
	
	/*
	 * 1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern5(n);
	}

	public static void pattern5(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
