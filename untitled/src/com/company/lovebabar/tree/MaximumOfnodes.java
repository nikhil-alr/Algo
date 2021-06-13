package com.company.lovebabar.tree;

import com.company.lovebabar.tree.GenrateTreeUsingString.*;
public class MaximumOfnodes {

    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    };

    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(1);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(2);

        inOrder(root);
        System.out.println("");
        preOrder(root);
        System.out.print(getTreeSum(root));
    }


    static void inOrder(Node node)
    {
        if (node==null)
            return;;

            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
    }


    static void preOrder(Node node)
    {
        if (node==null)
            return;;
        System.out.print(node.data);
        preOrder(node.left);

        preOrder(node.right);
    }

    static int getTreeSum(Node node)
    {
        if(node==null)
            return 0;

        Node left = node.left; //Child
        Node right = node.right; //Child


        int leftSum = getTreeSum(left);
        int rightSum = getTreeSum(right);

        int gLSum = 0;
        if (left!=null)
         gLSum = getTreeSum(left.left);
        int gRSum = 0;
        if (right!=null)
        gRSum = getTreeSum(right.right);

        int childSum = leftSum+rightSum;
        int gChildSum = gLSum+gRSum+ node.data;

        int sum = 0;
        sum = Math.max(childSum,gChildSum);

        sum = Math.max(sum,leftSum+gRSum);
        sum = Math.max(sum,gLSum+rightSum);

        return sum;





    }


}
