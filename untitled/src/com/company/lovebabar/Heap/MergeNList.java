package com.company.lovebabar.Heap;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MergeNList {

    public static void main(String args[])
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
       ArrayList<Integer> list =  mergeKArrays(arr,3);
       System.out.print(list);
    }


    static class Pair implements Comparable<Pair>
    {
        int data;
        int row;
        int col;

        public Pair(int data, int row) {
            this.data = data;
            this.row = row;
        }

        @Override
        public int compareTo(Pair o) {
            if (o.data>data)
                return 1;
            if (o.data<data)
                return -1;


            return 0;
        }
    }

    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> ansList = new ArrayList<>();

        for (int i=0;i< arr.length;i++)
        {

            for (int j=0;j< arr[i].length;j++)
              priorityQueue.add(arr[i][j]);
        }

        while (!priorityQueue.isEmpty())
        {
            ansList.add(priorityQueue.poll());

        }


return ansList;
    }

}
