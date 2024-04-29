import java.util.*;

public class Searching{
	public static void main(String args[]){
		int arr [] = {4,46,23,6,9,77};
        int target = 6;
        //System.out.println(linear(arr,target));
		Arrays.sort(arr);
		System.out.println(binary(arr,target));
	}
	
	static int linear(int arr[] , int target){
		if(arr.length == 0){return -1;}
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return-1;
	}
	static int binary(int arr[],int target){
		if(arr.length == 0){return-1;}
		int start = 0;
		int end = arr.length-1;
		
		while(start<= end){
			int mid = start + (end - start) /2;
			
			if(target <arr[mid]){
				end = mid-1;
			}
			else if (target > arr[mid]){
				start = mid+1;
			}
			else{
				return mid;
			}
		}
		return-1;
	}
}