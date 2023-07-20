package binarySearch;

import java.util.Arrays;

public class FairCandySwap {

	/*
	 * 888. Fair Candy Swap
	 */
	// Approach
	/*
	 * 1- first find total sum of alice and bob before exchange. 2- Now run the two
	 * loop and check what alice exchange by using this = aliceTotal - alicesize[i]
	 * + bobsize[j], means alice is giving one element and taking one element brom
	 * bob. 3- Do the same thing for bob exchange. 4- once you found both exchange
	 * then again compare with both sum of exchanges, if equal then return otherwise
	 * again check.
	 */

	public static void main(String[] args) {
		// int[] a = { 1, 1 }, b = { 2, 2 };
		// int[] a = { 1, 2 }, b = { 2, 3 };
		int[] a = { 2 }, b = { 1, 3 };
		int[] swap = fairCandySwap(a, b);
		System.out.println("both exchanges are ::" + Arrays.toString(swap));
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		// first we have to find total sum of each before exchanges.
		int aliceTotal = 0;
		int bobTotal = 0;

		for (int aa : aliceSizes) {
			aliceTotal += aa;
		}
		for (int bb : bobSizes) {
			bobTotal += bb;
		}
		// Now iterate aliceSize array and then try to find out target so that we can do
		// binary search.

		for (int i = 0; i < aliceSizes.length; i++) {
			// here we will use some mathmatics to find mid value;
			/*
			 * see as previouse example I explained very well. aliceTotal - aliceSizes[i] +
			 * bobSizes[j] = bobTotal - bobSizes[j]+aliceSizes[i] aliceTotal = bobTotal +
			 * aliceSizes[i] + aliceSizes[i] - bobSizes[j]-bobSizes[j] aliceTotal = bobTotal
			 * + 2 * aliceSizes[i] - 2* bobSizes[j];
			 * 
			 * 2 bobSizes[j] = bobTotal - aliceTotal + 2 * aliceSizes[i]; bobSizes[j] =
			 * (bobTotal - aliceTotal + 2 * aliceSizes[i])/2
			 */

			/*
			 * Here in this case we will take bobsize array as target to do binar search.
			 * Hence we need to first sort bobsArray
			 */
			int target = (bobTotal - aliceTotal + 2 * aliceSizes[i]) / 2;
			if (binarySearch(bobSizes, target)) {
				return new int[] { aliceSizes[i], target };
			}
		}

		return new int[0];
	}

	public static boolean binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;
		while (start <= end) {
			if (target > arr[mid])
				start = mid + 1;
			if (target < arr[mid])
				end = mid - 1;
			else
				return true;
		}
		return false;
	}
}
