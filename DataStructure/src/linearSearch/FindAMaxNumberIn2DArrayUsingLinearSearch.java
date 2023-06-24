package linearSearch;

public class FindAMaxNumberIn2DArrayUsingLinearSearch {

	public static void main(String[] args) {
		int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };

		System.out.println("max value is :: " + max(arr));
	}

	static int max(int arr[][]) {
		// let suppose max values is below;
		int max = Integer.MIN_VALUE;
		for (int[] inner : arr) {
			for (int element : inner) {
				if (element > max) {
					max = element;
				}
			}
		}

		return max;
	}
}
