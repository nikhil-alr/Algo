package com.company.lovebabar.graph;

public class BelmenFordAlgo {

    public static void main(String args[])
    {
        int edges[][] = {{0,2,-6},
                {1,0,0},
                {1,2,7},
                {2,1,9}};
System.out.print(isNegativeCyclePresent(3,edges));
    }

    static boolean isNegativeCyclePresent(int n,int[][]edges)
    {
        int [] vertex = new int[n];
        for (int i=0;i<n;i++)
            vertex[i] = Integer.MAX_VALUE;


        vertex[edges[0][0]] = 0;

        for (int i=0;i<n-1;i++)
        {
            for (int edge[]:edges)
            {
                if(vertex[edge[0]]!=Integer.MAX_VALUE)
                {
                    if(vertex[edge[1]] > vertex[edge[0]]+edge[2])
                        vertex[edge[1]] = vertex[edge[0]]+edge[2];
                }
            }
        }

        for (int edge[]:edges)
        {
            if(vertex[edge[1]] > vertex[edge[0]]+edge[2])
               return true;
        }

        return false;
    }


}
