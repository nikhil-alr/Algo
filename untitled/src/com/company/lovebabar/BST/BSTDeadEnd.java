package com.company.lovebabar.BST;

public class BSTDeadEnd {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    boolean isDeadEnd(Node root)
    {
        return isDeadPresent(root.left,0, root.data);
    }


    boolean isDeadPresent(Node root,int min,int max)
    {

        if(root==null)
            return true;

        if(max-min<=1)
            return true;


        boolean isDeadEndPresent = isDeadPresent(root.left,min, root.data);
        if(isDeadEndPresent)
            return true;

        isDeadEndPresent = isDeadPresent(root.right, root.data, max);

        return isDeadEndPresent;
    }


}
