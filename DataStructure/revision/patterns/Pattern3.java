package patterns;

public class Pattern3 {

	/*
	 * Right triangle but opposite direction
	 */
	public static void main(String[] args) {

		int n = 5;
		for (int row = n; row > 0; row--) {
			for (int col = row; col > 0; col--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
