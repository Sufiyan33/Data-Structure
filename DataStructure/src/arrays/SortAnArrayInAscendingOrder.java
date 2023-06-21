package arrays;

import java.util.Arrays;

public class SortAnArrayInAscendingOrder {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 1, 2, 4, 9, 8 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int aa : arr) {
			System.out.println(aa + " ");
		}

		System.out.println("--- By Using Java 8 ---");

		Arrays.stream(arr).boxed().sorted(Integer::compareTo).forEach(System.out::println);

		System.out.println("--- By Using sort methods ---");
		Arrays.sort(arr);
		for (int aaa : arr) {
			System.out.println(aaa);
		}
	}
}
