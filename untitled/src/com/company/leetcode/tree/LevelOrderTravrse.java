package com.company.leetcode.tree;

import java.util.*;

public class LevelOrderTravrse {

    public static void main(String args[])
    {


    }

    List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> main = new ArrayList();
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();

        if(root==null)
        {
            return main;
        }

         q1.add(root);
         q2.add(root);

        while (!q1.isEmpty())
        {
            q1.clear();
            List<Integer> subList = new LinkedList<>();
            while (!q2.isEmpty())
            {
                TreeNode node = q2.poll();
                if(node==null)
                    continue;
                subList.add(node.val);
                q1.add(node.left);
                q1.add(node.right);

            }


            Iterator<TreeNode> it = q1.iterator();
            while(it.hasNext())  {
                q2.add(it.next());
            }

            if (!subList.isEmpty())
            main.add(subList);
        }




    return main;
    }


}
