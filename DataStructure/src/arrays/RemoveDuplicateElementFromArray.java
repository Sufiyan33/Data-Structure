package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateElementFromArray {
	/*
	 * 1-Create a HashMap to store the unique elements. 2-Traverse the array.
	 * 3-Check if the element is present in the HashMap. 4-If yes, continue
	 * traversing the array. 5-Else Print the element and store the element in
	 * HashMap.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };

		System.out.println("--- Solution 2 : ---");
		// Solution 1 :
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				System.out.println(arr[i] + " ");
				map.put(arr[i], true);
			}
		}
		System.out.println("--- Solution 2 : ---");
		// Solution 2 :
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (Integer ss : set) {
			System.out.println(ss);
		}
	}
}
