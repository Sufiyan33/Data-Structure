package binarySearch;

public class OrderAgnosticBS {
	
	/*
	 * Here we, will look on order agnostic array. If array is sorted in descending order then it is known as order agnostic array.
	 * The question is how to identify ? if array[start] > array[end]
	 */

	public static void main(String[] args) {
		int[] arr = {45,30,20,19,18,14,13,12,11,8,5,3,1};
		int target = 10;
		int result = orderAgnosticBinarySearch(arr, target);
		System.out.println("Target is found at index : " + result);
	}
	
	static int orderAgnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAscend = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) 
				return mid;
			
			if(isAscend) {
				if(target > arr[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid -1 ;
				}else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
