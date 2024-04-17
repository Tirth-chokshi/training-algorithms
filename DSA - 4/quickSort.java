package SortingAlogrithms;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {3,34,-31,3,6,02,3};
        int num[] = {5,4,3,2,1};
//        quick(num,0,arr.length-1);
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
    static void quick(int arr[], int low , int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while (s <= e){
            while (arr[e] > pivot){
                // if this condition is true then only swap
                if (s<= e){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++; e--;
                }
            }
        }
        quick(arr, low,e);
        quick(arr, s, hi);
    }
}