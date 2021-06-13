package com.company.leetcode.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class KthAncestor {

    public static void main(String args[])
    {
        int [] list = {-1, 0, 0, 1, 1, 2, 2};
TreeAncestor(0,list);

    }

    public static void TreeAncestor(int n, int[] parent) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int i = 0;
        while (i< parent.length)
        {
            List<Integer> list = map.get(parent[i]);
            if(list==null)
            {
                list = new LinkedList<>();
            list.add(parent[i]);
            map.put(i,list);
            }
            else
            {
List<Integer>  newList = new LinkedList<>(list);
                newList.add(0,parent[i]);
                map.put(i,newList);
            }

            i+=1;
        }


System.out.print(map.get(3).get(1-1));
    }

    public int getKthAncestor(int node, int k) {
 node = 0;

 return node;
    }

}
