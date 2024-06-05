package permutation;

public class FindPurmutationsOfString {

	public static void main(String[] args) {
		// permutations("", "abc");
		// permutations("", "ab");
		permutations("", "123");
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
}
