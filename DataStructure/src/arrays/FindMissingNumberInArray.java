package arrays;

public class FindMissingNumberInArray {

	/*
	 * the idea is first find the sum of natural number using formula n*(n+1)/2 and
	 * then find sum of array. Now subtract sum -sumOfarray;
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 3, 7, 8 };
		// int[] arr = { 1, 2, 3, 5 };
		int n = arr.length;

		int sum = (n * (n + 1) / 2);
		/*
		 * Here one number is missing from array right, in this case either you should
		 * take sum =((n+1)* (n+2))/2 or while using loop use i<arr.length-1;
		 */

		for (int i = 0; i < arr.length - 1; i++) {
			sum -= arr[i];
		}
		System.out.println(sum);
	}
}
