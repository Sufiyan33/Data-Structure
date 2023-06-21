package arrays;

import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArraysContainDuplicateElement {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 7, 12, 2, 9, 7 };
		int[] arr2 = { 2, 5, 4, 7, 9, 2, 2 };
		int i = 0, j = 0;

		Set<Integer> set = new TreeSet<>();

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				set.add(arr2[j++]);
				i++;
			}
		}
		for (int element : set) {
			System.out.println(element + " ");
		}
	}
}
