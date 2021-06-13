package com.company.hackerrank.tree;

public class IsTreeBst {

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void main(String args[])
    {
        //print(isChildBst(node.left,Integer.MIN_VALUE,node.value)&&isChildBst(node.left,Integer.MIN_VALUE,node.value))
    }

    boolean isChildBst(Node node,int min,int max)
    {
        if(node==null)
        {
            return true;
        }

        if(node.data>min&&node.data<max)
        {
            return isChildBst(node.left,min,node.data)&&isChildBst(node.left,node.data,max);
        }

    return false;
    }

}
