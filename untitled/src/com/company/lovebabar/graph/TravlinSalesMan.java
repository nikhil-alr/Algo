package com.company.lovebabar.graph;

public class TravlinSalesMan {

    static int weight = Integer.MAX_VALUE;

    public static void main(String args[])
    {
        int distance[][]={{0,20,42,25},{20,0,30,34},
        {42,30,0,10},
    {25,34,10,0}};
        System.out.print(shortestRoute(distance));
    }

    public static int shortestRoute(int[][] distance) {
        // Write your code here
        boolean visitedNode[] = new boolean[distance.length];
        traverseInDfs(0,-1,visitedNode,0,distance);
        return weight;
    }

static void traverseInDfs(int node,int parent,boolean[]visitedNode,int distance,int[][]graph)
{

    if(visitedNode[node])
    {
        if(node==0)
        {
         for (boolean isNodeVisited:visitedNode)
         {
             if (!isNodeVisited)
                 return;
         }
            if (weight>distance)
                weight = distance;
        }
        return;
    }


    visitedNode[node] = true;

    for (int i=0;i< graph.length;i++)
    {
        if (i==node)
            continue;

        if (i==parent)
            continue;

        distance+= graph[node][i];
        traverseInDfs(i,node,visitedNode,distance,graph);
        distance-= graph[node][i];
    }

    visitedNode[node] = false;
}



}
