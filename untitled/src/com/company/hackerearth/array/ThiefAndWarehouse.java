package com.company.hackerearth.array;

import java.util.Scanner;
import java.util.Stack;

public class ThiefAndWarehouse {

    public static void main(String args[])
    {
        System.out.print("");
        long array[] = {3,0,5,4,4,4};
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextInt();
        while (t>0)
        {
            int n = scanner.nextInt();
            array = new long[n];
            int left[] = new int[n];
int right[] = new int[n];
            for (int i=0;i<n;i++)
            {
left[i] = -1;
right[i] = n;
                array[i] = scanner.nextLong();

            }

            Stack<Integer> stack1 = new Stack<>();

            Stack<Integer> stack2 = new Stack<>();

            for (int i=0;i<left.length;i++)
            {
                while (!stack1.isEmpty()&&array[stack1.peek()]>=array[i])
                {
                    stack1.pop();
                }

                if(!stack1.isEmpty())
                    left[i] = stack1.peek();

                stack1.push(i);
            }

            for (int i= right.length-1;i>=0;i--)
            {
                while (!stack2.isEmpty()&&array[stack2.peek()]>=array[i])
                {
                    stack2.pop();
                }

                if(!stack2.isEmpty())
                    right[i] = stack2.peek();

                stack2.push(i);
            }

            long max = Integer.MIN_VALUE;
            for (int i=0;i< array.length;i++)
            {
                int lefty = left[i]+1;
                long val = array[i]*(right[i]-lefty);
                if (val>max)
                    max = val;

            }

            System.out.println(max);
            t-=1;

        }


    }


    static public void thiefAndWarehouse(long array[])
    {

       long max = array[0];

        for (int i=0;i< array.length;i++)
        {
            long val = array[i];
            for (int j=i+1;j<array.length;j++)
            {
                if(array[i]<= array[j])
                {
                    val+=array[i];
                }
            }
            for (int j=i-1;j>=0;j--)
            {
                if(array[i]<= array[j])
                {
                    val+=array[i];
                }
            }

            if (val>max)
                max = val;
        }

        System.out.print(max);

    }

}
