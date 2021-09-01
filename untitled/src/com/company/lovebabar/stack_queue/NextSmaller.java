package com.company.lovebabar.stack_queue;

import java.util.Stack;

public class NextSmaller {

    public static void main(String args[])
    {
        int N = 5;
        long arr[] = {4,8,5,2,25};
        long[] nextLargerElement = nextLargerElement(arr,N);
        System.out.print("");
    }

    public static long[] nextLargerElement(long[] arr, int n)
    {
        java.util.Stack<Long> stack = new java.util.Stack<>();

        for (int i=n-1;i>=0;i--)
        {
            long nextRight =  getNextRight(arr[i],stack);
            stack.push(arr[i]);
            arr[i] = nextRight;
        }

        return arr;
    }

    static long getNextRight(long item, Stack<Long> stack)
    {
        if (stack.isEmpty())
            return -1;
        long valueInRight = stack.peek();
        while (item<valueInRight&&!stack.isEmpty())
        {
            stack.pop();
            if(stack.isEmpty())
                return -1;
            valueInRight = stack.peek();
        }
        return item>valueInRight?valueInRight:-1;
    }



}
