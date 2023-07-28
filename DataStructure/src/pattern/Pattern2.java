package pattern;

public class Pattern2 {
	/*
	 * print right triangle in opposite way.
	 */

	/*
	 * Step 1 : First identify the number of rows.
	 * 
	 * Step 2 : Check, how many columns are there in each row.Here 1st row have n
	 * number of column. 2nd row have n-2 column. 3rd row n-2, 4rth n-3. Hence row
	 * start from n and decrease it.
	 * 
	 * Step 3 : do same above for column.
	 * 
	 * Step 4 : identify what to print and print that element.
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.println("number of rows are =: " + n);
		pattern2(n);
	}

	public static void pattern2(int n) {

		for (int row = n; row > 0; row--) {
			for (int col = row; col > 0; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
