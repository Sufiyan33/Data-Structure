package test_knowledge;

import java.util.Arrays;
import java.util.List;

public class Test11 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(123, 543);
		List<Integer> list2 = Arrays.asList(321, 279);
		int minimumMoves = minimumMoves(list1, list2);
		System.out.println(minimumMoves);
	}

	public static int minimumMoves(List<Integer> list1, List<Integer> list2) {
		int totalMoves = 0;

		int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
		int[] arr2 = list2.stream().mapToInt(Integer::valueOf).toArray();

		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			num1 = arr1[i];
			for (int j = i + 1; j < arr2.length; j++) {
				num2 = arr2[j];
			}

			int diff = Math.abs(num1 - num2);
			totalMoves += diff;

		}
		return totalMoves;
	}
}
