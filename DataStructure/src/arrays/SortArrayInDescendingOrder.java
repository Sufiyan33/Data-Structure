package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 20, 1, 4, 2, 11, 11, 3, 4, 10 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int aa : arr) {
			System.out.println(aa);
		}

		System.out.println("--- By using Java 8 ---");
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
