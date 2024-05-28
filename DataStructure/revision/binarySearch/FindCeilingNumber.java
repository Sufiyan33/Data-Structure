package binarySearch;

public class FindCeilingNumber {

	/*
	 * Ceiling number is smallest number which is greater than or equal to target element.
	 */
	public static void main(String[] args) {
		int arr []= {1,12,13,14,18,20,21,24};
		int target = 25;
		
		int index  = ceilingNumber(arr, target);
		if(index == -1) {
			System.out.println("Ceiling number is not found");
		}else {
			System.out.println("Ceiling number at index :: " + index);	
		}
	}
	
	static int ceilingNumber(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		if(arr.length == 0)
			return -1;
		
		if(target > arr[end])
			return -1;
		
		while(start<= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target)
				return arr[mid];
			
			if(target > arr[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			
			// if s > e it means condition will break and that is our ceiling number.
		}
		return arr[start];
	}
}
