package com.greatlearning.operations;

public class StocksDecline {
    public static int decline(boolean[] arr2) {
        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(arr2[i] == false) {
                count++;
            }
        }
        return count;
    }
}
