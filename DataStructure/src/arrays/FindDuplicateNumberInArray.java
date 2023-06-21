package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 2, 77, 22, 43, 22, 11, 2, 43 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

		System.out.println("--- using Java 8 ---");
		List<Integer> list = Arrays.asList(2, 5, 2, 77, 22, 43, 22, 11, 2, 43);
		list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);
		;
	}
}
