package com.company.lovebabar.tree;

public class TreeHeight {

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

    int getHeight(Node node)
    {
        if(node==null)
            return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight,rightHeight)+1;

    }

}
