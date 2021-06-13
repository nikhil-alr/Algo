package com.company.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class LCAItreative {

    static class Node
    {
        int value = 0;
        Node left = null;
        Node right = null;
    }

    public static void main(String args[])
    {
        //rootToNode()

    }

    static int rootToNode(Node root,int value)
    {

        if(root==null)
            return 0;

        if(value==root.value)
        {
            return 1;
        }

        int height = rootToNode(root.left,value);
        if(height==0)
        height = rootToNode(root.right,value);

        if(height>0)
         height+=1;
        return height;
    }

}
