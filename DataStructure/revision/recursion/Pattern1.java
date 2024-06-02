package recursion;

public class Pattern1 {

	/*
	 * Print pattern triangle using recursion
	 */
	public static void main(String[] args) {
		triangle(6, 0);
	}

	static void triangle(int row, int col) {

		if (row == 0)
			return;

		if (col < row) {
			System.out.print("*");
			triangle(row, col + 1);
		} else {
			System.out.println();
			triangle(row - 1, 0);
		}
	}
}
