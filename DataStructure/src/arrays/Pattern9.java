package arrays;

public class Pattern9 {
	/*
	 * Program to print Left Triangle.
	 */
	// Approach.
	/*
	 * Step 1 : First Identify that how many rows are there. Run outer loop till
	 * then
	 * 
	 * Step 2 : Now Identify the total number of column. Notice that each column
	 * have some space ex. 1st row has n - row space. means total space = n - row.
	 */
	/*
	 * *
       **
      ***
     ****
    *****
   ******
  *******
 ********
	 */
	public static void main(String[] args) {
		int n = 8;
		pattern9(n);
	}

	public static void pattern9(int n) {
		for (int row = 0; row < n; row++) {
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
