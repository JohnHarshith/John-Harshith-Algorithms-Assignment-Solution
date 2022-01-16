package com.greatlearning.operations;

public class Details {
    private int noOfCompanies;
    private double[] arr;
    private boolean[] arr2;
    public Details(int noOfCompanies, double[] arr, boolean[] arr2) {
        this.noOfCompanies = noOfCompanies;
        this.arr = arr;
        this.arr2 = arr2;
    }
    public void setNoOfCompanies(int noOfCompanies) {
        this.noOfCompanies = noOfCompanies;
    }
    public int getNoOfCompanies() {
        return this.noOfCompanies;
    }
    public void setArr(double[] arr)  {
        this.arr = arr;
    }
    public double[] getArr() {
        return this.arr;
    }
    public void setArr2(boolean[] arr2)  {
        this.arr2 = arr2;
    }
    public boolean[] getArr2() {
        return this.arr2;
    }
}
