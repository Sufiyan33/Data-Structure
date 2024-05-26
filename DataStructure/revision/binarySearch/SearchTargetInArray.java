package binarySearch;

public class SearchTargetInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int target = 10;
		
		int result = binarySearch(arr, target);
		System.out.println("target is found at index : " + result);
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		if (arr.length == 0)
			return -1;
		
		while(start<= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] ==  target)
				return mid;
			
			if(target > arr[mid]) {
				start = mid +1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
