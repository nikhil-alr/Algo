package com.company.lovebabar.BST;

import com.company.adityavrma.dp.A;

import java.util.ArrayList;

public class PopulateInorderSuccessor {

    static public class Node {
        int val;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String args[])
    {
        Node node1 = new Node(10);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(12);
        node1.left = node2;
        node1.right = node4;
        node2.left = node3;
        populateNext(node1);

    }

    public static void populateNext(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        readInOrder(root,  list);
        int i=0;
        while (i<list.size())
        {
            System.out.print(list.get(i)+"->");
            i+=1;
            if(i<list.size())
            System.out.print(list.get(i)+" ");
else
            {
                System.out.print(-1);
            }
        }


    }

    static void readInOrder(Node root, ArrayList<Integer> list)
    {
        if(root==null)
            return;

        readInOrder(root.left,list);
        list.add(root.val);
        readInOrder(root.right,list);

    }


}
