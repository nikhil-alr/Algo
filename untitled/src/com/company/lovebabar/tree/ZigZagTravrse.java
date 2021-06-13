package com.company.lovebabar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTravrse {

    static class Node {
        Integer data;
        Node left, right;

        public Node(Integer data){
            this.data = data;
        }
    }

    public static void main(String args[])
    {

    }


    ArrayList<Integer> getZigZagList(Node node)
    {
        ArrayList<Integer> ansList = new ArrayList<>();
        boolean shouldTravrseInReverse = false;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        Queue<Node> squeue = new LinkedList<Node>();
        squeue.add(node);

        while (!queue.isEmpty())
        {
            if (shouldTravrseInReverse)
            {
                Stack<Node> stack = new Stack<>();
                stack.add(queue.poll());
                while (!stack.isEmpty())
                    ansList.add(stack.pop().data);
                shouldTravrseInReverse = false;
            }
            else
            {
                ansList.add(queue.poll().data);
                shouldTravrseInReverse = true;
            }
            while (!squeue.isEmpty())
            {
                Node tmpNode = queue.poll();
                if (tmpNode.left!=null)
                    squeue.add(node.left);

                if (tmpNode.right!=null)
                    squeue.add(node.right);

            }

            squeue = new LinkedList<>(queue);



        }
        return ansList;
    }


    ArrayList<Integer> getZigZagList2(Node node)
    {
        ArrayList<Integer> ansList = new ArrayList<>();
        boolean shouldTravrseInReverse = true;
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Node> queue2 = new LinkedList<Node>();
        ansList.add(node.data);
        queue.add(node);


      while (true)
      {
          if(queue.isEmpty())
          {
              Node tmpNode = queue2.poll();
              queue2.add(tmpNode.left);
              queue2.add(tmpNode.right);
          }
          else
          {

              if (queue2.isEmpty())
                  break;

              queue = new LinkedList<Node>(queue2);
              //queue2.clear();

              if (shouldTravrseInReverse)
              {
                  Stack<Node> stack = new Stack<>();
                  while (!queue.isEmpty())
                  stack.add(queue.poll());

                  while (!stack.isEmpty())
                      ansList.add(stack.pop().data);
              }
              else
              {
                  while (!queue.isEmpty())
                      ansList.add(queue.poll().data);
              }
              queue = new LinkedList<Node>(queue2);
              queue2.clear();
          }

      }
        return ansList;
    }

}
