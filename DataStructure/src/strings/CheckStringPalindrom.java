package strings;

public class CheckStringPalindrom {
	/*
	 * Check string Palindrome.
	 * 
	 * There are many ways to do.
	 */
	public static void main(String[] args) {
		// String str = "";
		// String str = "abcdcba";
		// String str = "abcd";
		// String str = "abccba";
		String str = "Java";
		System.out.println("Is sstring palindrome := " + isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {

		if (str == null || str.length() == 0) {
			return true;
		}
		for (int i = 0; i <= str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);

			if (start != end) {
				return false;
			}
		}
		return true;
	}
}
