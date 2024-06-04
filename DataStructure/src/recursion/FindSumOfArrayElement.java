package recursion;

public class FindSumOfArrayElement {

	/*
	 * find sum of array element means => arr[1,2,3] => 6
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6 };
		int sum = arraySum(arr, 0);
		System.out.println(sum);
	}

	static int arraySum(int[] arr, int index) {
		if (index == arr.length)
			return index;

		return arr[index] + arraySum(arr, index + 1);
	}
}
