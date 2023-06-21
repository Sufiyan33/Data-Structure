package arrays;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 9, 8 };
		int[] arr2 = { 4, 5, 6, 11, 10, 12 };

		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				System.out.println(arr1[i++]);
				j++;
			}
		}
	}
}
