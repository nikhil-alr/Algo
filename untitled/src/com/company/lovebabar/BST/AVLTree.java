package com.company.lovebabar.BST;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {

    static public class Node {
        int data;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.data = val; }
        Node(int val, Node left, Node right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String args[])
    {

        //binaryTreeToBST()
    }




    Node binaryTreeToBST(Node root)
    {

        Node node1 = new Node(14);
        Node node2 = new Node(2);
        Node node3 = new Node(5);

        node2.left = node1;
        node2.right = node3;

        Queue<Integer> queue = new LinkedList<>();

        inOrder(root,queue);
        ArrayList<Integer> list = new ArrayList<>(queue);
        Collections.sort(list);
        queue = new LinkedList<>(list);

        buildTree(root,queue);

        return root;
    }

    void inOrder(Node root,Queue<Integer> queue)
    {
        if(root==null)
            return;

        inOrder(root.left,queue);
        queue.add(root.data);
        inOrder(root.right,queue);

    }

    void buildTree(Node root,Queue<Integer> queue)
    {
        if(root==null)
            return;

        buildTree(root.left,queue);
        root.data = queue.poll();
        buildTree(root.right,queue);
    }



}
