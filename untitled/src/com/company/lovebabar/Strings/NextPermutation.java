package com.company.lovebabar.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 6, 5, 4};

        List list = nextPermutation(arr.length,arr);
    }

    static List<Integer> nextPermutation(int N, int arr[]){

        List<Integer> list = new ArrayList<Integer>();

        int firstValIndex = -1;
        int secondValIndex = 0;

        for (int i=N-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                firstValIndex = i;
                break;
            }

        }

        if(firstValIndex==-1)
        {
            for (int item:arr)
                list.add(item);
 Collections.sort(list);
 return list;

        }

        for (int i=N-1;i>=0;i--)
        {
            if (arr[firstValIndex]< arr[i])
            {
                secondValIndex = i;
                break;

            }
        }

        int tmp = arr[firstValIndex];
        arr[firstValIndex] = arr[secondValIndex];
        arr[secondValIndex] = tmp;

        int i = firstValIndex+1;
        int j = N-1;

        while (i<=j)
        {

            int tmpVal = arr[i];
            arr[i] = arr[j];
            arr[j] = tmpVal;
            i+=1;
            j-=1;
        }


        for (int item:arr)
            list.add(item);

        return list;
    }

}
