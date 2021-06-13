package com.company.lovebabar.BST;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BrotherFromDifferentRoot {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static int countPairs(Node root1, Node root2, int x)
    {
        int countPairs = 0;
        // your code here
HashMap<Integer,Integer> map = new HashMap<>();
        buildMap(root1,map);

        Queue<Node> q = new LinkedList<>();
        q.add(root2);
        while (!q.isEmpty())
        {
            Node node = q.poll();
            if(map.get(Math.abs(x- node.data))!=null)
                countPairs+=1;
        }

      return countPairs;
    }

    static void buildMap(Node root1, HashMap<Integer,Integer> map)
    {

        if(root1==null)
            return;

        buildMap(root1.left,map);
        map.put(root1.data, root1.data);
        buildMap(root1.right,map);

    }

}
