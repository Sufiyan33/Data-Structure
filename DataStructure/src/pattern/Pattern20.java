package pattern;

public class Pattern20 {
	/*
	 * Print Square Pattern.
	 */
	// Approach.
	/*
	 * Step 1 : identify that how many rows are there so that outer loop will run at
	 * same time.
	 * 
	 * Step 2 : Find out that how many columns are there, inner loop will run for
	 * the same.
	 * 
	 * Step 3 : Here we need to find out the minimum distance. for example lets
	 * consider 4, So for 4 check distance from left is 4 column and from right it
	 * is also same 4 column. Now check from up it is also taking 4 rows to reach at
	 * 4 and same from down also. Hence here I am trying to find out minimum
	 * distance.
	 */

	/*
	 * 0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 0 
0 1 2 2 2 2 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 3 4 3 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 2 2 2 2 1 0 
0 1 1 1 1 1 1 1 0 
0 0 0 0 0 0 0 0 0
	 */
	public static void main(String[] args) {
		int n = 4;
		pattern20(n);
	}

	public static void pattern20(int n) {
		n = 2 * n;
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}
}
