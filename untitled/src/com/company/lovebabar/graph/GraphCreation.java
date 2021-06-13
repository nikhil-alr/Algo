//package com.company.lovebabar.graph;
//
//import java.util.ArrayList;
//
//public class GraphCreation {
//
//    // 0->1(1)
//    // 1->2(2)
//    // 2->3(1)
//
////5 node
//
//    static int matrix[][];
//   static ArrayList<Integer> adjList[] = new ArrayList[5];
//    static int
//            [] = new int[5];
//    public static void main(String args[])
//    {
//        matrix = new int[5][5];
//        for (int i=0;i<adjList.length;i++) {
//            ArrayList<Integer> list = new ArrayList<>();
//            adjList[i] = list;
//        }
//
//
//        addEdgeAL(0,1,false);
//        addEdgeAL(0,3,false);
//        addEdgeAL(0,4,false);
//
//        addEdgeAL(1,4,false);
//        addEdgeAL(1,2,false);
//
//        addEdgeAL(2,3,false);
//        addEdgeAL(2,4,false);
//
//        //addEdgeAL(0,1,true);
//
//        //traverseUsingBFS(0);
//        System.out.print("Graph Rep");
//    }
//
//
//    static void addEdgeAL(int start,int end,boolean biDirect)
//    {
//        adjList[start].add(end);
//    }
//
//    static void traverseUsingBFS()
//    {
//        //adjList[start].add(end);
//    }
//
//
//    static void addEdge(int start,int end,boolean bidirect)
//    {
//        matrix[start][end] = 1;
//        if (bidirect)
//        {
//            matrix[end][start] = 1;
//        }
//    }
//
//
//    static void traverseUsingBFS(int node)
//
//    {
////System.out.println("");
//ArrayList<Integer> arrayList = new ArrayList<Integer>();
//int length = matrix[node].length;
//for (int i=0;i<length;i++)
//{
//if (matrix[node][i]>0)
//{
//    if (isVisited[i]<1)
//    {
//        System.out.print(i);
//        arrayList.add(i);
//        traverseUsingBFS(i);
//    }
//
//    isVisited[i] = 1;
//}
//
//}
////        for(int item : arrayList)
////        {
////            traverseUsingBFS(item);
////        }
//    }
//
//    static void traverseUsingDFS(int node)
//    {
//
//    }
//
//
//    static boolean isCyclePresentInGraph()
//    {
//        boolean isCyclePresent = false;
//
//        return isCyclePresent;
//    }
//
//}
