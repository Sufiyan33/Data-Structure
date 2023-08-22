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

		System.out.println();
		subsetASCII("", "abc");

		System.out.println();
		System.out.println(subsetReturnListOfASCII("", "abc"));
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
	/*
	 * Now Print subsequence of string along with ASCII value.
	 * 
	 * To find ASCII value : let say char ch = 'a'; & SOP(ch + 0); then it will
	 * return ASCII value of a i.e 97.
	 */

	static void subsetASCII(String ans, String str) {
		if (str.isEmpty()) {
			System.out.print(ans + " ");
			return;
		}

		char ch = str.charAt(0);
		subsetASCII(ans, str.substring(1));
		subsetASCII(ans + ch, str.substring(1));
		subsetASCII(ans + (ch + 0), str.substring(1));
	}

	/*
	 * Now Return list of all subsequence of string along with ASCII value.
	 * 
	 * To find ASCII value : let say char ch = 'a'; & SOP(ch + 0); then it will
	 * return ASCII value of a i.e 97.
	 */

	static ArrayList<String> subsetReturnListOfASCII(String ans, String str) {
		if (str.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}

		char ch = str.charAt(0);

		ArrayList<String> first = subsetReturnList(ans, str.substring(1));
		ArrayList<String> second = subsetReturnList(ans + ch, str.substring(1));
		ArrayList<String> third = subsetReturnList(ans + (ch + 0), str.substring(1));

		// Now combine both result and return.
		first.addAll(second);
		first.addAll(third);
		return first;
	}
}
