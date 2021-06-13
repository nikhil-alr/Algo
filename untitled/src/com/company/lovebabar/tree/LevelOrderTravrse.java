package com.company.lovebabar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravrse {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static void main(String args[])
    {

    }


    static ArrayList<Integer> getLevelOrderList(Node node)
    {
        ArrayList<Integer> ansList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty())
        {
            Node tmpNode = queue.poll();
            queue.add(tmpNode.left);
            queue.add(tmpNode.right);
            ansList.add(tmpNode.data);
        }

        return ansList;
    }

}
