package com.company.lovebabar.graph;

import java.util.*;

public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public static void main(String args[]) {

for(int i=0;i<1000000000;i++)
{
    System.out.println(i);
}
    }

    public Node cloneGraph(Node node) {



        Queue<Node> q = new LinkedList<>();
        System.out.print(node.val);
        for (Node node1: node.neighbors)
        System.out.print(node1.val);
        System.out.println("");
        HashMap<Integer, Node> visitedNode = new HashMap<>();
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();
            if (visitedNode.get(node.val) != null) {
                continue;
            }
            Node cloneNode  = new Node(node.val);
            visitedNode.put(node.val, cloneNode);
            for (Node nbrNode : node.neighbors) {
                if (visitedNode.get(nbrNode.val)==null)
                {
                    q.add(nbrNode);
                   Node cNbrNode = new Node(nbrNode.val);
                    cNbrNode.neighbors.add(cloneNode);
                    cloneNode.neighbors.add(cNbrNode);
                }

            }
        }

        return visitedNode.get(node.val);

    }
}
