package arrays;

public class PrintArrayElementPresentInOddPosition {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 11 };

		for (int aa : arr) {
			if (aa % 2 != 0) {
				System.out.println(aa);
			}
		}
	}
}
