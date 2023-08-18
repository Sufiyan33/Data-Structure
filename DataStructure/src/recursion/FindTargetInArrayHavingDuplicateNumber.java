package recursion;

import java.util.ArrayList;

public class FindTargetInArrayHavingDuplicateNumber {
	/*
	 * Find target in array having duplicate elements.
	 */

	// Case 1 : Creating static list not passing as method arguments.
	static ArrayList<Integer> staticList = new ArrayList<>();

	static void findAllIndex(int[] arr, int target, int index) {

		if (index == arr.length) {
			return;
		}

		if (arr[index] == target) {
			staticList.add(index);
		}
		findAllIndex(arr, target, index + 1);
	}

	// Case 2 : Passing List as method parameter.
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		if (index == arr.length)
			return list;

		if (arr[index] == target)
			list.add(index);

		return findAllIndex(arr, target, index + 1, list);
	}

	/*
	 * v.v.v important
	 * 
	 * Case 3 : Create list inside this body of function itself OR Return list but
	 * don't take it as method argument.
	 * 
	 * In this case whenever recursive call happen at each time new arrayList will
	 * be created. Since scope of this list is within the method hence if you will
	 * return it then each time output would be empty. So to avoid this issue just
	 * add value whatever you got from last call and add in main list, return that
	 * list. Now Good to go.
	 */

	static ArrayList<Integer> findIndexUsingList(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();

		if (index == arr.length)
			return list;

		if (arr[index] == target)
			list.add(index);

		ArrayList<Integer> ansFromLastCall = findIndexUsingList(arr, target, index + 1);
		list.addAll(ansFromLastCall);

		return list;
	}

	public static void main(String[] args) {
		// Case 1 :
		int[] arr = { 1, 3, 4, 6, 14, 9, 14, 0 };
		int target = 14;
		findAllIndex(arr, target, 0);
		System.out.println("Find Target at indices are =: " + staticList);

		System.out.println("------------------------------");

		// Case 2 :
		int[] arr1 = { 1, 3, 4, 6, 14, 9, 14, 0 };
		int target1 = 14;
		ArrayList<Integer> indices = findAllIndex(arr1, target1, 0, new ArrayList<>());
		System.out.println("Find Target at indices are =: " + indices);

		System.out.println("------------------------------");

		// Case 3 :
		int[] arr2 = { 1, 3, 4, 6, 14, 9, 14, 0 };
		int target2 = 14;
		ArrayList<Integer> ans = findIndexUsingList(arr2, target2, 0);
		System.out.println("Find Target at indices are =: " + ans);
	}
}
