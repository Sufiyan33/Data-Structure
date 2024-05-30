package patterns;

public class Pattern2 {

	public static void main(String[] args) {

		int n = 5;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
