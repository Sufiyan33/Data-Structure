package arrays;

public class ProgramToRightRotateArrayElementByDPosition {
	/*
	 * 1- Traverse array from d to arr.length-1 and store in temp array. 2- traverse
	 * array from start to d and store in temp array. 3- now copy temp array data
	 * into original array.
	 */
	public static void main(String[] args) {
		/*
		 * int[] arr = new int[] { 1, 2, 3, 4, 5 }; int d = 3;
		 */

		int arr[] = { 10, 34, 56, 23, 78, 12, 13, 65 };
		int d = 5;
		int temp[] = new int[arr.length];
		int k = 0; // represent index of temp array.

		for (int i = d; i < arr.length; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}

		for (int aa : arr) {
			System.out.println(aa);
		}
	}
}
