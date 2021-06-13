package com.company.lovebabar.Heap;

import com.company.adityavrma.dp.B;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinSum {


    public static void main(String args[])
    {

        int array[] = {6, 8, 4, 5, 2, 3};
        System.out.print(solve(array,6));

    }


    static String solve(int[] arr, int n) {


        Arrays.sort(arr);

        int i=0;
        int j=1;
        String s1="";
        String s2="";
        while (i<n&&j<n)
        {
            s1+=arr[i];
            s2+=arr[j];
            i+=2;
            j+=2;
        }

        BigInteger bigInteger1 = new BigInteger(s1);

        BigInteger bigInteger2 = new BigInteger(s2);


        return ""+bigInteger1.add(bigInteger2);
    }
}
