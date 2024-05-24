package arrays;

import java.util.Arrays;

public class SortArrayIn0s1sAnd2s {

	/*
	 * Sort an array in 0's, 1's and 2's this problem is also known as Dutch
	 * national flag. Proposed by Dijkstra.
	 */

	/*
	 * Approach 1 : Two pointer approach. 1 : Initialize two variable low and high.
	 * 2 : check if element is equal to zero then swap element with low and increase
	 * low and index by one.
	 * 
	 * 3 : If array element is equal to two then swap with high and decrement high.
	 * 4 : if array element is equal to one then increment only i;
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2, 1, 0, 2 };
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sortArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		for (int index = 0; index < arr.length && index <= high;) {
			if (arr[index] == 0) {
				swap(arr, low, index);
				low++;
				index++;
			} else if (arr[index] == 2) {
				swap(arr, index, high);
				high--;
			} else {
				index++;
			}
		}
	}

	static void swap(int[] arr, int low, int index) {
		int temp = arr[low];
		arr[low] = arr[index];
		arr[index] = temp;
	}
}
