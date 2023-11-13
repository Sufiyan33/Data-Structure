package test_knowledge;

import java.util.HashSet;
import java.util.Set;

public class Test21 {

	public static void main(String[] args) {
		String[] arr1 = { "RED", "GREEN" };
		String[] arr2 = { "Red", "BLUE", "GREEN", "yellow" };

		Set<String> duplicates = new HashSet<>();
		Set<String> uniques = new HashSet<>();

		for (String items : arr1) {
			duplicates.add(items);
		}

		for (String it : arr2) {
			if (uniques.contains(duplicates.toArray())) {
				// write here code to find out.
			}
		}
	}
}
