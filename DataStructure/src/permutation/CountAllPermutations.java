package permutation;

public class CountAllPermutations {

	/*
	 * Count all the permutations
	 */
	public static void main(String[] args) {
		int count = countPermutations("", "abcd");
		System.out.println(count);
	}

	static int countPermutations(String p, String up) {

		if (up.isEmpty())
			return 1;

		char ch = up.charAt(0);

		int count = 0;

		for (int i = 0; i < p.length() + 1; i++) {
			String first = p.substring(0, i);
			String second = p.substring(i, p.length());

			count = count + countPermutations(first + ch + second, up.substring(1));
		}
		return count;
	}
}
