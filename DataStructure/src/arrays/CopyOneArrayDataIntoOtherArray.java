package arrays;

import java.util.ArrayList;
import java.util.List;

public class CopyOneArrayDataIntoOtherArray {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 10, 23, 41, 5, 12 };
		int[] copyArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			copyArray[i] = arr[i];
		}
		for (int aa : copyArray) {
			System.out.println(aa);
		}

		System.out.println("--- By using list ---");
		List<Integer> list = new ArrayList<>();
		for (int aaa : arr) {
			list.add(aaa);
		}
		for (Integer ll : list) {
			System.out.println(ll);
		}
	}
}
