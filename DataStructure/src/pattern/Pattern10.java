package pattern;

public class Pattern10 {
	/*
	 * Print down right angle triangle.
	 */
	// Approach
	/*
	 * Everything would be same as pattern 9 but only difference is here row will
	 * start from end to 0 because we need to print down triangle.
	 */
	
	/*
	 *
 *****
  ****
   ***
    **
     *
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern10(n);
	}

	public static void pattern10(int n) {
		for (int row = n; row >= 0; row--) {
			int totalSpaces = n - row;
			for (int space = 0; space < totalSpaces; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
