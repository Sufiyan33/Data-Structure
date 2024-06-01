package recursion;

public class CheckArraySorted {

	/*
	 * Here, an array is given, check it is sorted or not...
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 5 };
		boolean flag = isSorted(arr, 0);
		System.out.println(flag);
	}

	static boolean isSorted(int[] arr, int index) {
		if (index == arr.length - 1)
			return true;

		return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
	}
}
