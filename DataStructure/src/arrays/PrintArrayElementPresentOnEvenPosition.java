package arrays;

public class PrintArrayElementPresentOnEvenPosition {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 8, 10 };

		for (int aa : arr) {
			if (aa % 2 == 0) {
				System.out.println(aa);
			}
		}
	}
}
