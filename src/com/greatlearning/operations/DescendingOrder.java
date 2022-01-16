package com.greatlearning.operations;

public class DescendingOrder {
    public static void sort(double[] arr) {
        doMergeSort(arr,0,arr.length-1);
        System.out.println("Stock prices in descending order are :");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void doMergeSort(double[] arr,int low,int high) {
        if(low<high) {
            int mid = (low+high)/2;
            doMergeSort(arr,low,mid);
            doMergeSort(arr,mid+1,high);
            mergeElements(arr,low,mid,high);
        }
    }
    private static void mergeElements(double[] arr,int low,int mid,int high) {
        int leftArraySize = mid-low+1;
        int rightArraySize = high-mid;
        double[] leftArray = new double[leftArraySize];
        double[] rightArray = new double[rightArraySize];
        for(int i=0;i<leftArraySize;i++) {
            leftArray[i] = arr[low+i];
        }
        for(int i=0;i<rightArraySize;i++) {
            rightArray[i] = arr[mid+1+i];
        }
        int i=0,j=0;
        int k = low;
        while(i<leftArraySize && j<rightArraySize) {
            if(leftArray[i]>=rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
