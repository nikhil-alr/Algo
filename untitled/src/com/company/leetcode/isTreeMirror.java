package com.company.leetcode;

import com.company.lovebabar.BST.BSTOperation.*;

public class isTreeMirror {

    public static void main(String args[])
    {

    }

    public boolean isSymmetric(TreeNode root) {

return isTreeMirror(root.left,root.right);

    }

    static boolean isTreeMirror(TreeNode node1,TreeNode node2)
    {

        if (node1==null&&node2!=null)
            return false;

        if (node1!=null&&node2==null)
            return false;

        if (node1==null&&node2==null)
            return true;

        if (node1.val!=node2.val)
            return false;

        return isTreeMirror(node1.left,node2.right)&&isTreeMirror(node1.right,node2.left);

    }


}
