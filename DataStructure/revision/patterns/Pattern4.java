package patterns;

public class Pattern4 {

	public static void main(String[] args) {

		int n = 5;

		for (int row = 1; row <= n; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print(row + " ");
			}
			System.out.print("\n");
		}
	}
}
