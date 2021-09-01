package com.company.geeks.events;

public class SwapNumber {

    public static void main(String args[])
    {

        int arr[] = {1,2,3,4,5};
        convertToWave(arr,10);
        System.out.print("");

    }

    public static void convertToWave(int arr[], int n){

        // Your code here
        for (int i=1;i<arr.length;i=i+2)
        {
            int tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }

    }

}
