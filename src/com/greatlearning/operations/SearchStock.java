package com.greatlearning.operations;

public class SearchStock {
    public static void search(double[] arr, double key) {
        AscendingOrder.doMergeSort(arr,0,arr.length-1);
        int index = binarySearch(arr,0,arr.length-1,key);
        if(index != -1)
            System.out.println("Stock of value " + key + " is present");
        else
            System.out.println("Value not found");
    }
    private static int binarySearch(double[] arr,int low,int high,double key) {
        if(high<low) {
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == key) {
            return mid;
        } else if(arr[mid] < key) {
            return binarySearch(arr,mid+1,high,key);
        } else {
            return binarySearch(arr,low,mid-1,key);
        }
    }
}
