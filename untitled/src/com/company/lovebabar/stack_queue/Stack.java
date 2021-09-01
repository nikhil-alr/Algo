package com.company.lovebabar.stack_queue;

public class Stack {

    public static void main(String args[])
    {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        while (stack.top!=-1)
        {
            System.out.print(stack.pop());
        }
        stack.pop();
    }

    int maxSize = 0;
    int top = -1;
    int stackArray[];
    Stack(int size)
    {
        this.maxSize = size;
        stackArray = new int[size];
    }

    public void push(int item)
    {

        if(top<maxSize-1)
        {
            top+=1;
            stackArray[top] = item;

        return;
        }
        System.out.println("stack overflow");
    }

    public int pop()
    {

        if (top>=0)
        {
            int item = stackArray[top];
            top-=1;
            return item;
        }


        System.out.println("Stack Under Flow");
        return -1;
    }


}
