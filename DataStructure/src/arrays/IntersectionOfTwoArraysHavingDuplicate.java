package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArraysHavingDuplicate {

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		int[] result = intersection(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();

		for (int aa : nums1) {
			set.add(aa);
		}

		for (int bb : nums2) {
			if (set.contains(bb) && !list.contains(bb)) {
				list.add(bb);
			}
		}

		int arr[] = new int[list.size()];
		int k = 0;
		for (int ab : list) {
			arr[k++] = ab;
		}
		return arr;
	}
}
