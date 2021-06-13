package com.company.lovebabar.graph;

import java.util.ArrayList;
import java.util.List;

public class BipartateGraph {

    static void main(String args[])
    {

    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int colorRequirement = 0;
        int availColo[] = new int[V];
        int nodeColor[] = new int[V];

        for (int i=0;i<V;i++)
        {
           for (Integer node:adj.get(i))
           {
               //nodeColor[node];
           }
        }

        return true;
    }

}
