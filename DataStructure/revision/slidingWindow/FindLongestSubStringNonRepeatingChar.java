package slidingWindow;

public class FindLongestSubStringNonRepeatingChar {

	/*
	 * Find Longest substring without repeating character
	 */

	public static void main(String[] args) {
		String str = "cadbzabcdgk";
		System.out.println(subString(str));

		System.out.println("----------------------");
		System.out.println(findSubString(str));
	}

	// Brute force approach.
	public static int subString(String str) {
		int len = 0;
		int maxLen = 0;
		
		char[] ch = str.toCharArray();
		final int MAX_SIZE = 256;

		for (int i = 0; i < ch.length; i++) {

			int hash[] = new int[MAX_SIZE];
			for (int j = i; j < ch.length; j++) {

				if (hash[ch[j]] == 1) {
					break;
				}

				len = j - i + 1;
				maxLen = Math.max(len, maxLen);
				hash[ch[j]] = 1;

			}
		}
		return maxLen;
	}

	// Optimal Approach
	public static int findSubString(String str) {

		int l = 0, r = 0, maxLen = 0;
		int MAX_SIZE = 256;
		int hash[] = new int[MAX_SIZE];

		char[] ch = str.toCharArray();

		while (r < ch.length) {
			if (hash[ch[r]] != -1) {
				if (hash[ch[r]] >= l) {
					l = hash[ch[r]] + 1;
				}
			}

			int len = r - l + 1;
			maxLen = Math.max(len, maxLen);
			hash[ch[r]] = r;
			r++;
		}
		return maxLen;
	}


}
