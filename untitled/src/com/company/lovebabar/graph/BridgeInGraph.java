package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;
import java.util.List;

public class BridgeInGraph {

    public static void main(String args[])
    {

        int v = 5;
        int e = 5;

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i=0;i<v;i++)
        {
            arrayList.add(new ArrayList<>());
        }



        arrayList.get(1).add(0);
        arrayList.get(0).add(1);


        arrayList.get(0).add(2);
        arrayList.get(2).add(0);

        arrayList.get(1).add(2);
        arrayList.get(2).add(1);

        arrayList.get(0).add(3);
        arrayList.get(3).add(0);

        arrayList.get(3).add(4);
        arrayList.get(4).add(3);



        System.out.print(arrayList);
        printBridge(arrayList,v,e);

    }
    static int counter=0;
    static void printBridge(ArrayList<ArrayList<Integer>> adj,int v,int e)
    {
        boolean visiteDArray[] = new boolean[v];

int high[] = new int[v];
int low[] = new int[v];
        dfs(0,-1,adj,visiteDArray,high,low);


    }

   static void dfs(int node,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] visitedNode,int[]high,int low[])
    {

        if(visitedNode[node])
        {


                low[parent]=Math.min(low[node],high[parent]);

            return;
        }


        visitedNode[node] = true;


        List<Integer> nbrs = adj.get(node);
        counter+=1;
        high[node] = counter;
        low[node] = counter;
        for (Integer nbr:nbrs)
        {
        if(nbr!=parent)
        {


            dfs(nbr,node,adj,visitedNode,high,low);

            if(high[node]<low[nbr])
                System.out.println(node+""+nbr);
            else
                low[node]=Math.min(low[nbr],low[node]);

        }
        }


    }




}
