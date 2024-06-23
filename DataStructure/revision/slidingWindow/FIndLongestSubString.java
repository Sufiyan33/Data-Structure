package slidingWindow;

public class FIndLongestSubString {

	/*
	 * Find Longest substring without repeating character
	 */

	public static int subString(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j)) {
					System.out.println(str.charAt(j));
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "cadbzxcab";
		System.out.println(subString(str));
	}
}
