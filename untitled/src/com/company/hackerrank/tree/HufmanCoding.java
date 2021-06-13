package com.company.hackerrank.tree;

public class HufmanCoding {

    public static void main(String args[])
    {

    }

    class Node{
        public  int frequency; // the frequency of this tree
        public  char data;
        public  Node left, right;

    }

    static void getDecodedString(String s, Node rootNode)
    {

        Node node = rootNode;
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

        while (index<s.length())
        {
            if(s.charAt(index)=='1')
            {
                node = node.right;
            }
            else
            {
                node = node.left;
            }

            char ch = node.data;
            if(node==null)
            {
                index-=1;
                node = rootNode;
                stringBuilder.append(ch);
            }
        }

System.out.print(stringBuilder);
    }

}
