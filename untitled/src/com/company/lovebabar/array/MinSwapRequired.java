package com.company.lovebabar.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinSwapRequired {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test>0)
        {

           int n = scanner.nextInt();
           int array[] = new int[n];
           for (int i=0;i<array.length;i++)
           {
               array[i] = scanner.nextInt();
           }
           int x = scanner.nextInt();

            int windwoSize = 0;

            for (int item:array)
            {
                if (item<=x)
                    windwoSize+=1;
            }

            int swapCount = 0;
            for (int i=0;i<windwoSize;i++)
            {
                if(array[i]>x)
                    swapCount+=1;
            }

int ans = swapCount;
            for (int i=windwoSize;i<array.length;i++)
            {
                if (array[i]<=x)
                    swapCount-=1;
  if (array[i-windwoSize]<=x)
    swapCount+=1;


                if (ans>swapCount)
     ans = swapCount;
            }

            if (ans<0)
                ans = 0;
            System.out.println(ans);

            test-=1;
        }

    }


}
