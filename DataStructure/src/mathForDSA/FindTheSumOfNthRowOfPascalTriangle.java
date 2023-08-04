package mathForDSA;

public class FindTheSumOfNthRowOfPascalTriangle {
	/*
	 * Here, we need to find the sum of nth row of Pascal's triangle.
	 */
	public static void main(String[] args) {
		int n = 6;
		int sum = 1 << (n - 1);

		System.out.println("Nth sum of row are := " + sum);
	}
}
