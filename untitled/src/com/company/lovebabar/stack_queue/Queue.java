package com.company.lovebabar.stack_queue;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Stack;

public class Queue {



    public static void main(String args[])
    {
        Stack<Character> stack;



        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(3);
        q.add(3);
        q.add(3);
        System.out.print(q.poll());
        q.add(4);
        System.out.print(q.poll());
        System.out.print(q.poll());
    }

    int queueArray[];
    int front = 0;
    int qCounter = 0;
    int size = 0;
    int maxSize = 0;
    Queue(int size)
    {
    this.maxSize = size;
    this.queueArray = new int[size];
    }



    void add(int item)
    {
       if(size<maxSize)
       {
           queueArray[qCounter] = item;
           size+=1;
           qCounter = (qCounter+1)%maxSize;
       }
    }

    int poll()
    {

       if (size>0)
       {
            int item = queueArray[front];
            size-=1;
           front = (front+1)%maxSize;
           return item;
       }
        return -1;
    }

}
