package arrays;

import java.util.Arrays;

public class FairCandySwap {
	/*
	 * 888. Fair Candy Swap
	 */
	// Approch
	/*
	 * 1- first find total sum of alice and bob before exchange. 2- Now run the two
	 * loop and check what alice exchange by using this = aliceTotal - alicesize[i]
	 * + bobsize[j], means alice is giving one element and taking one element brom
	 * bob. 3- Do the same thing for bob exchange. 4- once you found both exchange
	 * then again compare with both sum of exchanges, if equal then return otherwise
	 * again check.
	 */
	public static void main(String[] args) {
		int[] a = { 1, 1 }, b = { 2, 2 };
		// int[] a = { 1, 2 }, b = { 2, 3 };
		// int[] a = { 2 }, b = { 1, 3 };
		int[] swap = fairCandySwap(a, b);
		System.out.println("both exchanges are ::" + Arrays.toString(swap));
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

		int aliceTotal = 0;
		int bobTotal = 0;

		for (int aa : aliceSizes) {
			aliceTotal += aa;
		}
		for (int bb : bobSizes) {
			bobTotal += bb;
		}

		for (int i = 0; i < aliceSizes.length; i++) {
			for (int j = 0; j < bobSizes.length; j++) {
				int aliceExchange = aliceTotal - aliceSizes[i] + bobSizes[j];
				System.out.println("for testing purpose aliceExchange :: " + aliceExchange);
				int bobExchange = bobTotal - bobSizes[j] + aliceSizes[i];
				System.out.println("for testing purpose bobExchange :: " + bobExchange);

				if (aliceExchange == bobExchange) {
					return new int[] { aliceSizes[i], bobSizes[j] };
				}
			}
		}

		return new int[0];
	}
}
