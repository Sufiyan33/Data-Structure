package recursion;

import java.util.ArrayList;

public class SubsetOfString {
	/*
	 * Find subset of a given String.
	 */
	// Approach.
	/*
	 * Remember one thing whenever you see subset pattern problem then think of
	 * subset method.
	 * 
	 * Pattern of removing some elements or adding some elements known as subset
	 * pattern.
	 * 
	 * whenever string become empty then return and that is the base condition.
	 */

	public static void main(String[] args) {
		subset("", "abc");
		System.out.println();
		System.out.println(subsetReturnList("", "123"));
		System.out.println(subsetReturnList("", "abc"));
	}

	static void subset(String ans, String str) {
		if (str.isEmpty()) {
			System.out.print(ans + " ");
			// System.out.print(ans);
			return;
		}

		char ch = str.charAt(0);
		// Remove an elements.
		subset(ans, str.substring(1));
		// Taking an elements.
		subset(ans + ch, str.substring(1));
	}

	// Now we will return List instead of void.
	/*
	 * I already explained this in Program : FindTargetInArrayHavingDuplicateNumber.
	 * Make sure to check GitHub recursion repo.
	 */

	static ArrayList<String> subsetReturnList(String ans, String str) {
		if (str.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}

		char ch = str.charAt(0);

		ArrayList<String> left = subsetReturnList(ans, str.substring(1));
		ArrayList<String> right = subsetReturnList(ans + ch, str.substring(1));

		// Now combine both result and return.
		left.addAll(right);
		return left;
	}
}
