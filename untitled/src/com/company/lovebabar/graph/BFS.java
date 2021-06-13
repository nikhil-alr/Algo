package com.company.lovebabar.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    static int visitedNode[];

    public static void main(String args[])
    {
        System.out.print("HELLO");
        ArrayList<ArrayList<Integer>> mlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        mlist.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        mlist.add(list3);
        list3.add(4);
        ArrayList<Integer> list4 = new ArrayList<>();
        mlist.add(list4);
        visitedNode = new int[5];
        bfsOfGraph(5,mlist);



    }


    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        visitedNode = new int[V];
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        travrseGraph(0,queue,adj,bfs);

        return bfs;

    }


    public static void travrseGraph(int nodPos,Queue<Integer> queue,ArrayList bfs,ArrayList list2)
    {
        visitedNode[nodPos] = 1;
        if (bfs.size()<nodPos)
        {
            ArrayList<Integer> list  = (ArrayList<Integer>) bfs.get(nodPos);
            list2.add(nodPos);

            for (Integer item:list)
            {
                if (visitedNode[item]==0)
                {
                    //travrseGraph(item,queue,bfs);
                    queue.add(item);
                }
            }

            if (queue.size()>0)
            {

                int newNodePos = queue.poll();
                travrseGraph(newNodePos,queue,bfs,list2);
            }
        }


    }
}
