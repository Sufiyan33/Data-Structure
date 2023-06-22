package arrays;

public class ProgramToLeftRotateArrayElementByDPositions {
	/*
	 * 1-First store index d to arr.length -1 element in the temp array. 2-Then
	 * start to till d element store in again in temp array. 3-Now copy temp array
	 * into original array.
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, d = 2;
		int temp[] = new int[arr.length];
		int k = 0; // for represent index of temp array;

		for (int i = d; i < arr.length; i++) {
			temp[k] = arr[i];
			k++;
		}

		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}
		// Copying temp array to original array;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}

		for (int aa : arr) {
			System.out.println(aa);
		}
	}
}
