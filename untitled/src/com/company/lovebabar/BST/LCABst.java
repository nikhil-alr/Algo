package com.company.lovebabar.BST;

import com.company.lovebabar.tree.GenrateTreeUsingString;

import java.util.ArrayList;

public class LCABst {


    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {

        Node node1 = new Node(5);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        node1.left = node2;
        node1.right = node3;
        Node node4 = new Node(3);
        node2.left = node4;
        Node node5 = new Node(7);
        node3.right = node5;
        Node node6 = new Node(8);
        node5.right = node6;

        LCA(node1,7,8);
    }


    static Node LCA(Node root, int n1, int n2)
    {
    Node lcaNode = null;
        // code here.
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        getList(n1,root,list1);
        getList(n2,root,list2);


        int i=0;
        while (i<list1.size()&&i<list2.size())
        {
if(list1.get(i)!=list2.get(i))
    break;

        lcaNode = list1.get(i);
            i+=1;
        }


    return lcaNode;
    }

    static void getList(int key,Node root,ArrayList<Node> nodeList)
    {
        if(root==null)
            return;


        nodeList.add(root);
        if(root.data==key)
            return;
        if(root.data>key)
        {
            getList(key,root.left,nodeList);
        }
        else
        {
            getList(key,root.right,nodeList);
        }
    }


}
