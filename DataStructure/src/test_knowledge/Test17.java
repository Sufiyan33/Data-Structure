package test_knowledge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test17 {
	public static void main(String[] args) {

		/*
		 * Count pairs of same colors
		 */
		List<String> list = Arrays.asList("Red", "Green", "Red", "Green", "Yellow");
		long pairs = 0;
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<String, Long> map : collect.entrySet()) {
			pairs += map.getValue() / 2;
		}

		System.out.println(pairs);
	}
}
