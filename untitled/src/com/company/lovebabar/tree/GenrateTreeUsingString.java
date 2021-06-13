package com.company.lovebabar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenrateTreeUsingString {

    static class Node {
        char data;
        Node left, right;

        public Node(char data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {
        Node node = genrateTree("1234");
        System.out.print("hello");
    }


    public static Node genrateTree(String values)
    {
        Queue<Node> q = new LinkedList<>();
        Node rootNode = new Node(values.charAt(0));
        q.add(rootNode);
        int startIndex=1;
        int nodeCount = 2;
        while (nodeCount<values.length())
        {
        for (int i=startIndex;i<=nodeCount;i++)
        {
            Node node = new Node(values.charAt(i));
            Node pNode = q.peek();
            if (pNode.left==null)
            {
                pNode.left = node;
            }
            else
            {
                pNode.right=node;
                q.poll();
            }
            q.add(node);
        }
        startIndex = nodeCount+1;
        nodeCount*=2;
        }


        for (int i=startIndex;i<values.length();i++)
        {
            Node node = new Node(values.charAt(i));
            Node pNode = q.peek();
            if (pNode.left==null)
            {
                pNode.left = node;
            }
            else
            {
                pNode.right=node;
                q.poll();
            }
            q.add(node);
        }

        return rootNode;

    }

}
