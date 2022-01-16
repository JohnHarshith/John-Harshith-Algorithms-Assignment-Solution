package com.greatlearning.driver;

import com.greatlearning.operations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter the no of companies");
        int noOfCompanies = sc.nextInt();
        double arr[] = new double[noOfCompanies];
        boolean arr2[] = new boolean[noOfCompanies];
        for(int i=0; i<noOfCompanies; i++) {
            System.out.println("Enter current stock price of the company " + (i+1));
            arr[i] = sc.nextDouble();
            System.out.println("Whether company's stock price rose today compare to yesterday?");
            arr2[i] = sc.nextBoolean();
        }
        Details details = new Details(noOfCompanies, arr, arr2);
        int choice = 0;
        do {
            System.out.println("\n-----------------------------------");
            System.out.println("Enter the operation that you want to perform");
            System.out.println("1. Display the companies stock prices in ascending order");
            System.out.println("2. Display the companies stock prices in descending order");
            System.out.println("3. Display the total no of companies for which stock prices rose today");
            System.out.println("4. Display the total no of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("6. press 0 to exit");
            System.out.println("-----------------------------------");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    AscendingOrder.sort(details.getArr());
                    break;
                case 2:
                    DescendingOrder.sort(details.getArr());
                    break;
                case 3:
                    int rise = StocksRise.rose(details.getArr2());
                    System.out.println("Total no of companies whose stock price rose today : " + rise);
                    break;
                case 4:
                    int decline = StocksDecline.decline(details.getArr2());
                    System.out.println("Total no of companies whose stock price declined today : " + decline);
                    break;
                case 5:
                    System.out.println("enter the key value");
                    double key = sc.nextDouble();
                    SearchStock.search(details.getArr(), key);
                    break;
                case 0:
                    System.out.println("Exited successfully");
                    break;
                default: 
                    System.out.println("Invalid choice, please try again");
            }
        } while(choice != 0);
        System.out.println();
    }
}