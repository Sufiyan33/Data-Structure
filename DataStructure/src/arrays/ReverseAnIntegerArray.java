package arrays;

public class ReverseAnIntegerArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 1, 9, 11, 14, 10 };

		int start = 0, end = arr.length - 1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int aa : arr) {
			System.out.println(aa + " ");
		}
	}
}
