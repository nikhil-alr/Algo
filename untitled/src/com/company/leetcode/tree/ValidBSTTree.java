package com.company.leetcode.tree;

public class ValidBSTTree {



    public static void main(String args[])
    {
       TreeNode node = new TreeNode();
       node.val = -2147483648;

        TreeNode nodel = new TreeNode();
        nodel.val = 1;

        TreeNode noder = new TreeNode();
        noder.val = 2147483647;

        //node.left = nodel;
        node.right = noder;


    }

    static void checkBST(TreeNode rootNode)
    {




        isFixedInChild(rootNode,rootNode.left,Long.MIN_VALUE, rootNode.val);
        isFixedInChild(rootNode,rootNode.right, rootNode.val, Long.MAX_VALUE);




    return;
    }

    static void isFixedInChild(TreeNode parentNode,TreeNode node, long min, long max )
    {



       if(node.val>min&&node.val<max)
       {
           isFixedInChild(node,node.left,Long.MIN_VALUE, node.val);
           isFixedInChild(node,node.right, node.val, Long.MAX_VALUE);

       }
       else
       {
           int tmp = parentNode.val;
           parentNode.val = node.val;
           node.val = tmp;
       }



    }


}
