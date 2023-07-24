package sorting;

import java.util.Arrays;

public class SortArrayUsingCyclicSort {
	/*
	 * Cyclic sort.
	 * 
	 * When array or number is given in range of 1 to N then use this sort.
	 * 
	 * 1- initialize variable i =0; 2- we have to place the element at correct
	 * index. so to find the correct element use below formula :
	 * 
	 * correctIndex = value - 1;
	 * 
	 * 3- once you find index then check if element is in correct index : a- if yes,
	 * then move ahead. b- if no, then do swamping.
	 * 
	 * 4- now print the array bc it is sorted.
	 */

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 2, 3 };
		// int[] arr = { 5, 4, 3, 2, 1 };
		// int[] arr = {};
		// int[] arr = { 3, 5, 2, 1, 4 };
		// int[] arr = { 2, 1 };

		System.out.println("Unsorted arrays is :: " + Arrays.toString(arr));
		cyclicSort(arr);
		System.out.println("sorted arrays is :: " + Arrays.toString(arr));
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
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
