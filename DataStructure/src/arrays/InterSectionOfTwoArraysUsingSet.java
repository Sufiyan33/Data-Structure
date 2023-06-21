package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InterSectionOfTwoArraysUsingSet {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 7, 12, 2, 9, 7 };
		int[] arr2 = { 2, 5, 4, 7, 9, 2, 2 };

		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();

		// Removing duplicates from arr1;
		for (int i : arr1) {
			set.add(i);
		}

		// Removing duplicates from arr1;
		for (int i : arr2) {
			if (set.contains(i) && !list.contains(i)) {
				list.add(i);
			}
		}
		for (int aa : list) {
			System.out.println(aa);
		}
	}
}
