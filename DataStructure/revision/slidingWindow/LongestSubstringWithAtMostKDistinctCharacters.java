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

		System.out.println("---------------------");
		System.out.println(subString(str, k));

		System.out.println("---------------------");
		System.out.println(subStrings(str, k));

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

	// Better Solutions. TC - O(n) + O(n). SC = log(256)
	public static int subString(String str, int k) {

		int l = 0, r = 0, maxLen = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();

		while (r < ch.length) {
			int currentCount = map.getOrDefault(ch[r], 0);
			map.put(ch[r], currentCount + 1);

			while (map.size() > k) {
				int count = map.get(ch[l]);
				if (count == 1) {
					map.remove(ch[l]);
				} else {
					map.put(ch[l], count - 1);
				}
				l++;
			}
			maxLen = Math.max(maxLen, r - l + 1);
			r++;
		}
		return maxLen;
	}

	// Better Solutions. TC - O(n). SC = log(256)
	public static int subStrings(String str, int k) {

		int l = 0, r = 0, maxLen = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();

		while (r < ch.length) {
			int currentCount = map.getOrDefault(ch[r], 0);
			map.put(ch[r], currentCount + 1);

			if (map.size() > k) {
				int count = map.get(ch[l]);
				if (count == 1) {
					map.remove(ch[l]);
				} else {
					map.put(ch[l], count - 1);
				}
				l++;
			}
			maxLen = Math.max(maxLen, r - l + 1);
			r++;
		}
		return maxLen;
	}

}

