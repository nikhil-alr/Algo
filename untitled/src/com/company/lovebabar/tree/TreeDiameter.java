package com.company.lovebabar.tree;

public class TreeDiameter {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    static int lastD = 0;
    public static void main(String args[])
    {

    }

    static int getDiameter(Node node)
    {
        if(node==null)
        return 0;

    int leftd = getDiameter(node.left);
    int rightd = getDiameter(node.right);
    lastD = Math.max(leftd+rightd+1,lastD);
    return Math.max(leftd,rightd)+1;
    }


}
