package patterns;

public class Pattern6 {

	public static void main(String[] args) {

		int n = 5;

		for (int row = 0; row < n; row++) {

			int totalSpace = n - row;
			for (int space = 0; space < totalSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
