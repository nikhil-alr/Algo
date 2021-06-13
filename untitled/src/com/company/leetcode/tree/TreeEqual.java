package com.company.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeEqual {

    public static void main(String args[])
    {
        TreeNode node = new TreeNode();
        node.val = 5;

        TreeNode nodel = new TreeNode();
        nodel.val = 1;

        TreeNode noder = new TreeNode();
        noder.val = 14;

        node.left = nodel;
        node.right = noder;


    }


    static boolean isTreeEqual(TreeNode r1,TreeNode r2)
    {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(r1);
        q2.add(r2);

        while (!q1.isEmpty()||!q2.isEmpty())
        {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q1.poll();

            if(node1==null&&node2==null)
            {
                continue;
            }
            if(node1==null&&node2!=null)
            {
                return false;
            }
            if(node2==null&&node1!=null)
            {
                return false;
            }

            if(node1.val!=node2.val)
            {
                return false;
            }

            q1.add(node1.left);
            q2.add(node2.right);

            q1.add(node1.right);
            q2.add(node2.left);

        }

        if(q1.size()!=q2.size())
            return false;

        return true;
    }

}
