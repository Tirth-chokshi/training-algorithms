package SortingAlogrithms;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class AIOsort {
    public static void main(String[] args) {
        int num [] = {3,21,45,23,69,2,0};
        int num2[] = {5,2,3,0,1};
//        bubble(num);
//        selectionMin(num);
        insertion(num2);
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
    static void insertion(@NotNull int arr[]){
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
        boolean swapped;
        for(int i = 0; i< arr.length; i++){
            //to place the largest element in the last position on of array
            swapped = false;
            for(int j =1; j< arr.length - i; j++){
                //swap if item is smaller than the previous one
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
