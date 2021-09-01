package com.company.lovebabar.sorting;

import java.util.Arrays;
import java.util.Collections;

public class MissingRepeating {


    public static  void main(String args[])
    {
        int a = 0;
for (int i=0;i<=1000000000;i++)
{
a = i+1;
}

System.out.print(a);

    }

    int[] findTwoElement(int arr[], int n) {

        int totalSum = 0;
        int max = 0;

        int ans[] = new int[2];

        for (int i=0;i<n;i++)
        {
            totalSum+=arr[i];
        }

        for (int i=0;i<n;i++)
        {
            if(max<arr[i])
                max = arr[i];
        }

        int actualAns = (max*(max+1))/2;

            return ans;
    }




}
