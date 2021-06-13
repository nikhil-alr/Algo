package com.company.leetcode.tree;

public class StringToTree {

    static class Node
    {
        int value = 0;
        Node left = null;
        Node right = null;
    }


    static public void inOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print((char)root.value);
        inOrder(root.left);
        inOrder(root.right);

    }

    public static void main (String args[])
    {

        Node node = genrateTree("1(2(4))(3)");
        //inOrder(node);
        String str = treeToString(node);
        System.out.print(str.substring(1,str.length()-1));

    }

    static public Node genrateTree(String string)
    {
        Node node = new Node();
node.value = string.charAt(0);
int startIndex = 2;
int parnthesisCounter = 0;

for (int i=1;i<string.length();i++)
{
    if(string.charAt(i)=='(')
    {
        parnthesisCounter+=1;
    }

    if(string.charAt(i)==')')
    {
        parnthesisCounter-=1;
    }

    if(parnthesisCounter==0)
    {
        if(node.left==null)
        {
            node.left = genrateTree(string.substring(startIndex,i));
            startIndex=i+2;
        }
        else
        {
            node.right = genrateTree(string.substring(startIndex,i));
        }
    }

}

        return node;
    }

    static public String treeToString(Node node)
    {

        if(node==null)
            return "";

        String leftValue = treeToString(node.left);
        String rightValue = treeToString(node.right);

        return "("+(char)node.value+leftValue+rightValue+")";
    }


}
