package pattern;

public class Pattern6 {
	/*
	 * Print diamond pattern.
	 */

	// Approach.
	/*
	 * Step 1 : First identify the number of rows.
	 * 
	 * Step 2 : Check, how many columns are there in each row. Here 1st row has 1
	 * column and 2nd row 2 column and accordingly but at one time column is
	 * decreasing. Hence we have to find the totalColSize. Size n we can write 2 * n
	 * as well.
	 * 
	 * Step 3 : For the above use formula : row > n ? 2*n : row.
	 * 
	 * Step 4 : See here, each column having some spaces. Hence we need to also find
	 * spaces. If you will notice in 1st row space = 5 - 1 = 4 spaces. in 2nd row
	 * space = 5 - 2 = 3 spaces and more. It means that total space = total number -
	 * totalcolSiez. means totalSpace = n - totalColSize.
	 * 
	 * Step 4 : identify what to print and print that element.
	 */
	
	/*
	 *  
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
	 */
	public static void main(String[] args) {
		int n = 5;
		printDiamondPattern(n);
	}

	public static void printDiamondPattern(int n) {
		for (int row = 0; row < 2 * n; row++) {
			int totalColSize = row > n ? 2 * n - row : row;

			// now we have to find out that how many spaces?
			int totalSpaces = n - totalColSize;
			for (int s = 0; s < totalSpaces; s++) {
				System.out.print(" ");
			}

			for (int col = 0; col < totalColSize; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
