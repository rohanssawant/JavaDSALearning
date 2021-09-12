package com.rohan;

public class OrderAgnosticBS {
	public static void main(String[] args) {
//		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr={89,45,22,18,16,15};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
	}

	static int orderAgnosticBS(int[] arr, int target){
		int start =0;
		int end = arr.length-1;

// check if asc or desc
		boolean isAsc;
		if(arr[start]<arr[end]){
			isAsc=true;
		}
		else{
			isAsc=false;
		}

		while (start <= end) {
			
			int mid = start + (end-start)/2;

			if(target == arr[mid]){
				return mid;
			}


			if(isAsc){


            if(target > arr[mid]){
                start = mid+1;
            }

            else if(target < arr[mid]){
                end = mid-1;
            }

			}
			else {

            if(target < arr[mid]){
                start = mid+1;
            }

            else if(target > arr[mid]){
                end = mid-1;
            }
			}

		}

return -1;

	}
}
