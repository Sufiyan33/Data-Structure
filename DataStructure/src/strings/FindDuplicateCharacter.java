package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String s = "Programming";
		char[] ar = s.toCharArray();
		int count = 0;
		int i = 0;

		for (i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicates are :: " + ar[j]);
				}
			}
		}

		System.out.println("Using Java 8");

		Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("Using HahsMap");

		HashMap<Character, Integer> map = new HashMap<>();
		for (i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				count = map.get(ar[i]);
				map.put(ar[i], count + 1);
			} else {
				map.put(ar[i], 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> ss : entrySet) {
			if (ss.getValue() > 1) {
				System.out.println("key is :: " + ss.getKey() + " Value is :: " + ss.getValue());
			}
		}
	}
}
