package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachElementInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] countArray = new int[arr.length];

		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// to avoid counting same element again & again;
					countArray[j] = visited;
				}
			}
			if (countArray[i] != visited) {
				countArray[i] = count;
			}
		}
		System.out.println("Element | Frequency");
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] != visited) {
				System.out.println("    " + arr[i] + "  |  " + countArray[i]);
			}
		}

		System.out.println("--- By using Java 8 ---");
		List<Integer> list = Arrays.asList(1, 2, 8, 3, 2, 2, 2, 5, 1);
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);
	}
}
