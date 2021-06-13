package com.company.lovebabar.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ChildOnSameLevel {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {


    }


    boolean isChildAvailOnSameLevel(Node node,int level)
    {

        Queue<Node> mainQueue = new LinkedList<>();
        Queue<Node> secondQueue = new LinkedList<>();

        mainQueue.add(node);
        secondQueue.add(node);
        int nodeCountShouldBe = 0;

while (!mainQueue.isEmpty())
{
    nodeCountShouldBe=mainQueue.size()*2;
    mainQueue.clear();

    while (!secondQueue.isEmpty())
    {
        Node tmpNode = secondQueue.poll();
        if(tmpNode.left!=null)
            mainQueue.add(tmpNode.left);

        if(tmpNode.right!=null)
            mainQueue.add(tmpNode.right);
    }
if(mainQueue.size()>0)
{
    if(mainQueue.size()!=nodeCountShouldBe)
        return false;
}
secondQueue = mainQueue;

}



        return true;
    }


}
