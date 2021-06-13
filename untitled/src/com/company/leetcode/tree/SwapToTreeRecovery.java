package com.company.leetcode.tree;

public class SwapToTreeRecovery {

    static class Node
    {
        int value = 0;
        Node left = null;
        Node right = null;
    }

    public static void main(String args[])
    {

    }


    boolean isSwapPerformed(Node node,Node min,Node max)
    {
        if(node==null)
            return false;

        if(min.value<= node.value)
        {
            int tmp = node.value;
            node.value = max.value;;
            max.value = tmp;
            return true;
        }

        if (node.value>= min.value)
        {
            int tmp = node.value;
            node.value = min.value;;
            min.value = tmp;
            return true;
        }

        boolean isSwapPerfomed = isSwapPerformed(node.left,min,node);
        if(isSwapPerfomed)
        {
            return true;
        }
        isSwapPerfomed = isSwapPerformed(node.right,node,max);
        if(isSwapPerfomed)
        {
            return true;
        }

        return false;
    }


}
