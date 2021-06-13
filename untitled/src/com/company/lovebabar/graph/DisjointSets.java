package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisjointSets {



    public static void main(String args[])
    {

        int parentArray[] = new int[5+1];
        ArrayList<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(3,1));
        edges.add(Arrays.asList(2,3));
        edges.add(Arrays.asList(5,4));
        edges.add(Arrays.asList(2,5));


        for (List<Integer> edge:edges)
        {
            buildDisjointSet(edge.get(0),edge.get(1),parentArray);
        }

        //System.out.print(getSet(4,parentArray));



    }

    static void buildDisjointSet(int start,int end,int parentArray[])
    {

        int count = parentArray[end];
      parentArray[end] = start;
      parentArray[start] += count-1;

    }


    static void union(int node1,int node2,int parentArray[])
    {

    }






}
