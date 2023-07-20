package binarySearch;

public class ArrangingCoins {
	/*
	 * 441. Arranging Coins
	 */
	// Approach
	/*
	 * 1- here n coins are given and based on that we have to find number of rows.
	 * 2- start would be 0 and end would be n-1; 3- Find mid using start and end. 4-
	 * define lower and upper bound in while condition. 5- Apply simple binary
	 * search.
	 */
	public static void main(String[] args) {
		int n = 3;
		int numberOfStairs = arrangeCoins(n);
		System.out.println("made rows are  :: " + numberOfStairs);
	}

	public static int arrangeCoins(int n) {
		int ans = 0;
		int rStart = 1;
		int rEnd = n;

		while (rStart <= rEnd) {
			int mid = rStart + (rEnd - rStart) / 2;

			if ((mid * (mid + 1)) / 2 <= n) {
				ans = mid;
				rStart = mid + 1;
			} else {
				rEnd = mid - 1;
			}
		}
		return ans;
	}
}
