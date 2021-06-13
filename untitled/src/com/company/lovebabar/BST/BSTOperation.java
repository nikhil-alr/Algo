package com.company.lovebabar.BST;

public class BSTOperation {

      static public class TreeNode {
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


    public static void main(String args[])
    {
TreeNode node = new TreeNode(50);
        TreeNode node1 = new TreeNode(30);
        TreeNode node2 = new TreeNode(70);
        node.left = node1;
        node.right = node2;

        TreeNode node4 = new TreeNode(40);
        node2.right = node4;
        TreeNode node5 = new TreeNode(60);
        TreeNode node6 = new TreeNode(80);
        node2.left = node5;
        node2.right = node6;

        deleteNode(node,50);
        System.out.print("");

    }

    static public TreeNode deleteNode(TreeNode root, int key) {

          return removeNode(root,key);
    }


    static TreeNode removeNode(TreeNode root,int key)
    {


        if(root==null)
            return root;

if(root.val == key)
{
    return removeAndGetNewNode(root);
}

        if (root.val>key)
        {
         root.left = removeNode(root.left,key);
        }
        else
        { root.right = removeNode(root.right,key);
        }

        return root;
    }

    static TreeNode removeAndGetNewNode(TreeNode node)
    {

        if (node.left==null)
            return node.right;

        if (node.right==null)
            return node.left;

        TreeNode newNode = succussr(node.right);

        newNode.left = node.left;
        if(node.right!=newNode)
        {
node.right.left = null;
            newNode.right = node.right;
//Integer.MAX_VALUE
        }

        return newNode;
    }

   static TreeNode succussr(TreeNode node)
    {
       if(node.left==null)
           return node;

        node = succussr(node.left);

        return node;
    }

}
