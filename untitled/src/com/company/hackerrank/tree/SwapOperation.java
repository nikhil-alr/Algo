package com.company.hackerrank.tree;

import javafx.util.Pair;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SwapOperation {

    static class TreeNode
    {
        int val = 0;
        TreeNode left;
        TreeNode right;

    }

    static class Pair
    {
        int left = 0;
        int right = 0;
    }

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int node = scanner.nextInt();
        Pair[] pairList = new Pair[node];
        for (int i=0;i<node;i++)
        {
            Pair pair = new Pair();
            pair.left = scanner.nextInt();
            pair.right = scanner.nextInt();
            pairList[i] = pair;
        }

        TreeNode root = generateTree(pairList);
        System.out.print("");
        inorderTravrse(root);
        int n=2;
//        TreeNode parent = getParent(root,n-1);
//        swap(parent);
//        inorderTravrse(root);
    }


    static TreeNode getParent(TreeNode node,int level)
    {
        if (level==0)
            return node;

        return getParent(node.left,level-1);
    }

    static void swap(TreeNode parent)
    {
        TreeNode tmp = parent.left;
        parent.left = parent.right;
        parent.right = tmp;

    }

    static TreeNode  generateTree(Pair[] pairList)
    {
        TreeNode mainRoot = new TreeNode();
        Queue<TreeNode> queue = new LinkedList();
        mainRoot.val = 1;
        queue.add(mainRoot);

        for (Pair pair : pairList) {
            TreeNode parent = queue.poll();
            TreeNode leftNode = null;
            TreeNode rightNode = null;
            if (pair.left>-1)
            {
                leftNode = new TreeNode();
                leftNode.val = pair.left;
            }
            if(pair.right>-1)
            {
                rightNode = new TreeNode();
                rightNode.val = pair.right;
            }

            parent.left = leftNode;
            parent.right = rightNode;
            if(leftNode!=null)
                queue.add(leftNode);
            if(rightNode!=null)
                queue.add(rightNode);

        }

        return mainRoot;
    }


    static void inorderTravrse(TreeNode node)
    {
        if (node==null)
            return;

    inorderTravrse(node.left);
    System.out.print(node.val);
    inorderTravrse(node.right);
    }

}
