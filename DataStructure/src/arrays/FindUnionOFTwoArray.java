package arrays;

public class FindUnionOFTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 9, 8 };
		int[] arr2 = { 4, 5, 6, 11, 10, 12 };
		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.println(arr1[i++] + " ");
			} else if (arr1[i] > arr2[j]) {
				System.out.println(arr2[j++] + " ");
			} else {
				System.out.println(arr1[i++] + " ");
				j++;
			}
		}
		while (i < arr1.length) {
			System.out.println(arr1[i++] + " ");
		}
		while (j < arr2.length) {
			System.out.println(arr2[j++] + " ");
		}
	}
}
