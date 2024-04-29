package SortingAlogrithms;

import java.util.Arrays;

public class AIOsort {
    public static void main(String[] args) {
        int num [] = {3,21,45,23,69,2,0};
        int num2[] = {5,2,3,0,1};
//        bubble(num);
//        selectionMin(num);
        //insertion(num2);
		//mergSort(num2);
		//quicksort(num,0,num.length-1);
        System.out.println(Arrays.toString(num2));
    }
    static void insertionSort(int arr[])
    {
        int len = arr.length;
        for (int i = 1; i < len; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void insertion( int arr[]){
        for (int i= 0; i< arr.length-1; i++){
            for (int j = i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
    static void selectionMax(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = 0;
            for (int j = 0; j < last; j++) {
                if (arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
    static void selectionMin(int arr [] ){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1 ; j < arr.length;j++){
                if (arr[j] < arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void bubble(int arr[]){
        for(int i = 0; i< arr.length; i++){
            //to place the largest element in the last position on of array
            for(int j =1; j< arr.length - i; j++){
                //swap if item is smaller than the previous one
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
	
	static void quicksort(int arr[] , int low , int high){
		if(low >= high){
			return;
		}
		int s = low;
		int e = high;
		int m = s+(e-s)/2;
		int pivot = arr[m];
		
		while(s<=e){
			while(arr[s] < pivot){
				s++;
			}
			while(arr[e] > pivot){
				e--;
			}
			if(s <=e ){
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
			}
		}
		
		quicksort(arr, low,e);
		quicksort(arr, s, high);
	}
	
	
	static void mergSort(int arr[]){
		int len = arr.length;
		if(len <=1){return ;}
		int middle = len/2;
		int [] leftArr = new int[middle];
		int [] rightArr = new int[len - middle];
		
		int i = 0; //left
		int j = 0; //right
		
		for(; i< len; i++){
			if(i<middle){
				leftArr[i] = arr[i];
			}
			else{
				rightArr[j] = arr[i];
				j++;
			}
		}
		mergSort(leftArr);
		mergSort(rightArr);
		merge(leftArr,rightArr,arr);
	}
	static void merge(int [] leftArr, int [] rightArr , int []arr){
		int leftSize = arr.length/2;
		int rightSize = arr.length - leftSize;
		int i = 0 , l = 0 , r = 0;
		
		while(l<leftSize && r<rightSize){
			if(leftArr[l] < rightArr[r]){
				arr[i] = leftArr[l];
				i++;
				l++;
			}
			else{
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while(l<leftSize){
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		while(r<rightSize){
			arr[i] = rightArr[r];
			i++;
			r++;
		}
	}
}
