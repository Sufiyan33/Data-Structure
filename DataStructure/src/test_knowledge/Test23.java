package test_knowledge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test23 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 6, 9, 4, 3, 20);

		list.stream().filter(e -> e > 5).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(System.out::println);

		List<Integer> collect = list.stream().filter(e -> e > 50).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
