package pattern;

public class Pattern8 {
	/*
	 * Print number triangle.
	 */
	// Approach.
	/*
	 * Step 1 : First identify the number of rows. Here you can see each row start
	 * from row to 1 and 2 to row. We also need to tackle it.
	 * 
	 * Step 2 : Check, how many columns are there in each row.
	 * 
	 * Step 3 : See here, each column having some spaces. Hence we need to also find
	 * spaces. If you will notice in 1st row space = 5 - 1 row = 4 spaces. in 2nd
	 * row space = 5 - 2 row = 3 spaces and more. It means that total space = total
	 * number - row. means totalSpace = n - row.
	 * 
	 * Step 4 : identify what to print and print that element.
	 */
	
	/*
	 *  1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
	 */
	public static void main(String[] args) {
		int n = 5;
		pattern8(n);
	}

	public static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {

			int totalSpaces = n - row;
			for (int space = 0; space < totalSpaces; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}

			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
