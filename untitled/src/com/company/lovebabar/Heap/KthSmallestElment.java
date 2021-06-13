package com.company.lovebabar.Heap;

import java.util.PriorityQueue;

public class KthSmallestElment {

    public static void main(String args[])
    {

    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int itm:arr)
            pq.add(itm);

        int kthSmallest = 0;
        while (k>0)
        {
            kthSmallest = pq.poll();
            k-=1;
        }

        return kthSmallest;
    }

}
