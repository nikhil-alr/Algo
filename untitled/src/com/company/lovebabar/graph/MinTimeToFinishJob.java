package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinTimeToFinishJob {

    static ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();


    public static void main(String args[])
    {

        int n = 10;
        int m = 13;

        int[] inDegreeArray = new int[n+1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0;i<n+1;i++)
        {
            arrayLists.add(new ArrayList<>());
        }




        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(1, 5);
        addEdge(2, 3);
        addEdge(2, 8);
        addEdge(2, 9);
        addEdge(3, 6);
        addEdge(4, 6);
        addEdge(4, 8);
        addEdge(5, 8);
        addEdge(6, 7);
        addEdge(7, 8);
        addEdge(8, 10);

        System.out.print(arrayLists);

        for (List<Integer> nbrs:arrayLists)
        {
            for (Integer nbr:nbrs)
            {
                inDegreeArray[nbr]+=1;
            }
        }

        for (int i=1;i< inDegreeArray.length;i++)
        {
            if (inDegreeArray[i]==0)
                queue.add(i);

        }

        while (!queue.isEmpty())
        {
            int node = queue.poll();
            System.out.print(node);
            for (Integer integer:arrayLists.get(node))
            {
                inDegreeArray[integer]-=1;
                if(inDegreeArray[integer]==0)
                    queue.add(integer);
            }

        }

    }

    static void addEdge(int u,int v)
    {
        arrayLists.get(u).add(v);
    }

}
