package com.company.hackerearth.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SupremSubset {

    public static void main(String args[])
    {
        System.out.println("Supreme Subset");


        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int value = scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            array[i] = scanner.nextInt();
        }
        supremeSubsetUsingBrute(array,value);




    }

//    static int[] getSupremSubset(int array[],int value)
//    {
//        Arrays.sort(array);
//        int [] supremeSubset = new int[2];
//        int minValue = Integer.MAX_VALUE;
//
//        int i = 0;
//        int j = array.length-1;
//        while (i<j)
//        {
//           if(array[i]==-1)
//           {
//               i+=1;
//               continue;
//           }
//            if(array[j]==-1)
//            {
//                j-=1;
//                continue;
//            }
//            if(Math.abs(array[i]-array[j])%value>1)
//           {
//              i+=1;
//           }
//            if(Math.abs(array[i]-array[j])/value<1)
//            {
//                j-=1;
//            }
//            else
//            {
//                System.out.println(array[i]+"MATCHED"+array[j]);
//                array[i] = -1;
//                array[j] = -1;
//
////                //if(j-i<minValue)
////                {
////                    supremeSubset[0] = i;
////                    supremeSubset[1] = j;
////
////                }
//
//               i = 0;
//               j = array.length-1;
//
//            }
//
//        }
//
//        return supremeSubset;
//    }



    static void supremeSubsetUsingBrute(int array[],int value)
    {
        int ansi = -1;
        int ansj = -1;
        Arrays.sort(array);
        int totalCount = 0;
for (int i=0;i< array.length;i++)
{
    for (int j=i+1;j<array.length;j++)
    {
        if ((array[j]- array[i])%value==0)
        {

            if (ansi<0)
            {
                ansi = array[i];
                ansj = array[j];
            }

            totalCount+=1;


        }
    }
}

System.out.println(totalCount);
System.out.print(ansi+" "+ansj);
    }


}
