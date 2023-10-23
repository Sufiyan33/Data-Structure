package strings;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		String input = "GoodMorning";
		int count = 0;

		input.chars().mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

		System.out.println("With Classic for loop & HashMap");

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ss = input.charAt(i);
			if (map.containsKey(ss)) {
				count = map.get(ss);
				count++;
				map.put(ss, count);
			} else {
				map.put(ss, 1);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			count = map.get(c);
			if (count == 1) {
				System.out.println("first non-repeated character is :: " + c);
				break;
			}
		}

	}
}
