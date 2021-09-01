package com.company.lovebabar.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {

    public static void main(String args[])
    {
        int a = 3;
        int array[] = {2,1,2};
System.out.print(secondLargest(a,array));
    }

//    static int secondLargest(int n,int array[])
//    {
//        int secondLargest = 0;
//
//        Arrays.sort(array);
//        int firstLargest = array[n-1];
//        for (int i=n-2;i>=0;i--)
//        {
//if (firstLargest!=array[i])
//    secondLargest = array[i];
//        }
//
//        return secondLargest;
//    }

    static int secondLargest(int n,int array[])
    {
        int ans = -1;
int slargest = -1;
        int largest = slargest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++)
        {
            largest = Math.max(largest, array[i]);
        }

        for(int i = 0; i < array.length; i++)
        {
            if (array[i] != largest)
                slargest = Math.max(slargest, array[i]);
        }
        if (slargest == Integer.MIN_VALUE)
           ans = -1;
        else
            ans = slargest;

        return ans;
    }


}
