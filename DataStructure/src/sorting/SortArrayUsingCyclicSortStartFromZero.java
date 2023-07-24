package sorting;

import java.util.Arrays;

public class SortArrayUsingCyclicSortStartFromZero {
	/*
	 * Cyclic sort.
	 * 
	 * When array or number is given in range of O to N then use this sort.
	 * 
	 * Only different in formula, rest of the thing would be same.
	 * 
	 * 1- initialize variable i =0; 2- we have to place the element at correct
	 * index. so to find the correct element use below formula :
	 * 
	 * correctIndex = value;
	 * 
	 * 3- once you find index then check if element is in correct index : a- if yes,
	 * then move ahead. b- if no, then do swamping.
	 * 
	 * 4- now print the array bc it is sorted.
	 */

	public static void main(String[] args) {
		// int[] arr = { 5, 4, 1, 2, 3 };
		// int[] arr = { 5, 4, 3, 2, 1 };
		// int[] arr = {};
		// int[] arr = { 3, 5, 2, 1, 4 };
		// int[] arr = { 2, 1 };
		// int[] arr = { 2, 1, 0 };
		int[] arr = { 5, 4, 0, 3, 2, 1 };

		System.out.println("Unsorted arrays is :: " + Arrays.toString(arr));
		cyclicSort(arr);
		System.out.println("sorted arrays is :: " + Arrays.toString(arr));
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i];
			if (arr[i] != arr[correctIndex])
				swap(arr, i, correctIndex);
			else
				i++;
		}
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
