package com.company.lovebabar.graph;

import java.util.ArrayList;

public class CycleDetection {

    static int visitedNode[];
    public static void main(String args[])
    {
        visitedNode = new int[5];
        int v = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> adjList1 = new ArrayList<>();
        ArrayList<Integer> adjList2 = new ArrayList<>();
        ArrayList<Integer> adjList3 = new ArrayList<>();
        ArrayList<Integer> adjList4 = new ArrayList<>();
        ArrayList<Integer> adjList5 = new ArrayList<>();



        adjList1.add(1);

        adjList2.add(0);
        adjList2.add(2);
        adjList2.add(4);

        adjList3.add(1);
        adjList3.add(3);

        adjList4.add(2);
        adjList4.add(4);

        adjList5.add(1);
        adjList5.add(3);

        adjList.add(adjList1);

        adjList.add(adjList2);

        adjList.add(adjList3);

        adjList.add(adjList4);

        adjList.add(adjList5);



        visitedNode[0] = 1;
        System.out.print(0);
        System.out.print("Is Cycle Present");
        for (int i=0;i<v;i++)
        {
            //System.out.print(0);

            if (visitedNode[i]==0)
            travrseGraph(adjList,0);
        }


    }


    static boolean isCyclePresent(int v,ArrayList<ArrayList<Integer>> adjList)
    {
boolean isCyclePresent = false;
visitedNode = new int[v];
for (int i=0;i<v;i++)
{

    travrseGraph(adjList,0);
}


return isCyclePresent;
    }


    static boolean travrseGraph(ArrayList<ArrayList<Integer>> adjList,int parent)
    {
boolean isCycleDetected = false;
for (int item : adjList.get(parent))
{

    //int node = item.get(0);
    if (visitedNode[parent]==1&&visitedNode[item]==1)
        return true;
    if (visitedNode[item]==0)
    {System.out.print(item);
        visitedNode[item] = 1;
       isCycleDetected =  travrseGraph(adjList,item);
    }

}
return isCycleDetected;
    }

}
