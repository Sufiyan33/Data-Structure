package permutation;

import java.util.ArrayList;

public class FindPurmutationsOfString {

	public static void main(String[] args) {
		// permutations("", "abc");
		// permutations("", "ab");
		// permutations("", "123");

		ArrayList<String> ans = permutationsReturn("", "123", new ArrayList<String>());
		System.out.println(ans);

		ArrayList<String> res = permutation("", "123");
		System.out.println(res);
	}

	static void permutations(String p, String up) {

		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);

		/*
		 * Now making call as number of process(p) is called. Since process is making
		 * call => size + 1 times. Hence run loop same time.
		 */

		for (int i = 0; i < p.length() + 1; i++) {

			String first = p.substring(0, i);
			String second = p.substring(i, p.length());

			permutations(first + ch + second, up.substring(1));
		}

	}

	// Add list in argument then return this list.
	static ArrayList<String> permutationsReturn(String p, String up, ArrayList<String> list) {

		if (up.isEmpty()) {
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);

		/*
		 * Now making call as number of process(p) is called. Since process is making
		 * call => size + 1 times. Hence run loop same time.
		 */

		for (int i = 0; i < p.length() + 1; i++) {

			String first = p.substring(0, i);
			String second = p.substring(i, p.length());

			permutationsReturn(first + ch + second, up.substring(1), list);
		}
		return list;
	}

	static ArrayList<String> permutation(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);

		// this for local call.
		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < p.length() + 1; i++) {

			String first = p.substring(0, i);
			String second = p.substring(i, p.length());

			ans.addAll(permutation(first + ch + second, up.substring(1)));
		}
		return ans;
	}
}
