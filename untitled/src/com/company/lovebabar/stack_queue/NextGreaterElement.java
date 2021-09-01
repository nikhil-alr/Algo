package com.company.lovebabar.stack_queue;

import java.util.*;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String args[])
    {
        int N = 4;
        long arr[] = {1,3,2,4};
      long[] nextLargerElement = nextLargerElement(arr,N);
      System.out.print("");
    }

    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> stack = new Stack<>();

        for (int i=n-1;i>=00;i--)
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
        while (item>valueInRight&&!stack.isEmpty())
        {
            stack.pop();
            valueInRight = stack.peek();
        }
        return item<valueInRight?valueInRight:-1;
    }
}
