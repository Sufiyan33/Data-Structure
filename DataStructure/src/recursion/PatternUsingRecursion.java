package recursion;

public class PatternUsingRecursion {
	/*
	 * Although we wrote code for printing various Triangle using nested for loop
	 * but here we will try using Recursion.
	 */
	public static void main(String[] args) {
		traingle1(4, 0);
		traingle2(4, 0);
	}

	static void traingle1(int row, int col) {
		if (row == 0)
			return;

		if (col < row) {
			System.out.print("*");
			traingle1(row, col + 1);
		} else {
			System.out.println();
			traingle1(row - 1, 0);
		}
	}

	static void traingle2(int row, int col) {
		if (row == 0)
			return;

		if (col < row) {
			traingle2(row, col + 1);
			System.out.print("*");
		} else {
			traingle2(row - 1, 0);
			System.out.println();
		}
	}
}
