package com.company.lovebabar.graph;


import java.util.*;

public class DigkstraAlgo {


    static class Edge implements Comparable<Edge>
    {
        int src = 0;
        int des = 0;
        int weight = 0;

        Edge(int src,int des,int weight)
        {
            this.src = src;
            this.des = des;
            this.weight = weight;
        }



        @Override
        public int compareTo(Edge o) {
            if(weight==o.weight)
                return 0;
            if(weight>o.weight)
                return 1;
            if(weight<o.weight)
                return -1;

           return 0;
        }
    }

    static class Vertex implements Comparable<Vertex>
    {
        int weight = Integer.MAX_VALUE;
        int vertex = 0;
        int nbr;

        Vertex(int weight,int vertex)
        {
            this.weight = weight;
            this.vertex = vertex;

        }

        @Override
        public int compareTo(Vertex o) {
            if(weight==o.weight)
                return 0;
            if(weight>o.weight)
                return 1;
            if(weight<o.weight)
                return -1;

            return 0;
        }
    }




    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int test  = scanner.nextInt();

        while (test>0)
        {
            test-=1;
            int v = scanner.nextInt();
            int edges = scanner.nextInt();
            ArrayList<Edge>[] arrayList = new ArrayList[v];
            PriorityQueue<Vertex> q = new PriorityQueue<>();
            for (int i=0;i<v;i++)
                arrayList[i] = new ArrayList<>();


            for (int i=0;i<edges;i++)
            {
                int src = scanner.nextInt();
                int nbr = scanner.nextInt();
                int weight = scanner.nextInt();
                //System.out.println(src+"-"+nbr+"-"+weight);
                Edge edge1 = new Edge(src,nbr,weight);
                Edge edge2 = new Edge(nbr,src,weight);

                arrayList[src].add(edge1);
                arrayList[nbr].add(edge2);
            }


            q.add(new Vertex(0,0));
            boolean []visitedNode = new boolean[v];
            HashMap<Integer,Integer> ansMap= new HashMap<>();

            while (!q.isEmpty())
            {
                Vertex vertex = q.poll();
                if(visitedNode[vertex.vertex])
                {
                    continue;
                }
                //System.out.print(vertex.weight);
                ansMap.put(vertex.vertex, vertex.weight);
                visitedNode[vertex.vertex] = true;

                for (Edge edge:arrayList[vertex.vertex])
                {
                    if (!visitedNode[edge.des])
                        q.add(new Vertex(edge.weight+ vertex.weight,edge.des));
                }

            }

            for(int i=0;i< visitedNode.length;i++)
            {
                if (!visitedNode[i])
                    ansMap.put(i,Integer.MAX_VALUE);
            }

            TreeSet<Integer> treeSet = new TreeSet<>(ansMap.keySet());
            Iterator<Integer> iterator = treeSet.iterator();
            while (iterator.hasNext())
            {

                System.out.print(ansMap.get(iterator.next()));
                if (iterator.hasNext())
                    System.out.print(" ");
            }
            System.out.println("");

        }


    }

}
