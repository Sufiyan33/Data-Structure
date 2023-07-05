package arrays;

public class CountPairsWithGivenSumInArray {

	/*
	 * you can also write program using binary search
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5 };
		int sum = 6;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					result++;
					// if you want to return index then return i and j;
					// System.out.println("indexes are :: " + i + "," + j);
					System.out.println("pairs are :: " + "[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}
		System.out.println("pair is :: " + result);
	}
}
