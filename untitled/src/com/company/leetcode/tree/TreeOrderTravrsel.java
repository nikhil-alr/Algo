package com.company.leetcode.tree;

import java.util.*;

public class TreeOrderTravrsel {

    static class Node
    {
        int value = 0;
        Node leftNode = null;
        Node rightNode = null;
    }

    public static void main(String args[])
    {

        Node node = new TreeOrderTravrsel.Node();
        node.value = 10;

        Node lnode = new TreeOrderTravrsel.Node();
        lnode.value = 20;

        Node rnode = new TreeOrderTravrsel.Node();
        rnode.value = 30;

        node.leftNode = lnode;
        node.rightNode = rnode;

        Node llnode = new TreeOrderTravrsel.Node();
        llnode.value = 40;



        Node lrnode = new TreeOrderTravrsel.Node();
        lrnode.value = 60;

        node.leftNode.leftNode = llnode;
        node.rightNode.rightNode = lrnode;


        ArrayList<Integer> list = levelOrder(node);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0;i<list.size();i++)
        {
            stack.push(list.get(i));
            //System.out.print(list.get(i));
            //if(i<list.size()-1)
            //System.out.print(" ");
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
            if(stack.size()>0)
            System.out.print(" ");

        }


    }




    static ArrayList<Integer> levelOrder(Node rootNode)
    {

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(rootNode==null)
            return list;

        list.add(rootNode.value);
        queue.add(rootNode.rightNode);
        queue.add(rootNode.leftNode);

        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            list.add(node.value);
            if(node.rightNode!=null)
            {
                queue.add(node.rightNode);
            }

            if(node.leftNode!=null)
            {
                queue.add(node.leftNode);
            }
        }

        Collections.reverse(list);
        return  list;

    }

}
