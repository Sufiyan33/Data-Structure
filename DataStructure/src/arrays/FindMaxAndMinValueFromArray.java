package arrays;

import java.util.Arrays;

public class FindMaxAndMinValueFromArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 77, 22, 43, 10, 11, 9 };
		int min = arr[0];
		int max = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min :: " + min + " max :: " + max);

		System.out.println("By using Java 8");
		Arrays.stream(arr).boxed().max(Integer::compareTo).ifPresent(System.out::println);
		Arrays.stream(arr).boxed().min(Integer::compareTo).ifPresent(System.out::println);
	}
}
