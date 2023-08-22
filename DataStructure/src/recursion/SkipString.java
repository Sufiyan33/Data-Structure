package recursion;

public class SkipString {
	/*
	 * Program to Skip a whole String not a character in a given String.
	 */
	public static void main(String[] args) {
		String skip = skipApple("bccapplefsa");
		System.out.println("Skip strings are := " + skip);
	}

	static String skipApple(String str) {
		if (str.isEmpty())
			return "";

		if (str.startsWith("apple")) {
			return skipApple(str.substring(5));
		} else {
			return str.charAt(0) + skipApple(str.substring(1));
		}
	}
}
