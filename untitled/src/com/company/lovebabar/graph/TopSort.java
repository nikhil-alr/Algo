package com.company.lovebabar.graph;

import java.util.*;

public class TopSort {


    public static void main(String args[])
    {
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
list.add(new ArrayList<>());
ArrayList<Integer> subList = new ArrayList<>();
        subList.add(0);
        list.add(subList);
        list.add(subList);
        list.add(subList);
        System.out.print(list);

        topSort2(4,list);
    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int [] topSort = new int[adj.size()];
        boolean [] visitedNode = new boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();


        for(int i=0;i<V;i++)
        {
            if(!visitedNode[i])
                travrseInDfs(i,visitedNode,stack,adj);

        }

        int arrayIndex = 0;
        while (!stack.isEmpty())
        {
            topSort[arrayIndex] = stack.pop();
arrayIndex+=1;
        }
        return topSort;
        // add your code here
    }

    static void travrseInDfs(int node, boolean[] vistedNode, Stack<Integer> stack,ArrayList<ArrayList<Integer>> adj)
    {

        if(vistedNode[node])
        {
            //stack.clear();
            return;
        }



        List<Integer> nbrNodes = adj.get(node);
            vistedNode[node] = true;

        for (Integer nbrNode:nbrNodes)
        {
            travrseInDfs(nbrNode,vistedNode,stack,adj);
        }

        stack.push(node);
        System.out.print("");
    }

    static int[] topSort2(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int [] topSort = new int[adj.size()];
        int inDegree[] = new int[V];
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i=0;i<V;i++)
        {
            for (int nbrNode:adj.get(i))
            {
                inDegree[nbrNode]+=1;
            }
        }

        for (int i=0;i< inDegree.length;i++)
        {
            if(inDegree[i]==0)
                queue.add(i);
        }

        int arrayIndex = 0;
        while (!queue.isEmpty())
        {
            Integer node = queue.poll();
            topSort[arrayIndex] = node;
            for (int nbrNode:adj.get(node))
            {
                inDegree[nbrNode]-=1;
                if(inDegree[nbrNode]==0)
                    queue.add(nbrNode);
            }
            arrayIndex+=1;


        }

        return topSort;

    }





}
