package binarySearch;

public class ArrangingCoinsSimpleApproach {
	/*
	 * 441. Arranging Coins
	 */
	// Approach
	/*
	 * 1- initialize a variable let say i; 2- check if we used all coins. 3-
	 * increase row because using more coins will lead more rows. 4- now reduce the
	 * coin by using n = n - row. 5- return last 2nd row because last array will be
	 * incomplete.
	 */
	public static void main(String[] args) {
		int n = 8;
		int numberOfStairs = arrangeCoins(n);
		System.out.println("made rows are  :: " + numberOfStairs);
	}

	public static int arrangeCoins(int n) {

		int row = 1;
		while (n > 0) {
			row++;
			n = n - row;
		}
		return row - 1;
	}
}
