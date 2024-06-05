package recursion;

public class SkipACharacterFromString {

	/*
	 * Make a new String with input by using recursion. example : baccad => bccd.
	 */

	public static void main(String[] args) {
		String up = "baccadah";

		// Modifying original string.
		String aa = makeString(up);
		System.out.println(aa);

		// taking process and un-process string.
		makeString("", up);
	}

	static String makeString(String up) {
		if (up.isEmpty())
			return "";

		char ch = up.charAt(0);

		if (ch == 'a') {
			return makeString(up.substring(1));
		} else {
			return ch + makeString(up.substring(1));
		}
	}

	public static void makeString(String p, String up) {
		if (up.isBlank()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);

		if (ch == 'a') {
			makeString(p, up.substring(1));
		} else {
			makeString(p + ch, up.substring(1));
		}
	}
}
