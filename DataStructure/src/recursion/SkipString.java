package recursion;

public class SkipString {
	/*
	 * Program to Skip a whole String not a character in a given String.
	 */
	public static void main(String[] args) {
		String skip = skipApple("bccapplefsa");
		System.out.println("Skip strings are := " + skip);

		System.out.println("----------------------------");

		String skipNotApple = skipAppNotApple("bccapplfsa");
		System.out.println("Skip Not Apple := " + skipNotApple);
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

	/*
	 * Skip a string when it's not equal. ex skip app when it not start with apple.
	 */
	static String skipAppNotApple(String str) {
		if (str.isEmpty())
			return "";

		if (str.startsWith("app") && !str.startsWith("apple")) {
			return skipAppNotApple(str.substring(3));
		} else {
			return str.charAt(0) + skipAppNotApple(str.substring(1));
		}
	}
}
