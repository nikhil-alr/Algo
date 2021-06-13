package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.List;

public class ConnectComputer {

    public static void main(String args[])
    {
        int v = 6;
        int[][] edge = {{0,1},{0,2},{0,3},{1,2}};
        makeConnected(6,edge);
    }

   static public int makeConnected(int n, int[][] connections) {
        int operaton = -1;

        if(n<=1)
            return 0;
        if (connections.length==0)
            return -1;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        boolean[] visitedNode = new boolean[n];
//BuildGraph

        for (int i=0;i<n;i++)
        {
            ArrayList<Integer> nbrList= new ArrayList<>();
            adjList.add(nbrList);
        }

        for (int[] edge:connections)
        {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        int totalNetwork = 0;
        for (int i=0;i<adjList.size();i++)
        {
            if (!visitedNode[i])
            {
                traverseInDfs(i,-1,visitedNode,adjList);
                totalNetwork+=1;
            }
        }

        if(totalNetwork>1)
        {
            System.out.println(connections.length);
            System.out.println(totalNetwork);

            if (connections.length>=totalNetwork-1)
                operaton = totalNetwork-1;
        }

        return operaton;
    }

    static void traverseInDfs(int node,int parent,boolean[]visitedNode,ArrayList<ArrayList<Integer>> adjList)
    {
        if(visitedNode[node])
            return;

        visitedNode[node] = true;

        List<Integer> nbrList = adjList.get(node);
        for (int nodee:nbrList)
        {
            if(nodee!=node)
                traverseInDfs(nodee,node,visitedNode,adjList);
        }

    }


}
