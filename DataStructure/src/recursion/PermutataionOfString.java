package recursion;

import java.util.ArrayList;

public class PermutataionOfString {
	/*
	 * Find permutations of a String.
	 */
	public static void main(String[] args) {
		permutations("", "abc");

		System.out.println();

		ArrayList<String> list = permutationsReturnList("", "abc");
		System.out.println(list);

		System.out.println();

		int count = permutationsCount("", "abc");
		System.out.println("permutation count := " + count);
	}

	static void permutations(String p, String up) {
		if (up.isEmpty()) {
			System.out.print(p + " "); // Did formating to look console nice.
			return;
		}

		char ch = up.charAt(0);

		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			permutations(f + ch + s, up.substring(1));
		}
	}

	// Returning as a List.
	static ArrayList<String> permutationsReturnList(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);

		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			ans.addAll(permutationsReturnList(f + ch + s, up.substring(1)));
		}

		return ans;
	}

	static int permutationsCount(String p, String up) {
		if (up.isEmpty()) {
			return 1;
		}

		char ch = up.charAt(0);
		int count = 0;

		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count = count + permutationsCount(f + ch + s, up.substring(1));
		}
		return count;
	}
}
