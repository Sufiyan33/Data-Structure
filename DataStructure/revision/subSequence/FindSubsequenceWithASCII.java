package subSequence;

public class FindSubsequenceWithASCII {

	/**
	 * Find subsequence of a string & also print it's ASCII value.
	 */
	public static void main(String[] args) {
		subSequence("", "abc");
	}

	static void subSequence(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);

		subSequence(p + ch, up.substring(1));
		subSequence(p, up.substring(1));
		subSequence(p + (ch + 0), up.substring(1));
	}
}
