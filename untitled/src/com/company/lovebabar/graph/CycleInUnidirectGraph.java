package com.company.lovebabar.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CycleInUnidirectGraph {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();

        arrayList3.clear();
        arrayList1.add(2);
        arrayList2.add(1);
        arrayList2.add(3);
        arrayList3.add(2);
        arrayLists.add(arrayList0);
        arrayLists.add(arrayList1);
        arrayLists.add(arrayList2);
        arrayLists.add(arrayList3);

        System.out.print("");

        int V = 4;
        boolean[] visted = new boolean[V];
        boolean[] travrsed = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!travrsed[i]) {
                if (isCycleInUnidirectedGraph(-1, i, travrsed, visted, arrayLists))
                    System.out.print("");
            }

        }
    }

    static boolean  isCycleInUnidirectedGraph(int parent, int vertex, boolean allTimeVisitedNode[], boolean recnetVisitedNOde[], ArrayList<ArrayList<Integer>> adjList)
    {
List<Integer> list;

    if(allTimeVisitedNode[vertex])
            return false;

        recnetVisitedNOde[vertex] = true;
        allTimeVisitedNode[vertex] = true;

        List<Integer> verticesList = adjList.get(vertex);
        for (Integer graphNode:verticesList)
        {
            if(recnetVisitedNOde[graphNode]&&graphNode!=parent)
            {
                return true;
            }
            if(isCycleInUnidirectedGraph(vertex,graphNode,allTimeVisitedNode,recnetVisitedNOde,adjList))
                return true;
        }

    recnetVisitedNOde[vertex] = false;
    return false;
    }


}
