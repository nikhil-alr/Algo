package com.company.lovebabar.Heap;

import java.util.PriorityQueue;

public class RopeJoin {

    long minCost(long arr[], int n)
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ropeOne = 0;
        long ropeTwo = 0;
        long totalCost = 0;
        for (long item:arr)
        {
            pq.add(item);

        }

        while (!pq.isEmpty())
        {
            ropeOne = pq.poll();
            ropeTwo = pq.poll();
            long newRope = ropeOne+ropeTwo;
            totalCost+=newRope;
            if (!pq.isEmpty())
                pq.add(newRope);
        }

        return totalCost;
    }

}
