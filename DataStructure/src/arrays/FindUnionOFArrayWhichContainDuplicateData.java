package arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindUnionOFArrayWhichContainDuplicateData {
	/*
	 * you can also use HashMap to remove duplciate element Then convert map to list
	 * and print the data.
	 */
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 3, 4, 5, 5 };

		// To Remove duplicate data create set and add array data in set.

		TreeSet<Integer> set = new TreeSet<>();

		// Remove arr1 duplicate data.
		for (int a : arr1) {
			set.add(a);
		}

		// now remove arr2 duplicate data.
		for (int a : arr2) {
			set.add(a);
		}

		// now convert set into List.
		ArrayList<Integer> list = new ArrayList<>(set);

		// Here print value of list.
		for (Integer value : list) {
			System.out.println(value);
		}
	}
}
