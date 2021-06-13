package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KruskalMSP {

    static class EdgeInfo implements Comparable<EdgeInfo>
    {
        int start;
        int end;
        int weight;

        public EdgeInfo(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(EdgeInfo o) {
            if(weight<o.weight)
                return -1;
            if (weight>o.weight)
                return 1;


            return 0;
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        int parent[] = new int[V];

        boolean[] visitedNode = new boolean[V];
        PriorityQueue<EdgeInfo> pQ = new PriorityQueue<>();

        for (int i=0;i<V;i++)
            parent[i] = i;

        ArrayList<ArrayList> edges = new ArrayList<>();
        for (int i=0;i<E;i++)
        {
            ArrayList<Integer> edge = new ArrayList<>();
            for (int j=0;j<3;j++)
            {
                edge.add(sc.nextInt());
            }
            pQ.add(new EdgeInfo(edge.get(0),edge.get(1),edge.get(2)));
            edges.add(edge);
        }

        while (!pQ.isEmpty())
        {
            EdgeInfo edge = pQ.poll();
            if (isCyclePresent(edge.start, edge.end,parent))
                continue;
            if(edge.end<edge.start)
            {
                System.out.print(edge.end+" ");
                System.out.print(edge.start+" ");

            }
            else
            {
                System.out.print(edge.start+" ");
                System.out.print(edge.end+" ");
            }

            System.out.print(edge.weight);
            System.out.println("");
        }



        //System.out.print(edges);

    }

    static boolean isCyclePresent(int start,int end,int[] parent)
    {

        int setA = findSet(start,parent);
        int setB = findSet(end,parent);

        if (setA==setB)
            return true;

        union(setA,setB,parent);


        return false;
    }

     static int findSet(int node,int[] parent)
    {
        int set = 0;
        while (true)
        {
            set = parent[node];
            if(set==node)
                break;
            node =  set;
        }
        return set;
    }

    static void union(int a,int b,int parent[])
    {
        parent[b] = a;
    }

}
