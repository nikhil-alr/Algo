package com.company.lovebabar.tree;

import org.omg.CORBA.NO_IMPLEMENT;

public class LowestCAncetor {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {

    }

    public static Node inOrderTravrse(Node node,int a,int b)
    {
        if (node==null)
            return null;

        if (node.data==a||node.data==b)
            return node;

        Node leftNode = inOrderTravrse(node.left,a,b);
        Node rightNode = inOrderTravrse(node.right,a,b);
        if(leftNode!=null&&rightNode!=null)
            return node;

        Node nodeToReturn = null;
        if (leftNode!=null)
            nodeToReturn = leftNode;
        else
            nodeToReturn = rightNode;

        return nodeToReturn;

    }


}
