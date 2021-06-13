package com.company.leetcode.tree;


public class HeightTree {

    static class Node
    {
        int value = 0;
        Node left = null;
        Node right = null;
    }

    static int diameter = 0;
    public static void main(String args[])
    {
        Node node = new Node();
        node.value = 10;

        Node lnode = new Node();
        lnode.value = 20;

        Node rnode = new Node();
        rnode.value = 30;

        node.left = lnode;
        node.right = rnode;

        Node llnode = new Node();
        llnode.value = 40;



        Node lrnode = new Node();
        lrnode.value = 60;

        node.left.left = llnode;
        node.right.right = lrnode;

        height(node);
        System.out.print(diameter);
    }

    static int height(Node node)
    {

        if(node==null)
        {
            return 0;
        }

        int leftHeight = height(node.left)+1;
        int rightHeight = height(node.right)+1;
        int height = leftHeight+rightHeight;

        if (diameter<height)
            diameter = height;

        return Integer.max(leftHeight,rightHeight);

    }
}
