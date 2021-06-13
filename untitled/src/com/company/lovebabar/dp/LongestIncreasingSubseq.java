package com.company.lovebabar.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestIncreasingSubseq {

    public static void main(String args[])
    {
        System.out.print("LIS");
        int array[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int sortedArray[] = new int[array.length];
        int sortedArrayIndex = 0;
        sortedArray[0] = array[0];
        for (int i=1;i<array.length;i++)
        {
            if (sortedArray[sortedArrayIndex]<array[i])
            {
                sortedArrayIndex+=1;
                sortedArray[sortedArrayIndex] = array[i];
            }
            else
            {
                int left = 0;
                int right = sortedArrayIndex;
                int mid = 0;
                while (true)
                {
                    if (array[i]==sortedArray[mid])
                    {
                        sortedArray[mid] = array[i];
                        break;
                    }

                    if (array[i]<sortedArray[mid])
                    {
                        right = mid-1;
                    }
                    else
                    {
                        left = mid+1;
                    }

                    if (left>right)
                        break;
                    mid = (left+right)/2;

                }

                sortedArray[mid] = array[i];
                //int index = Arrays.binarySearch(sortedArray, array[i]);
            }


        }



        System.out.print(sortedArrayIndex+1);

    }


}
