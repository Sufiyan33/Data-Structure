package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FindKthSmallestElementInArray {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;

		Arrays.sort(arr);
		System.out.println("kth Smallest Element is :: " + arr[k - 1]);

		System.out.println("--- By Using set ---");

		int[] ar = { 12, 3, 5, 7, 19 };
		int j = 4;
		j--;
		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		Iterator<Integer> itr = set.iterator();

		while (j > 0) {
			itr.next();
			j--;
		}
		System.out.println(itr.next());
	}
}
