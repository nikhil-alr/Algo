package com.company.lovebabar.stack_queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseFirstKElement {

    public static void main(String args[])
    {

    }

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> stack = new Stack();


        while (!q.isEmpty())
        {
            stack.push(q.poll());
        }


        while (!stack.isEmpty())
        {
            q.add(stack.pop());
        }





        return q;
    }
}
