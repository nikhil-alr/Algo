package com.company.lovebabar.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StronglyConnected {

   public static void main(String args[])
   {

   }


    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<ArrayList<Integer>> rAdj = new ArrayList<>();
for (int i=0;i<V;i++)
{
    rAdj.add(new ArrayList<Integer>());
}

        for (ArrayList<Integer> list:adj)
        {
           for (int i=0;i<list.size();i++)
           {
               rAdj.get(list.get(i)).add(i);
           }
        }



        int stronglyConnected = 0;
        //code here
        boolean visitedNode[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        dfs(0,-1,adj,visitedNode,stack);

        visitedNode = new boolean[V];
        while (!stack.isEmpty())
        {
            int node = stack.pop();
            if(!visitedNode[node])
            {
                dfs(node,-1,rAdj,visitedNode,new Stack<>());
                stronglyConnected+=1;
            }

        }

        return stronglyConnected;
    }

    public void dfs(int node,int parent, ArrayList<ArrayList<Integer>> adj, boolean[]visitedNode, Stack<Integer> stack)
    {
     if(visitedNode[node])
         return;

     visitedNode[node] = true;

        List<Integer> nbrs = adj.get(node);

        for (int nbr:nbrs)
        {
          dfs(nbr,node,adj,visitedNode,stack);

        }
        nbrs.clear();
        stack.push(node);
        adj.get(node).add(parent);

    }


}
