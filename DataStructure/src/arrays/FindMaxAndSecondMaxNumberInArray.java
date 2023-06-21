package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxAndSecondMaxNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 77, 22, 43, 10, 11, 9, 43 };
		int max = arr[0];
		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println("max value is :: " + max + " SecondMax is :: " + secondMax);

		System.out.println("--- Using forEachLoop ---");

		for (int aa : arr) {
			if (aa > max) {
				secondMax = max;
				max = aa;
			} else if (aa > secondMax && aa != max) {
				secondMax = aa;
			}
		}
		System.out.println("max value is :: " + max + " SecondMax is :: " + secondMax);

		System.out.println("--- Using forEachLoop ---");
		Integer maxValue = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		Integer secondMaxValue = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("max value is :: " + maxValue + " SecondMax is :: " + secondMaxValue);

	}
}
