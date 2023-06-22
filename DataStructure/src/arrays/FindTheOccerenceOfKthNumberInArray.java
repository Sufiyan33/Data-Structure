package arrays;

public class FindTheOccerenceOfKthNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int k = 2, result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				result++;
			}
		}
		System.out.println("Number of occurrence is :: " + result);
	}
}
