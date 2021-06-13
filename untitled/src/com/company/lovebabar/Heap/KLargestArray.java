package com.company.lovebabar.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestArray {

    int[] kLargest(int[] arr, int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for (int item:arr)
            pq.add(item);
        int index = 0;
        while (index<=k)
        {
            arr[index] = pq.poll();

            index+=1;
        }

        return arr;
    }

}
