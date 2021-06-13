package com.company.lovebabar.tree;

import com.company.lovebabar.tree.GenrateTreeUsingString.*;


public class DLLtoTree {


   public static void main(String args[])
    {
        Node node = GenrateTreeUsingString.genrateTree("132");
       generateTree(node);

    }


    static void generateTree(Node node)
    {

        if (node==null)
            return;

       generateTree(node.left);
       generateTree(node.right);

       Node predecssor = getInorderPredecssor(node.left);
       Node successor = getInorderSuccessor(node.right);
       node.left = predecssor;
       node.right = successor;
       if (predecssor!=null)
       predecssor.right = node;
       if (successor!=null)
       successor.left = node;





    }

    static Node getInorderSuccessor(Node node)
    {
        if (node==null)
            return null;
        while (true)
        {
            if (node.left==null)
                return node;
            node = node.left;
        }
    }

    static Node getInorderPredecssor(Node node)
    {
        if (node==null)
            return null;
        while (true)
        {
            if (node.right==null)
                return node;
        node = node.right;
        }
    }


}
