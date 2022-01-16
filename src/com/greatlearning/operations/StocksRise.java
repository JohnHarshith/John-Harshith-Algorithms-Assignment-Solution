package com.greatlearning.operations;

public class StocksRise {
    public static int rose(boolean[] arr2) {
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(arr2[i] == true) {
                count++;
            }
        }
        return count;
    }
}
