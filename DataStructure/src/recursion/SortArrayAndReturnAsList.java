package recursion;

import java.util.ArrayList;

public class SortArrayAndReturnAsList {

	/*
	 * Sort an array using Linear search or others and add indices or values into
	 * array or list.
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 8, 10, 15, 15, 15 };
		int target = 15;

		System.out.println("--- Case : 1 ---");
		findAllIndices(arr, target, 0);
		System.out.println(list);

		System.out.println("--- Case : 2 ---");
		ArrayList<Integer> allIndex = findAllIndex(arr, target, 0, new ArrayList<>());
		System.out.println(allIndex);

		System.out.println("--- Case : 3 ---");
		ArrayList<Integer> findAllIndex = findAllIndex(arr, target, 0);
		System.out.println(findAllIndex);
	}

	/*
	 * Case 1 : Create List outside the function & add values in it. post that print
	 * list. In this case same list is modifying.
	 */
	static ArrayList<Integer> list = new ArrayList<>();

	static void findAllIndices(int[] arr, int target, int index) {
		if (index == arr.length)
			return;

		if (arr[index] == target)
			list.add(index);

		findAllIndices(arr, target, index + 1);
	}

	/*
	 * Case 2 : Pass List in function argument and return it once everything is
	 * over. In this case same list is modifying.
	 */

	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		if (index == arr.length)
			return list;

		if (arr[index] == target)
			list.add(index);

		return findAllIndex(arr, target, index + 1, list);
	}

	/*
	 * Case 3 : Create list in the body of function. Every function call a new list
	 * will be created. Hence add all possible answer in one list while returning
	 * values to the main function.
	 */

	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();
		if (index == arr.length)
			return list;

		// This will contain answer for that function only.
		if (arr[index] == target)
			list.add(index);

		ArrayList<Integer> ansFromBelowCall = findAllIndex(arr, target, index + 1);
		// Let's combine all possible answers.
		list.addAll(ansFromBelowCall);

		return list;
	}

}
