package com.company.lovebabar.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MergeTwoHeap {

    public static void main(String args[])
    {
        long a[] = {10,5,6,2};
        long b[] = {12,7,9};

        long merged[] = new long[a.length+b.length];

        maxProfit(merged,a,b,a.length,b.length);
    }
    static public void maxProfit(long merged[], long a[], long b[], long n, long m) {

    int i=0;
    for (long item:a)
    {
        merged[i] = item;
        i+=1;
    }


        for (long item:b)
        {
            merged[i] = item;
            i+=1;
        }

        int idx = (merged.length/2)-1;

        for(int j=idx;j>=0;j--)
        heapyphi(merged,j);
    }


    static void heapyphi(long array[],int idx)
    {
        int left = 2*idx+1;
        int right = 2*idx+2;
        int largest = idx;

       if(left<array.length&&array[left]>array[largest])
       {
           largest = left;
       }
       if(right<array.length&&array[right]>array[largest])
       {
           largest = right;
       }

       if(largest!=idx)
       {
           long tmp = array[idx];
           array[idx] = array[largest];
           array[largest] = tmp;
           heapyphi(array,largest);
       }

    }



}
