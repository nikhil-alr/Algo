package com.company.lovebabar.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfSubArrat {

    public static void main(String args[])
    {
        int arr[] = {2, 5, -1, 7, -3, -1, -2};
        int K = 4;
sumOfSubKArray(arr,K);
    }

    public static int sumOfSubKArray(int arar[],int k)
    {
        int ans = 0;

        Deque<Integer> gDeque = new LinkedList<>();
        Deque<Integer> sDeque = new LinkedList<>();
        gDeque.addFirst(0);
        sDeque.addFirst(0);
        int i=1;
        for (i=1;i<k;i++)
        {
            int arrayIndex = i;
            while (!gDeque.isEmpty()&&arar[gDeque.peekLast()]<arar[arrayIndex])
            {
                gDeque.pollLast();
            }

            while (!sDeque.isEmpty()&&arar[sDeque.peekLast()]>arar[arrayIndex])
            {
                sDeque.pollLast();
            }

            sDeque.addLast(arrayIndex);
            gDeque.addLast(arrayIndex);

        }

        for (;i<arar.length;i++)
        {
            int smallElement = arar[sDeque.peekFirst()];
            int greaterElement = arar[gDeque.peekFirst()];

            System.out.print("");
while (!sDeque.isEmpty()&&sDeque.peekFirst()<i-k)
    sDeque.pollFirst();

            while (!gDeque.isEmpty()&&gDeque.peekFirst()<i-k)
                gDeque.pollFirst();


            while (!gDeque.isEmpty()&&arar[gDeque.peekLast()]<arar[i])
            {
                gDeque.pollLast();
            }

            while (!sDeque.isEmpty()&&arar[sDeque.peekLast()]>arar[i])
            {
                sDeque.pollLast();
            }

            sDeque.addLast(i);
            gDeque.addLast(i);

        }

        int smallElement = arar[sDeque.peekFirst()];
        int greaterElement = arar[gDeque.peekFirst()];


        return ans;
    }
}
