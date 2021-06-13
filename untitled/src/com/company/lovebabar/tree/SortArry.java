package com.company.lovebabar.tree;

import com.company.adityavrma.dp.A;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArry {
    public static void main(String args[])
    {
        int N = 11;
        int M = 4;
        int A1[] = {2, 1};
        int A2[] = {2, 1, 8, 3};
System.out.print(sortA1ByA2(A1,N,A2,M));
    }

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        int index = 0;
       int ansArray[] = new int[N];
        int tempArray[] = new int[N];
        Arrays.sort(A1);
        for (int aVal:A1)
        {
            tempArray[aVal]+=1;
        }


        for (int a2Val:A2)
        {
            if(a2Val>= tempArray.length)
            continue;
            int end = tempArray[a2Val];
            int star= 0 ;
            for (int i=0;i< A1.length;i++)
            {
                if(A1[i]==a2Val)
                {
                    star = i;
                    break;
                }

            }

            for (int i=star;i<star+end;i++)
            {
                //System.out.print(A1[i]);
                ansArray[index]=A1[i];
                index+=1;
                A1[i] = -1;
            }
        }
        for (int i=0;i< A1.length;i++)
        {
           if (A1[i]>0)
           {
               ansArray[index]=A1[i];
               index+=1;
           }
               //System.out.print(A1[i]);

        }

        return ansArray;
    }
}
