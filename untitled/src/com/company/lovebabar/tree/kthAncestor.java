package com.company.lovebabar.tree;

import java.util.Stack;

public class kthAncestor {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {

    }

    public static Node getKthAncestor(Node node, int k, int v, Stack<Node> stack)
    {
        if(node==null)
            return null;
        if(node.data == v)
        {
            if(k>stack.size())
                return null;
        Node nodeToReturn = null;
        while (k>0)
        {
            nodeToReturn = stack.pop();
            k-=1;
        }
        return nodeToReturn;
        }

        stack.push(node);
        getKthAncestor(node.left,k,v,stack);

        return new Node(2);
    }

}
