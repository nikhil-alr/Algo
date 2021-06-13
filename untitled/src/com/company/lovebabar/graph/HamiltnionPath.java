package com.company.lovebabar.graph;

import com.company.adityavrma.dp.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HamiltnionPath {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<String> ansList = new ArrayList<>();
        boolean visitedNode[] = new boolean[vtces];

        int src = Integer.parseInt(br.readLine());

        StringBuilder path = new StringBuilder();
        printPaths(path,src,src,-1,visitedNode,graph,ansList);
        Collections.sort(ansList);
        System.out.print(ansList);

        // write all your codes here
    }


    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

//    static boolean check(int N, int M, ArrayList<Edge>[] graph)
//    {
//
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i=0;i<=N;i++)
//        {
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            graph.add(arrayList);
//        }
//
//        for (ArrayList<Integer> edge:Edges)
//        {
//            graph.get(edge.get(0)).add(edge.get(1));
//            graph.get(edge.get(1)).add(edge.get(0));
//        }
//
//        //System.out.print(graph);
//
//        for (int i=1;i<=N;i++)
//        {
//            boolean visitedNode[] = new boolean[N+1];
//            if(isHamPathExisit(i,i,-1,visitedNode,graph))
//                return true;
//
//        }
//
//
//        return false;
//    }

    static void printPaths(StringBuilder path,int start,int node,int parent,boolean[] visitedNode,ArrayList<Edge>[] graph,ArrayList<String> ans)
    {


boolean isHamPathPresent = true;
        if (visitedNode[node])
        {
            for (int i=1;i< visitedNode.length;i++)
            {
                if (!visitedNode[i])
                {
                  isHamPathPresent  = false;
                  return;
                }
                    //return false;
            }
            if (isHamPathPresent)
            {
                if(!ans.contains(path+"."))
                ans.add(path+".");

                if(node==start)
                {
                    if(!ans.contains(path+"*"))
                        ans.add(path+"*");
                }

                //check for ham cycle
                return;
            }
            //return true;
        }


        visitedNode[node] = true;

        ArrayList<Edge> nbrs = graph[node];

        for (Edge nbr:nbrs)
        {
            if(nbr.nbr!=parent)
            {
                path.append(""+ node);
                printPaths(path,start,nbr.nbr,node,visitedNode,graph,ans);
                path.deleteCharAt(path.length()-1);

            }

        }

        visitedNode[node] = false;

    }

}
