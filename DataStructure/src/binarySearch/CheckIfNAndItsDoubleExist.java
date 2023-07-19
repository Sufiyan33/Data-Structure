package binarySearch;

public class CheckIfNAndItsDoubleExist {
	/*
	 * 1346 : Check If N and Its Double Exist,
	 */
	public static void main(String[] args) {
		// int[] arr = { 10, 2, 5, 3 };
		// int[] arr = { 7, 1, 14, 11 };
		int[] arr = { 1, 11, 7, 3 };
		boolean flag = checkIfExist(arr);
		System.out.println(flag);
	}

	public static boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == 2 * arr[j])
					return true;
			}
		}
		return false;
	}

}
