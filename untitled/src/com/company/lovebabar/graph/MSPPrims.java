package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.lang.reflect.Array;
import java.util.*;

public class MSPPrims {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();



        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i=0;i<E;i++)
        {
            ArrayList<Integer> edge = new ArrayList<>();
            for (int j=0;j<3;j++)
            {
                edge.add(sc.nextInt());
            }
            edges.add(edge);
        }


        getMsp(V,E,edges);
    }

    static class Vertex implements Comparable<Vertex>
    {
        int weight;
        int vertice;
        int nbr;

        Vertex(int vertice,int nbr,int weight)
        {
            this.weight = weight;
            this.vertice = vertice;
            this.nbr = nbr;
        }

        @Override
        public int compareTo(Vertex o) {
            if(weight==o.weight)
                return 0;
            if (weight>o.weight)
                return 1;

            return -1;
        }
    }

    static ArrayList<ArrayList<Integer>> getMsp(int n, int m, ArrayList<ArrayList<Integer>> g) {

        ArrayList<ArrayList<Integer>> mspList = new ArrayList<>();
        Map<String,ArrayList<Integer>> edgeMap = new HashMap<>();




       boolean vistedNode[] = new boolean[n+1];

       PriorityQueue<Vertex> pq = new PriorityQueue<>();
       pq.add(new Vertex(1,-1,0));


       while (!pq.isEmpty())
       {
           Vertex v = pq.poll();
           if(vistedNode[v.vertice])
               continue;


           if(v.weight>0)
           {
               ArrayList<Integer> mspedge = new ArrayList<>();

               mspedge.add(v.vertice);
               mspedge.add(v.nbr);
               mspedge.add(v.weight);
               mspList.add(mspedge);
           }
           vistedNode[v.vertice] = true;

           for (ArrayList<Integer> edge:g)
           {
               if(edge.get(0)== v.vertice&&!vistedNode[v.vertice])
               {
                  if(edge.get(1)==edge.get(0))
                      continue;
                   pq.add(new Vertex(edge.get(1), edge.get(0), edge.get(2)));
               }

               if(edge.get(1)== v.vertice&&!vistedNode[v.vertice])
               {
                   if(edge.get(1)==edge.get(0))
                       continue;
                   pq.add(new Vertex(edge.get(0), edge.get(1), edge.get(2)));
               }


           }

       }


       System.out.print(mspList);
        return mspList;


    }


}
