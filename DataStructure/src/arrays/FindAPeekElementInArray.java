package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindAPeekElementInArray {
	/*
	 * Peak element is the element which is greater than from its neighbours. ex
	 * int{2,5,2,1}; Here 5 is peak bc it greater that left and right element;
	 */
	public static void main(String[] args) {
		// Ans : 1 if Array is sorted in Ascending order;

		int temp;
		int arr[] = { 1, 3, 20, 4, 1, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("Peak element is :: " + arr[arr.length - 1]);

		// Ans 2 : if Array is sorted in Descending order;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("peak element in descending order :: " + arr[0]);

		// Ans 3: using Arrays.sort() method
		System.out.println("--- By Using Arrays.sort method ---");
		Arrays.sort(arr);
		System.out.println("peak element is :: " + arr[arr.length - 1]);

		// Ans 4 : Using Java 8 method;
		System.out.println("--- By Using Java 8 method ---");

		Arrays.stream(arr).boxed().sorted(Integer::compareTo).max(Comparator.naturalOrder())
				.ifPresent(System.out::println);
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
	}
}
