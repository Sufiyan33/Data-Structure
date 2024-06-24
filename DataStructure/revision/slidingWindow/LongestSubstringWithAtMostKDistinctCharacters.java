package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {

	/*
	 * Longest Substring With At Most K Distinct Characters
	 */

	public static void main(String[] args) {
		String str = "aaabbccd";
		int k = 2;
		
		System.out.println(subStringLength(str, k));

	}

	// Brute Force approach. TC = O(N*N), SC = Log(245)
	public static int subStringLength(String str, int k) {
		
		int maxlen = 0;
		Map<Character, Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			map.clear();

			for (int j = i; j < ch.length; j++) {
				map.put(ch[j], i);

				if (map.size() <= k) {
					maxlen = Math.max(maxlen, j - i + 1);
				} else {
					break;
				}
			}
		}
		return maxlen;
	}
}
