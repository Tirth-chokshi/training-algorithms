import java.util.*;

public class Searching{
	public static void main(String args[]){
		int arr [] = {4,46,23,6,9,77};
        int target = 6;
        System.out.println(linear(arr,target));
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
	
}