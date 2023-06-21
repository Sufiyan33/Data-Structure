package arrays;

import java.util.Arrays;

public class SortOddElementInDescAndEvenInAsceOrderInArray {
	/*
	 * you can also solve this issue by creating two list oddList and evenList and
	 * sort them. Post that add oddList.add(evenList).
	 */
	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 7, 2, 8, 4, 10 };
		int[] oddArray = new int[arr.length];
		int[] evenArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArray[i] = arr[i];
			} else {
				oddArray[i] = arr[i];
			}
		}

		Arrays.sort(evenArray);
		// converting in descending order(oddArray);
		int temp;
		for (int i = 0; i < oddArray.length; i++) {
			for (int j = i + 1; j < oddArray.length; j++) {
				if (oddArray[i] < oddArray[j]) {
					temp = oddArray[j];
					oddArray[j] = oddArray[i];
					oddArray[i] = temp;
				}
			}
		}

		// copy first oddArray in original array then evenArray;

		for (int i = 0; i < oddArray.length; i++) {
			arr[i] = oddArray[i];
		}

		// Here add some manual way to add even number
		for (int j = 4; j < evenArray.length; j++) {
			arr[j] = evenArray[j];
		}

		for (int abc : arr) {
			System.out.println(abc);
		}
	}
}
