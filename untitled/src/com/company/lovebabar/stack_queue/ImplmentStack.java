package com.company.lovebabar.stack_queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplmentStack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a)
    {
        q1.add(a);
    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
        int item = 0;
      while (!q1.isEmpty())
      {
          q2.add(q1.poll());
          if(q1.size()==1)
              item = item = q1.poll();

      }


      while (!q2.isEmpty())
          q1.add(q2.poll());
return  item;
    }



    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        int item = -1;
        while (!s2.isEmpty())
        {
            if(s1.size()==1)
            {
                item = s1.pop();
                break;
            }
            s1.push(s2.pop());
        }


        while (!s2.isEmpty())
            s1.push(s2.pop());

        return item;
    }

}
