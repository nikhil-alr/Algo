package com.company.leetcode.tree;

import java.util.ArrayList;
import java.util.Stack;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
 }


public class InOrderUsingStack {

    public static void main(String args[])
    {
TreeNode treeNode = new TreeNode();
treeNode.val = 3;

        TreeNode treeNoder = new TreeNode();
        treeNoder.val = 1;
        treeNode.left = treeNoder;
        TreeNode treeNodel = new TreeNode();
        treeNodel.val = 2;

        treeNode.right = treeNodel;
        ArrayList<Integer> list = inorderTraversal(treeNode);

        for (int item:list)
        {
        System.out.print(item);
        }

    }

    static public ArrayList<Integer> inorderTraversal(TreeNode root) {
ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();



        stack.push(root);
        while (!stack.isEmpty())
        {
          TreeNode node = stack.peek();

          if(node.left==null)
          {
              list.add(node.val);
              stack.pop();
              if(node.right!=null)
              {stack.push(node.right);}

          }
          else
          {
              stack.push(node.left);
              node.left = null;
          }



        }

return list;
    }


}
