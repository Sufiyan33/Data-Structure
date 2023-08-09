package arrays;

public class FindNPairsFromArray {
	/*
	 * In the given array forms n pairs of array.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4 };
		pairs(arr, 3);
	}

	public static void pairs(int[] arr, int p) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print("(" + arr[i] + ", " + arr[j] + ")" + ", ");
			}
		}
	}
}
