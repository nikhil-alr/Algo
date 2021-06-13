package com.company.lovebabar.Heap;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SubarrayMax {


    public static void main(String args[])
    {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        max_of_subarrays(arr,9,3);
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
            pq.add(arr[i]);

       int start = 0;
       int end = k-1;

        while (end<n)
        {
            list.add(pq.peek());

            //System.out.println(pq.poll());
           start+=1;
            end+=1;
            if(end==n)
                break;
            pq.add(arr[end]);
        }

        //System.out.println(pq.poll());
        //list.add(pq.poll());
        //pq.clear();


        return list;
    }

}
